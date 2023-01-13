package com.dentist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dentist.entity.PatientEntity;

@Repository
public interface PatientRepo extends JpaRepository<PatientEntity, Integer>  {
	PatientEntity findPatientByUserName(String name);
	PatientEntity updatePatientSetUserNameWhereId(String name,int id);
	PatientEntity  updatePatientSetPasswordWhereId(String password,int id);
	PatientEntity updatePatientSetAgeWhereId(int age,int id);
	PatientEntity updatePatientSetphoneNumberWhereId(String phoneNumber,int id);
	PatientEntity  updatePatientSetGenderWhereId(String gender,int id);
}
