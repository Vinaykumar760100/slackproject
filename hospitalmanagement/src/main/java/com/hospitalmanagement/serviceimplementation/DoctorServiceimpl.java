package com.hospitalmanagement.serviceimplementation;

import com.hospitalmanagement.entities.Doctors;
import com.hospitalmanagement.repositories.DoctorsRepository;
import com.hospitalmanagement.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
@Service
public class DoctorServiceimpl implements DoctorService {
    @Autowired
    DoctorsRepository doctorsRepository;
    public List<Doctors> getalldoctors(){
        return doctorsRepository.findAll();
    }
   //2
   public Doctors adddoctor(Doctors doctors)
   {
     return  doctorsRepository.save(doctors);
   }
   //3
   public Doctors updatedoctor(int doctorid,Doctors doctors){
              var a=doctorsRepository.findById(doctorid);
              if(a.isPresent()){
                 var b= a.get();
                 b.setDoctorname(doctors.getDoctorname());
                 b.setContactnumber(doctors.getContactnumber());
                 doctorsRepository.save(b);
                 return b;
              }
              else
                  throw new ResponseStatusException(HttpStatus.NOT_FOUND, "doctorid not found");
   }
    public void deletebydoctotid(int doctorid){
        doctorsRepository.deleteById(doctorid);
    }
}
