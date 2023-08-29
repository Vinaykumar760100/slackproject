package com.hospitalmanagement.Controllers;
import com.hospitalmanagement.entities.MedicalRecords;
import com.hospitalmanagement.service.MedicalRecordservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MedicalRecordController {

    @Autowired
    MedicalRecordservice medicalRecordservice;

    @GetMapping("/getallrecords")
    public List<MedicalRecords> getallrecords(){
        return medicalRecordservice.getallrecords();
    }


    @GetMapping("/rec/{id}")
    public List<MedicalRecords> recordsAll(@PathVariable("id")int id){
        return  medicalRecordservice.allRecords(id);
    }
    @PostMapping("/addrecord")
    public MedicalRecords addrecord(@RequestBody MedicalRecords medicalRecords)
    {
        return medicalRecordservice.addrecord(medicalRecords);
    }
   @DeleteMapping("/deleterecord/{recordid}")
    public void deleterecordbyid(@PathVariable("recordid") int recordid )
   {
       medicalRecordservice.deleterecord(recordid);
   }

}
