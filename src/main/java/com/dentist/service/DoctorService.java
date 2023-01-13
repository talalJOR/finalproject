package com.dentist.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dentist.entity.DoctorEntity;
import com.dentist.pojo.Result;
import com.dentist.repository.DoctorRepo;

@Service
public class DoctorService {
	@Autowired
	DoctorRepo doctorrepo;
	

	public Result UpdateDoctorProfile(DoctorEntity doctor) {
		Result result = new Result();
		Map<String, Object> mapResult = new HashMap<>();
		if (doctor.getUserName() == null || doctor.getUserName().isEmpty()) {
			result.setStatus("Failed");
			mapResult.put("NameEntity", "Cannot Send Name Entity Empty");
			result.setResultMap(mapResult);
			return result;
		}
		if (doctor.getId() != null) {
			if (doctor.getId() < 0)
				result.setStatus("Failed");
			mapResult.put("Id", "Cannot Send Id negative");
			result.setResultMap(mapResult);
			return result;
		}
	     doctor.setPassword(doctor.getPassword());
	        doctor.setDname(doctor.getDname());
	        doctor.setSpecialty(doctor.getSpecialty());
	        doctor.setPhoneNumber(doctor.getPhoneNumber());
		doctorrepo.save(doctor);

		result.setStatus("successful.");
		result.setResultMap(mapResult);
		return result;

	}
	public Result addOrUpdatedoctor(DoctorEntity doctor) {
		Result result = new Result();
		Map<String, Object> mapResult = new HashMap<>();
		if (doctor.getUserName() == null || doctor.getUserName().isEmpty()) {
			result.setStatus("Failed");
			mapResult.put("NameEntity", "Cannot Send Name Entity Empty");
			result.setResultMap(mapResult);
			return result;
		}
		if (doctor.getId() != null) {
			if (doctor.getId() < 0)
				result.setStatus("Failed");
			mapResult.put("Id", "Cannot Send Id negative");
			result.setResultMap(mapResult);
			return result;
		}
		doctorrepo.save(doctor);

		result.setStatus("successful.");
		result.setResultMap(mapResult);
		return result;

	}


	public Result updateDoctorSetUserNameWhereId(DoctorEntity doctor) {
		Result result = new Result();
		Map<String, Object> mapResult = new HashMap<>();
		if (doctor.getUserName() == null || doctor.getUserName().isEmpty()) {
			result.setStatus("Failed");
			mapResult.put("NameEntity", "Cannot Send Name Entity Empty");
			result.setResultMap(mapResult);
			return result;
		}
		if (doctor.getId() != null) {
			if (doctor.getId() < 0)
				result.setStatus("Failed");
			mapResult.put("Id", "Cannot Send Id negative");
			result.setResultMap(mapResult);
			return result;
		}
		doctorrepo.updateDoctorSetUserNameWhereId(doctor.getUserName(), doctor.getId());
		result.setStatus("successful.");
		result.setResultMap(mapResult);
		return result;

	}

	public Result updateDoctorSetPasswordWhereId(DoctorEntity doctor) {
		Result result = new Result();
		Map<String, Object> mapResult = new HashMap<>();
		if (doctor.getUserName() == null || doctor.getUserName().isEmpty()) {
			result.setStatus("Failed");
			mapResult.put("NameEntity", "Cannot Send Name Entity Empty");
			result.setResultMap(mapResult);
			return result;
		}
		if (doctor.getId() != null) {
			if (doctor.getId() < 0)
				result.setStatus("Failed");
			mapResult.put("Id", "Cannot Send Id negative");
			result.setResultMap(mapResult);
			return result;
		}
		doctorrepo.updateDoctorSetPasswordWhereId(doctor.getPassword(), doctor.getId());
		result.setStatus("successful.");
		result.setResultMap(mapResult);
		return result;

	}

	public Result updateDoctorSetNationalIdWhereId(DoctorEntity doctor) {
		Result result = new Result();
		Map<String, Object> mapResult = new HashMap<>();
		if (doctor.getUserName() == null || doctor.getUserName().isEmpty()) {
			result.setStatus("Failed");
			mapResult.put("NameEntity", "Cannot Send Name Entity Empty");
			result.setResultMap(mapResult);
			return result;
		}
		if (doctor.getId() != null) {
			if (doctor.getId() < 0)
				result.setStatus("Failed");
			mapResult.put("Id", "Cannot Send Id negative");
			result.setResultMap(mapResult);
			return result;
		}
		doctorrepo.updateDoctorSetNationalIdWhereId(doctor.getNationalID(), doctor.getId());
		result.setStatus("successful.");
		result.setResultMap(mapResult);
		return result;

	}

	public Result updateDoctorSetSpecialtyWhereId(DoctorEntity doctor) {
		Result result = new Result();
		Map<String, Object> mapResult = new HashMap<>();
		if (doctor.getUserName() == null || doctor.getUserName().isEmpty()) {
			result.setStatus("Failed");
			mapResult.put("NameEntity", "Cannot Send Name Entity Empty");
			result.setResultMap(mapResult);
			return result;
		}
		if (doctor.getId() != null) {
			if (doctor.getId() < 0)
				result.setStatus("Failed");
			mapResult.put("Id", "Cannot Send Id negative");
			result.setResultMap(mapResult);
			return result;
		}
		doctorrepo.updateDoctorSetSpecialtyWhereId(doctor.getSpecialty(), doctor.getId());
		result.setStatus("successful.");
		result.setResultMap(mapResult);
		return result;

	}

	public Result updateDoctorSetPhoneNumberWhereId(DoctorEntity doctor) {
		Result result = new Result();
		Map<String, Object> mapResult = new HashMap<>();
		if (doctor.getUserName() == null || doctor.getUserName().isEmpty()) {
			result.setStatus("Failed");
			mapResult.put("NameEntity", "Cannot Send Name Entity Empty");
			result.setResultMap(mapResult);
			return result;
		}
		if (doctor.getId() != null) {
			if (doctor.getId() < 0)
				result.setStatus("Failed");
			mapResult.put("Id", "Cannot Send Id negative");
			result.setResultMap(mapResult);
			return result;
		}
		doctorrepo.updateDoctorSetPhoneNumberWhereId(doctor.getPhoneNumber(), doctor.getId());
		result.setStatus("successful.");
		result.setResultMap(mapResult);
		return result;
	}

	public List<DoctorEntity> findallDoctor() {
		return doctorrepo.findAll();

	}
}
