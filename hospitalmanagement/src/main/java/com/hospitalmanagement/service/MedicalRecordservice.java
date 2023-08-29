package com.hospitalmanagement.service;

import com.hospitalmanagement.entities.MedicalRecords;

import java.util.List;
import java.util.Optional;

public interface MedicalRecordservice {
    public List<MedicalRecords> getallrecords();

    List<MedicalRecords> allRecords(int id);

    MedicalRecords addrecord(MedicalRecords medicalRecords);

    void deleterecord(int recordid);
}
