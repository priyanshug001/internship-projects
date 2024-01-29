package com.CodeClause.NumberPlateRecognitionANPR.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CodeClause.NumberPlateRecognitionANPR.model.CarRegistration;
import com.CodeClause.NumberPlateRecognitionANPR.repository.CarRegistrationRepository;

@Service
public class CarRegistrationService {

	@Autowired
	CarRegistrationRepository carRegistrationRepository;

	public void CarRegistrationDataSave(CarRegistration carRegistration) {
		carRegistrationRepository.save(carRegistration);
	}

	public CarRegistration CarCheck(String vyear, String vmodel, String vmake, String vno) {
		return carRegistrationRepository.CarCheck(vyear, vmodel, vmake, vno);
	}
}
