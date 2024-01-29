package com.CodeClause.NumberPlateRecognitionANPR.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.CodeClause.NumberPlateRecognitionANPR.model.CarRegistration;

public interface CarRegistrationRepository extends JpaRepository<CarRegistration, Integer> {

	@Query(value = "SELECT * FROM car_registration u WHERE u.vehicalyear= :vyear AND u.vehicalmodel= :vmodel AND u.vehicalmake= :vmake AND u.vehicalno= :vno ", nativeQuery = true)
	public CarRegistration CarCheck(@Param("vyear") String vyear, @Param("vmodel") String vmodel,
			@Param("vmake") String vmake, @Param("vno") String vno);
}
