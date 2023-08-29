package com.hospitalmanagement.service;

import com.hospitalmanagement.entities.Appointments;

import java.util.List;

public interface AppointmentService {
    public List<Appointments> getallappointments();
    public Appointments addappoinntment(Appointments appointments);

    Appointments updateappointment(int appointmentid, Appointments appointments);

   public void deleteappointment(int appointmentid);
}
