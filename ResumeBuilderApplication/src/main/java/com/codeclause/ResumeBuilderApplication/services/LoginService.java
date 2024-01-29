package com.codeclause.ResumeBuilderApplication.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codeclause.ResumeBuilderApplication.model.LoginData;
import com.codeclause.ResumeBuilderApplication.repository.LoginRepository;

@Service
public class LoginService {

	@Autowired
	LoginRepository loginRepository;

	public void saveLoginData(LoginData loginData) {
		loginRepository.save(loginData);
	}

	public int findUsersByName(String name) {
		return loginRepository.findUsersByName(name);
	}

	public List GetLoginData() {
		return loginRepository.findAll();
	}

	public LoginData LoginCheck(String unm, String pass) {
		return loginRepository.LoginCheck(unm, pass);
	}
}
