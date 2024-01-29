package com.CodeClause.NumberPlateRecognitionANPR.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CodeClause.NumberPlateRecognitionANPR.model.Login;
import com.CodeClause.NumberPlateRecognitionANPR.repository.LoginRepository;

@Service
public class LoginService {

	@Autowired
	LoginRepository loginRepository;

	public void LoginDataSave(Login login) {
		loginRepository.save(login);
	}

	public int findUsersByName(String fname) {
		return loginRepository.findUsersByName(fname);
	}

	public String logincheck(String unm, String pass) {
		return loginRepository.LoginCheck(unm, pass);
	}
	
	public Login FindAllLoginData(String unm) {
		return loginRepository.FindAllLoginData(unm);
	}
}
