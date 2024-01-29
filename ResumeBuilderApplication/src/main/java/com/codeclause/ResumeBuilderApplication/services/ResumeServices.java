package com.codeclause.ResumeBuilderApplication.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codeclause.ResumeBuilderApplication.model.ResumeData;
import com.codeclause.ResumeBuilderApplication.repository.ResumeRepository;

@Service
public class ResumeServices {

	@Autowired
	ResumeRepository resumeRepository;

	public void ResumeDataSave(ResumeData resumeData) {
		resumeRepository.save(resumeData);
	}

	public ResumeData FindResumeData(String fname, String lname, String email) {
		return resumeRepository.FindResumeData(fname, lname, email);

	}

	public ResumeData AllResumeData(String email) {
		return resumeRepository.AllResumeData(email);
	}
}
