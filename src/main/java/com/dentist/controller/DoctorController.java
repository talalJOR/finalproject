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

import com.dentist.entity.DoctorEntity;
import com.dentist.pojo.Result;
import com.dentist.service.DoctorService;
import com.dentist.utility.TokenUtility;



@RestController
@RequestMapping("/Doctor")
public class DoctorController {
	@Autowired
	private DoctorService service;
	@Autowired
	TokenUtility tolenUtility;
	

	@PostMapping("/addDoctor")
	public Result addDoctor(HttpServletRequest request, HttpServletResponse response,
			@Valid @RequestBody DoctorEntity doctor) {
		Result result = tolenUtility.checkToken(request.getHeader("token"));
		if (result.getStatus().equalsIgnoreCase("Succ")) {
			return service.addOrUpdatedoctor(doctor);
		} else {
			return result;
		}

	}

	@PutMapping("/updateDoctor")
	public Result updateDoctor(HttpServletRequest request, HttpServletResponse response,
			@RequestBody DoctorEntity doctor) {
		Result result = tolenUtility.checkToken(request.getHeader("token"));
		if (result.getStatus().equalsIgnoreCase("Succ")) {
			return service.UpdateDoctorProfile(doctor);
		} else {
			return result;
		}

	}


}
