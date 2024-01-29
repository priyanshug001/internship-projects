package com.codeclause.ResumeBuilderApplication.controller;

import java.io.ByteArrayInputStream;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.codeclause.ResumeBuilderApplication.model.LoginData;
import com.codeclause.ResumeBuilderApplication.model.RegistrationData;
import com.codeclause.ResumeBuilderApplication.model.ResumeData;
import com.codeclause.ResumeBuilderApplication.services.LoginService;
import com.codeclause.ResumeBuilderApplication.services.PdfService;
import com.codeclause.ResumeBuilderApplication.services.RegistrationService;
import com.codeclause.ResumeBuilderApplication.services.ResumeServices;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class ResumeBuilderController {

	@Autowired
	ResumeServices resumeServices;

	@Autowired
	PdfService pdfService;

	@Autowired
	LoginService loginService;

	@Autowired
	RegistrationService registrationService;

	@RequestMapping("/")
	public String resumeindex() {
		return "resume";
	}

	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	@PostMapping("/login")
	public ModelAndView loginpage(@RequestParam("unm") String unm, @RequestParam("pass") String pass,
			HttpServletRequest req) {
		ModelAndView modelAndView = new ModelAndView();
		LoginData ld = new LoginData();
		ld.setUnm(unm);
		ld.setPass(pass);
		String dt = LocalDateTime.now().toString();
		ld.setUdate(dt);
		int x = loginService.findUsersByName(unm);
		ld.setUid(x);
		if (ld.getUnm().isBlank()) {
			modelAndView.setViewName("login");
		}

		LoginData list = loginService.LoginCheck(unm, pass);
		if (list == null) {
			modelAndView.setViewName("registration");
		} else {
			loginService.saveLoginData(ld);
			LoginData ld1 = loginService.LoginCheck(unm, pass);
			String uname = (String) ld1.getUnm();
			System.out.println(ld1.getUnm());
			HttpSession hs = req.getSession(true);
			hs.setAttribute("unm", uname);

			modelAndView.setViewName("resume");
		}
		return modelAndView;
	}

	@RequestMapping("/registration")
	public String registration() {
		return "registration";
	}

	@PostMapping("/registration")
	public String registrationpage(@RequestParam("fname") String fnm, @RequestParam("add") String add,
			@RequestParam("city") String city, @RequestParam("mob") String mob, @RequestParam("email") String email,
			@RequestParam("unm") String unm, @RequestParam("pass") String pass) {

		RegistrationData registrationData = new RegistrationData();
		registrationData.setUname(fnm);
		registrationData.setUadd(add);
		registrationData.setUcity(city);
		registrationData.setUemail(email);
		registrationData.setUmob(mob);
		registrationData.setUnm(unm);
		registrationData.setPass(pass);
		String dt = LocalDateTime.now().toString();
		registrationData.setUdate(dt);

		registrationService.createuser(registrationData);
		return "registration";
	}

	@RequestMapping("/resumesetup")
	public String resumesetup() {
		return "resumesetup";
	}

	@PostMapping("/resumesetup")
	public void resumesetuppage(@RequestParam("fname") String fname, @RequestParam("lname") String lname,
			@RequestParam("rehead") String rehead, @RequestParam("resumry") String resumry,
			@RequestParam("add") String add, @RequestParam("pcode") String pcode, @RequestParam("nat") String nat,
			@RequestParam("dob") String dob, @RequestParam("mno") String mno, @RequestParam("eml") String eml,
			@RequestParam("cus") String cus, @RequestParam("eop") String eop, @RequestParam("cc") String cc,
			@RequestParam("pstg") String pstg, @RequestParam("skills1") String skills1,
			@RequestParam("skills2") String skills2, @RequestParam("skills3") String skills3,
			@RequestParam("skills4") String skills4, @RequestParam("allskills") String allskills,
			@RequestParam("cnm") String cnm, @RequestParam("wrdn") String wrdn, @RequestParam("cnm2") String cnm2,
			@RequestParam("wrdn2") String wrdn2) {

		ResumeData resumeData = new ResumeData();
		resumeData.setFirstname(fname);
		resumeData.setLastname(lname);
		resumeData.setRehead(rehead);
		resumeData.setResumry(resumry);
		resumeData.setAddress(add);
		resumeData.setNationality(nat);
		resumeData.setPostalcode(pcode);
		resumeData.setDateofbirth(dob);
		resumeData.setMobile(mno);
		resumeData.setEmail(eml);
		resumeData.setClguniv(cus);
		resumeData.setPassingyear(eop);
		resumeData.setClasscourse(cc);
		resumeData.setPercentage(pstg);
		resumeData.setSkills1(skills1);
		resumeData.setSkills2(skills2);
		resumeData.setSkills3(skills3);
		resumeData.setSkills4(skills4);
		resumeData.setAllskills(allskills);
		resumeData.setCompanyname(cnm);
		resumeData.setWorkdone(wrdn);
		resumeData.setCompanyname2(cnm2);
		resumeData.setWorkdone2(wrdn2);
		String dt = LocalDateTime.now().toString();
		resumeData.setDateandtime(dt);

		resumeServices.ResumeDataSave(resumeData);
	}

	@PostMapping("/existdata")
	public ModelAndView existresumedata(@RequestParam("fname") String fname, @RequestParam("lname") String lname,
			@RequestParam("email") String email, HttpServletRequest req) {
		ModelAndView mv = new ModelAndView();
		ResumeData rd = resumeServices.FindResumeData(fname, lname, email);
		System.out.println(rd);

		HttpSession hs = req.getSession();
		hs.setAttribute("alldata", rd);
		mv.setViewName("existresume");
		return mv;
	}

	@RequestMapping("/resumedownload/{email}")
	public ResponseEntity<InputStreamResource> resumedownload(@PathVariable String email) {
System.out.println(email);
		ResumeData rd = resumeServices.AllResumeData(email);
		System.out.println(rd.getResumry());

		ByteArrayInputStream inputStream = pdfService.ResumeDownload(rd);
		HttpHeaders httpHeader = new HttpHeaders();

		httpHeader.add("Content-Disposition", "inLine;file=priyanshu.pdf");

		return ResponseEntity.ok() 
				.headers(httpHeader) 
				.contentType(MediaType.APPLICATION_PDF) 
				.body(new InputStreamResource(inputStream));
	}
}
