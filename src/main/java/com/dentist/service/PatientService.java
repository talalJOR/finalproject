package com.dentist.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.dentist.entity.PatientEntity;
import com.dentist.pojo.Result;
import com.dentist.repository.PatientRepo;

public class PatientService {
@Autowired
private PatientRepo patientrepo;
public Result addOrUpdatePatient (PatientEntity patient) {
	Result result = new Result();
	Map<String, Object> mapResult = new HashMap<>();
	if (patient.getUserName() == null || patient.getUserName().isEmpty()) {
		result.setStatus("Failed");
		mapResult.put("NameEntity", "Cannot Send Name Entity Empty");
		result.setResultMap(mapResult);
		return result;
	}
	if (patient.getId() != null) {
		if (patient.getId() < 0)
			result.setStatus("Failed");
		mapResult.put("Id", "Cannot Send Id negative");
		result.setResultMap(mapResult);
		return result;
	}
	patientrepo.save(patient);
	result.setStatus("successful");
	result.setResultMap(mapResult);
	return result;
	

}
public Result UpdatePatientProfile (PatientEntity patient) {
	Result result = new Result();
	Map<String, Object> mapResult = new HashMap<>();
	if (patient.getUserName() == null || patient.getUserName().isEmpty()) {
		result.setStatus("Failed");
		mapResult.put("NameEntity", "Cannot Send Name Entity Empty");
		result.setResultMap(mapResult);
		return result;
	}
	if (patient.getId() != null) {
		if (patient.getId() < 0)
			result.setStatus("Failed");
		mapResult.put("Id", "Cannot Send Id negative");
		result.setResultMap(mapResult);
		return result;
	}
	patient.setPassword(patient.getPassword());
	patient.setName(patient.getName());
	patient.setGender(patient.getGender());
	patient.setPhoneNumber(patient.getPhoneNumber());
	patientrepo.save(patient);
	result.setStatus("successful");
	
	result.setResultMap(mapResult);
	return result;
	

}
public Result updatePatientSetUserNameWhereId(PatientEntity patient) {
	Result result = new Result();
	Map<String, Object> mapResult = new HashMap<>();
	if (patient.getUserName() == null || patient.getUserName().isEmpty()) {
		result.setStatus("Failed");
		mapResult.put("NameEntity", "Cannot Send Name Entity Empty");
		result.setResultMap(mapResult);
		return result;
	}
	if (patient.getId() != null) {
		if (patient.getId() < 0)
			result.setStatus("Failed");
		mapResult.put("Id", "Cannot Send Id negative");
		result.setResultMap(mapResult);
		return result;
	}
	patientrepo.updatePatientSetphoneNumberWhereId(patient.getPhoneNumber(), patient.getId());
	result.setStatus("successful");
	result.setResultMap(mapResult);
	return result;
	

}

public List<PatientEntity> findallPatient() {
return patientrepo.findAll();
	
}
}
