package com.CodeClause.NumberPlateRecognitionANPR.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.CodeClause.NumberPlateRecognitionANPR.model.CarRegistration;
import com.CodeClause.NumberPlateRecognitionANPR.model.Login;
import com.CodeClause.NumberPlateRecognitionANPR.model.Registration;
import com.CodeClause.NumberPlateRecognitionANPR.service.CarRegistrationService;
import com.CodeClause.NumberPlateRecognitionANPR.service.LoginService;
import com.CodeClause.NumberPlateRecognitionANPR.service.RegistrationService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {

	@Autowired
	RegistrationService registrationService;

	@Autowired
	CarRegistrationService carRegistrationService;

	@Autowired
	LoginService loginService;

	@RequestMapping("/")
	public String HomePage() {
		return "homepage";
	}

	@RequestMapping("/homepage")
	public String HomePageReturn() {
		return "homepage";
	}

	@RequestMapping("/registration")
	public String RegistrationPage() {
		return "registration";
	}

	@PostMapping("/registration")
	public String RegistrationPage(@RequestParam("fname") String fname, @RequestParam("yemail") String yemail,
			@RequestParam("mno") String mno, @RequestParam("add") String add, @RequestParam("district") String district,
			@RequestParam("state") String state, @RequestParam("unm") String unm, @RequestParam("pass") String pass) {

		Registration registration = new Registration();
		registration.setFullname(fname);
		registration.setEmail(yemail);
		registration.setMobileNo(mno);
		registration.setAddress(add);
		registration.setState(state);
		registration.setUsername(unm);
		registration.setPassword(pass);
		String regdate = LocalDateTime.now().toString();
		registration.setRegDate(regdate);

		registrationService.RegistrationDataSave(registration);

		return "login";
	}

	@RequestMapping("/login")
	public String LoginPage() {
		return "login";
	}

	@PostMapping("/login")
	public ModelAndView LoginPage(@RequestParam("unm") String unm, @RequestParam("pass") String pass,
			HttpServletRequest req) {

		ModelAndView mv = new ModelAndView();

		Login login = new Login();
		int id = loginService.findUsersByName(unm);
		login.setId(id);
		login.setUsername(unm);
		login.setPassword(pass);
		String logindate = LocalDateTime.now().toString();
		login.setLoginDate(logindate);

		if (login.getUsername().isBlank()) {
			mv.setViewName("login");
		}

		String list = loginService.logincheck(unm, pass);
		if (list == null || list.isBlank()) {
			mv.setViewName("registration");
		} else {
			loginService.LoginDataSave(login);
			HttpSession hs = req.getSession(true);
			String list1 = loginService.logincheck(unm, pass);
			System.out.println(list1);
			hs.setAttribute("unm", list1);
			mv.setViewName("homepage");
		}
		return mv;
	}

	@RequestMapping("/carregistration")
	public String CarRegistrationPage() {
		return "carregistration";
	}

	@PostMapping("/carregistration")
	public String CarRegistrationPage(@RequestParam("vyear") String vyear, @RequestParam("vmake") String vmake,
			@RequestParam("vmodel") String vmodel, @RequestParam("vcolour") String vcolour,
			@RequestParam("vno") String vno, @RequestParam("oname") String oname, @RequestParam("oadd") String oadd,
			@RequestParam("ocity") String ocity, @RequestParam("ostate") String ostate,
			@RequestParam("ozip") String ozip) {

		CarRegistration carRegistration = new CarRegistration();
		carRegistration.setVehicalyear(vyear);
		carRegistration.setVehicalmake(vmake);
		carRegistration.setVehicalmodel(vmodel);
		carRegistration.setVehicalcolour(vcolour);
		carRegistration.setVehicalno(vno);
		carRegistration.setOwnername(oname);
		carRegistration.setAddress(oadd);
		carRegistration.setOcity(ocity);
		carRegistration.setOstate(ostate);
		carRegistration.setOzip(ozip);
		String regdate = LocalDateTime.now().toString();
		carRegistration.setRegdate(regdate);

		carRegistrationService.CarRegistrationDataSave(carRegistration);

		return "homepage";
	}

	@RequestMapping("/findcar")
	public String findcar() {
		return "findcar";
	}

	@PostMapping("/findcar")
	public ModelAndView CarFindPage(@RequestParam("vyear") String vyear, @RequestParam("vmake") String vmake,
			@RequestParam("vmodel") String vmodel, @RequestParam("vno") String vno, HttpServletRequest req) {
		ModelAndView mv = new ModelAndView();

		CarRegistration carRegistration = carRegistrationService.CarCheck(vyear, vmodel, vmake, vno);
		HttpSession hs = req.getSession();
		System.out.println(carRegistration);
		hs.setAttribute("getcardetails", carRegistration);
		mv.setViewName("cardetails");
		return mv;
	}

}
