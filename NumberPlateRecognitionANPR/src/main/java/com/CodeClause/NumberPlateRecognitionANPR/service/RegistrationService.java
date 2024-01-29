package com.CodeClause.NumberPlateRecognitionANPR.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CodeClause.NumberPlateRecognitionANPR.model.Registration;
import com.CodeClause.NumberPlateRecognitionANPR.repository.RegistrationRepository;

@Service
public class RegistrationService {

	@Autowired
	RegistrationRepository registrationRepository;

	public void RegistrationDataSave(Registration registration) {
		registrationRepository.save(registration);		
	}
}
