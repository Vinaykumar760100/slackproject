package com.hospitalmanagement.repositories;

import com.hospitalmanagement.entities.Appointments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentsRepository extends JpaRepository<Appointments,Integer> {
}
