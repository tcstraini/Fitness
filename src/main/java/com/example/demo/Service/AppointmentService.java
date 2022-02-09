package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.AppointmentRepository;
import com.example.demo.Entity.Appointment;

@Service
public class AppointmentService {
	@Autowired
	AppointmentRepository appointmentRepository;

	public void saveContact(Appointment appointment) {
		appointmentRepository.save(appointment);

	}

	public Iterable<Appointment> getAppointment() {

		return appointmentRepository.findAll();
	}

}