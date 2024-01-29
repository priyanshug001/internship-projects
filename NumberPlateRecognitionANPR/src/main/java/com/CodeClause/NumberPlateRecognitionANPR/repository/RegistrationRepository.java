package com.CodeClause.NumberPlateRecognitionANPR.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CodeClause.NumberPlateRecognitionANPR.model.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Integer> {

	
}
