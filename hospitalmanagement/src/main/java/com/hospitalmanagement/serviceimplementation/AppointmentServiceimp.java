package com.hospitalmanagement.serviceimplementation;

import com.hospitalmanagement.entities.Appointments;
import com.hospitalmanagement.entities.Doctors;
import com.hospitalmanagement.entities.Patients;
import com.hospitalmanagement.repositories.AppointmentsRepository;
import com.hospitalmanagement.repositories.DoctorsRepository;
import com.hospitalmanagement.repositories.PatientRepository;
import com.hospitalmanagement.service.AppointmentService;
import jakarta.persistence.EntityNotFoundException;
import org.hibernate.annotations.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class AppointmentServiceimp implements AppointmentService {
    @Autowired
    AppointmentsRepository appointmentsrepository;
    @Autowired
    PatientRepository patientRepository;
    @Autowired
    DoctorsRepository doctorsRepository;

    public List<Appointments> getallappointments() {
        return appointmentsrepository.findAll();
    }
    //2
    public Appointments addappoinntment(Appointments appointments){
            if (appointments != null) {

                Patients pobj = patientRepository.findById(appointments.getPatientid()).get();
                Doctors dobj = doctorsRepository.findById(appointments.getDoctorid()).get();

                if (pobj != null && dobj != null) {
                    if (appointments.getDoctorid() == dobj.getDoctorid() && appointments.getPatientid() == pobj.getPatientid()) {
                        appointmentsrepository.save(appointments);
                        return appointments;
                    } else {
                        throw new NoSuchElementException("patientid and doctorid is not available");
                    }
                } else {
                    throw new  ResponseStatusException(HttpStatus.NOT_FOUND,"null");
                }
            } else {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "check the data and re-enter");
            }
        }

    @Override
    public Appointments updateappointment(int appointmentid, Appointments appointments) {
        var a=appointmentsrepository.findById(appointmentid);
        if(a.isPresent())
        {
              var b= a.get();
              b.setAppointmentdate(appointments.getAppointmentdate());
              b.setAppointmenttime(appointments.getAppointmenttime());
              appointmentsrepository.save(b);
              return b;
        }
        else
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"appointmentid not found");
    }

    @Override
    public void deleteappointment(int appointmentid) {
        appointmentsrepository.deleteById(appointmentid);
    }
}