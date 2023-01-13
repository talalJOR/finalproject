package com.dentist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dentist.entity.DoctorEntity;




@Repository
public interface DoctorRepo extends JpaRepository<DoctorEntity, Integer> {
	DoctorEntity findDoctorByUserName(String name);
	DoctorEntity updateDoctorSetUserNameWhereId(String name,int id);
	DoctorEntity  updateDoctorSetPasswordWhereId(String password,int id);
	DoctorEntity updateDoctorSetNationalIdWhereId(int nationalID,int id);
	DoctorEntity  updateDoctorSetSpecialtyWhereId(String specialty,int id);
	DoctorEntity updateDoctorSetPhoneNumberWhereId(String phoneNumber,int id );
	
}
//❖ The Doctor Can Update Profile: The doctors can update their profile with their password, name, and their national ID, specialty, and phone number.
