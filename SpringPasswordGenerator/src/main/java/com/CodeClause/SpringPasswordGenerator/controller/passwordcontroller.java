package com.CodeClause.SpringPasswordGenerator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.CodeClause.SpringPasswordGenerator.service.PasswordService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class passwordcontroller {

	@Autowired
	private PasswordService passwordService;

	String password;

	@RequestMapping("/")
	public String passwordgenerate() {
		return "passwordgenerator";
	}

	@PostMapping("/passwordgenerator")
	public String passwordgenerator(@RequestParam("unm") String unm, HttpServletRequest req) {
		password = passwordService.GeneratePassword().toString();
		HttpSession hs = req.getSession();
		hs.setAttribute("unm", unm);
		hs.setAttribute("password", password);
		return "showpass";
	}
}
