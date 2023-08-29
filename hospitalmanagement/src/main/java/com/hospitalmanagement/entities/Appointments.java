package com.hospitalmanagement.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.sql.Time;
import java.time.LocalDate;




@Entity
@Table(name="appointments")
public class Appointments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="appointment_id")
    private int appointmentid;

    @Column(name="patient_id")
    private int patientid;
    @Column(name="doctor_id")
    private int doctorid;
    @Column(name="appointment_date")
    private LocalDate appointmentdate;
    @Column(name="appointment_time")
    private Time appointmenttime;
    private String purpose;
   @ManyToOne
    @JoinColumn(name="patient_id",insertable = false,updatable = false)
   @JsonIgnore
    private Patients patients;

   @ManyToOne
    @JoinColumn(name="doctor_id",insertable = false,updatable = false)
   @JsonIgnore
    private Doctors doctors;

    public int getAppointmentid() {
        return appointmentid;
    }

    public void setAppointmentid(int appointmentid) {
        this.appointmentid = appointmentid;
    }

    public int getPatientid() {
        return patientid;
    }

    public void setPatientid(int patientid) {
        this.patientid = patientid;
    }

    public int getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(int doctorid) {
        this.doctorid = doctorid;
    }

    public LocalDate getAppointmentdate() {
        return appointmentdate;
    }

    public void setAppointmentdate(LocalDate appointmentdate) {
        this.appointmentdate = appointmentdate;
    }

    public Time getAppointmenttime() {
        return appointmenttime;
    }

    public void setAppointmenttime(Time appointmenttime) {
        this.appointmenttime = appointmenttime;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public Patients getPatients() {
        return patients;
    }

    public void setPatients(Patients patients) {
        this.patients = patients;
    }

    public Doctors getDoctors() {
        return doctors;
    }

    public void setDoctors(Doctors doctors) {
        this.doctors = doctors;
    }
}
