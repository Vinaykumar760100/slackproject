package com.hospitalmanagement.service;

import com.hospitalmanagement.entities.Patients;

import java.util.List;

public interface PatientService {
    public List<Patients> getall();
    public Patients addpatient(Patients patients);

    public Patients updatepatientsdata(int patientid,Patients patients);

    public void deletepatientbyid(int patientid);
}
