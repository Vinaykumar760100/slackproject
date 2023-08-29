package com.hospitalmanagement.serviceimplementation;

import com.hospitalmanagement.entities.MedicalRecords;
import com.hospitalmanagement.repositories.MedicalRecordRepository;
import com.hospitalmanagement.service.MedicalRecordservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicalRecordServiceimpl implements MedicalRecordservice {
    @Autowired
    MedicalRecordRepository medicalRecordRepository;

    public List<MedicalRecords> getallrecords(){
        return medicalRecordRepository.findAll();
    }

    @Override
    public List<MedicalRecords> allRecords(int id) {
        return medicalRecordRepository.findBypatientid(id);
    }

    @Override
    public MedicalRecords addrecord(MedicalRecords medicalRecords) {
        return medicalRecordRepository.save(medicalRecords);
    }

    @Override
    public void deleterecord(int recordid) {
        medicalRecordRepository.deleteById(recordid);
    }

}
