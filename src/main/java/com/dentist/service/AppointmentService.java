package com.dentist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dentist.entity.AppointmentEntity;
import com.dentist.repository.Appointment;

@Service
public class AppointmentService {
@Autowired 
private Appointment  appointmentrepo;

public boolean addOrUpdateDoctor (AppointmentEntity appointment) {
	if(appointment.equals(appointment)||doctor.getDname().isEmpty()) {
		return false;
}
	;
	return true;
	
}
public boolean deleteDoctorById (Integer id) {
	if(id==null||id<0) {
		return false;
}
	doctorrepo.deleteById(id);
	return true;
	
}
public DoctorEntity  findDoctorById(Integer id) {
	if(id==null||id<0) {
		return null;
}
	return doctorrepo.findById(id).orElse(null);
	
}

public DoctorEntity  findDoctorByName(String name) {
	if(name==null||name.isEmpty()) {
		return new DoctorEntity();
		}return doctorrepo.findDoctorByUserName(name);
	
}
public DoctorEntity  findDoctorBySpecialty(String specialty) {
	if(specialty==null||specialty.isEmpty()) {
		return new DoctorEntity();
	}
	return doctorrepo.findDoctorBySpecialty(specialty);
}

public DoctorEntity  findDoctorByphonenumber(String num) {
	if(num==null||num.isEmpty()||num.length()<10) {
		return new DoctorEntity();
	}
	return doctorrepo.findDoctorByPhoneNumber(num);
}
public List<DoctorEntity> findallDoctor() {
return doctorrepo.findAll();
	
}
}
