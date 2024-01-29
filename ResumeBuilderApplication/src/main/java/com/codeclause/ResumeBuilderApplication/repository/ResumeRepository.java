package com.codeclause.ResumeBuilderApplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.codeclause.ResumeBuilderApplication.model.ResumeData;

public interface ResumeRepository extends JpaRepository<ResumeData, Integer> {

	@Query(value = "SELECT * FROM resume_data u WHERE u.firstname= :fname AND u.lastname= :lname AND u.email = :email", nativeQuery = true)
	public ResumeData FindResumeData(@Param("fname") String fname, @Param("lname") String lname,
			@Param("email") String email);

	@Query(value = "SELECT * FROM resume_data u WHERE u.email = :email", nativeQuery = true)
	public ResumeData AllResumeData(@Param("email")String email);
}
