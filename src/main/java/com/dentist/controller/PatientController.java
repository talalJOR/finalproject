package com.dentist.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dentist.entity.PatientEntity;
import com.dentist.pojo.Result;
import com.dentist.service.PatientService;
import com.dentist.utility.TokenUtility;


@RestController
@RequestMapping("/patient")
public class PatientController {
	@Autowired
	PatientService service;
	@Autowired
	TokenUtility tokenUtility;
	
	@PostMapping("/addPatient")
	public Result addpatient(HttpServletRequest request, HttpServletResponse response ,@RequestBody @Valid PatientEntity patient) {
		Result result = tokenUtility.checkToken(request.getHeader("token"));
		if (result.getStatus().equalsIgnoreCase("Succ")) {
			return service.addOrUpdatePatient(patient);
		} else {
			return result;
		}
	}
	@PutMapping("/updatePatient")
	public Result updatePatient(HttpServletRequest request, HttpServletResponse response ,@RequestBody PatientEntity patient,@RequestBody Integer patientId) {
		Result result = tokenUtility.checkToken(request.getHeader("token"));
		if (result.getStatus().equalsIgnoreCase("Succ")) {
			return service.UpdatePatientProfile(patient);
		} else {
			return result;
		}
	}



@GetMapping("/findAllPatient")
public List<PatientEntity>findAllPatient(){
	return service.findallPatient();
}

}
