package com.hospitalmanagement.repositories;

import com.hospitalmanagement.entities.Patients;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patients,Integer> {
}
