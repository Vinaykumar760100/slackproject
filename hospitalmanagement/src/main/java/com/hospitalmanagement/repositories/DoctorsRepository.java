package com.hospitalmanagement.repositories;

import com.hospitalmanagement.entities.Doctors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorsRepository extends JpaRepository<Doctors,Integer> {
}
