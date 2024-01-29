package com.codeclause.ResumeBuilderApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeclause.ResumeBuilderApplication.model.RegistrationData;

public interface RegistrationRepository extends JpaRepository<RegistrationData, Integer> {

}
