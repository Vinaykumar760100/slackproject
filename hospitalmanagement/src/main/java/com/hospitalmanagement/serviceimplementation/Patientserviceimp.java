package com.hospitalmanagement.serviceimplementation;

import com.hospitalmanagement.entities.Patients;
import com.hospitalmanagement.repositories.PatientRepository;
import com.hospitalmanagement.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class Patientserviceimp implements PatientService {
    @Autowired
    PatientRepository patientRepository;
  //1
    public List<Patients> getall() {
        return patientRepository.findAll();
    }
  //2
    public Patients addpatient(Patients patients) {
        return patientRepository.save(patients);
    }
  //3
    public Patients updatepatientsdata(int patientid, Patients patients) {
        var a = patientRepository.findById(patientid);
        if (a.isPresent()) {
            var b = a.get();
            b.setName(patients.getName());
            b.setAddress(patients.getAddress());
            b.setNumber(patients.getNumber());
            patientRepository.save(b);
            return b;
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "patientid not found");
        }
    }
    //3
    public void deletepatientbyid(int patientid){
          patientRepository.deleteById(patientid);
    }
}
