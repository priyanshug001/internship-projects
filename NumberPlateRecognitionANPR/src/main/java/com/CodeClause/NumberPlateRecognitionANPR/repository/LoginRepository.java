package com.CodeClause.NumberPlateRecognitionANPR.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.CodeClause.NumberPlateRecognitionANPR.model.Login;

public interface LoginRepository extends JpaRepository<Login, Integer> {

	@Query(value = "SELECT id FROM registration u WHERE u.username = :name", nativeQuery = true)
	public int findUsersByName(@Param("name") String name);

	@Query(value = "SELECT fullname FROM registration u WHERE u.username = :unm AND u.password = :pass", nativeQuery = true)
	public String LoginCheck(@Param("unm") String unm, @Param("pass") String pass);

	@Query(value = "SELECT * FROM registration WHERE u.username= :unm", nativeQuery = true)
	public Login FindAllLoginData(@Param("unm") String unm);
}
