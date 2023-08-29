package com.hospitalmanagement.service;

import com.hospitalmanagement.entities.Doctors;
import org.springframework.stereotype.Service;

import java.util.List;
public interface DoctorService {
    public List<Doctors> getalldoctors();
    public Doctors adddoctor(Doctors doctors);
    public Doctors updatedoctor(int doctorid,Doctors doctors);
    public void deletebydoctotid(int doctorid);
}
