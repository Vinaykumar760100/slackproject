package com.hospitalmanagement.Controllers;

import com.hospitalmanagement.entities.Doctors;
import com.hospitalmanagement.repositories.DoctorsRepository;
import com.hospitalmanagement.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DoctorController {
    @Autowired
    DoctorService doctorService;
    @GetMapping("getalldoctors")
    public List<Doctors> getalldoctors()
    {
        return doctorService.getalldoctors();
    }
    @PostMapping("/adddoctor")
    public Doctors adddoctor(@RequestBody Doctors doctors)
    {
        return doctorService.adddoctor(doctors);
    }
    @PutMapping("/updatedoctor/{doctorid}")
    public Doctors updatedoctor(@PathVariable("doctorid") int doctorid,@RequestBody Doctors doctors)
    {
        return doctorService.updatedoctor(doctorid,doctors);
    }
    @DeleteMapping("deletedoctordata/{doctorid}")
    public void deletedoctotdata(@PathVariable("doctorid") int doctorid)
    {
        doctorService.deletebydoctotid(doctorid);
    }

}
