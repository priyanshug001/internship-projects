package com.codeclause.ResumeBuilderApplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.codeclause.ResumeBuilderApplication.model.LoginData;

public interface LoginRepository extends JpaRepository<LoginData, String> {
	@Query(value = "SELECT uid FROM registration_data u WHERE u.unm = :name", nativeQuery = true)
	public int findUsersByName(@Param("name") String name);

	@Query(value = "SELECT * FROM registration_data u WHERE u.unm = :unm AND u.pass = :pass", nativeQuery = true)
	public LoginData LoginCheck(@Param("unm") String unm, @Param("pass") String pass);
}
