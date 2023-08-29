package com.hospitalmanagement.repositories;

import com.hospitalmanagement.entities.MedicalRecords;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MedicalRecordRepository extends JpaRepository<MedicalRecords,Integer> {


    List<MedicalRecords> findBypatientid(int id);

   public void deleteById(int recordid);

}
