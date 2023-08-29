package com.hospitalmanagement.Controllers;

import com.hospitalmanagement.entities.Appointments;
import com.hospitalmanagement.repositories.AppointmentsRepository;
import com.hospitalmanagement.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AppoinmentControoler {
 @Autowired
    AppointmentService appointmentService;
  @GetMapping("/getallappointments")
    public List<Appointments> getallappointments() {
      return appointmentService.getallappointments();
  }
  @PostMapping("/addappointment")
    public Appointments addappointment(@RequestBody Appointments appointments)
  {
      return appointmentService.addappoinntment(appointments);
  }
  @PutMapping("updateappoinment/{appointmentid}")
    public Appointments updateappoinement(@PathVariable("appointmentid") int appointmentid,@RequestBody Appointments appointments)
  {
            return appointmentService.updateappointment(appointmentid,appointments);
  }
  @DeleteMapping("/deleteappointment/{appointment}")
    public void deleteappointment(@PathVariable("appointmentid") int appointmentid)
  {
      appointmentService.deleteappointment(appointmentid);
  }

}
