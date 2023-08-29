package com.hospitalmanagement.Controllers;


import com.hospitalmanagement.entities.Patients;
import com.hospitalmanagement.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class PatientControler {

    @Autowired
    PatientService patientService;
  //1
    @GetMapping("/getallpatients")
    public List<Patients> getallpatients()
    {
        return patientService.getall();
    }
    //2
    @PostMapping("addpatient")
    public Patients addpatient(@RequestBody Patients patients)
    {
        return patientService.addpatient(patients);
    }
    //3
   @PutMapping("/updatepatientdata/{patientid}")
    public Patients updatepatientdata(@PathVariable("patientid") int patientid,@RequestBody Patients patients)
   {
       return patientService.updatepatientsdata(patientid,patients);
   }
   //4
   @DeleteMapping("/delete/{patientid}")
    public void deletepatientbyid(@PathVariable("patientid") int patientid)
   {
       patientService.deletepatientbyid(patientid);
   }
}

