package com.dentist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dentist.entity.AppointmentEntity;

public interface Appointment extends JpaRepository<AppointmentEntity, Integer> {

}
