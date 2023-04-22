package com.example.demo.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="OCS_TBL_APPOINTMENTS")
public class AppointmentBean {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String appointmentID;
	@Override
	public String toString() {
		return "AppointmentBean [appointmentID=" + appointmentID + ", doctorBean=" + doctorBean + ", patientBean="
				+ patientBean + ", appointmentDate=" + appointmentDate + ", appointmentTime=" + appointmentTime + "]";
	}
	@ManyToOne
	@JoinColumn(name="doctorapp", referencedColumnName="doctorID")
	private DoctorBean doctorBean;
	
	@ManyToOne
	@JoinColumn(name="doctorpat" , referencedColumnName="patientID")
	private PatientBean patientBean;
	@Column
	private int appointmentDate;
	@Column
	private String appointmentTime;
	public String getAppointmentID() {
		return appointmentID;
	}
	public void setAppointmentID(String appointmentID) {
		this.appointmentID = appointmentID;
	}
	public DoctorBean getDoctorBean() {
		return doctorBean;
	}
	public void setDoctorBean(DoctorBean doctorBean) {
		this.doctorBean = doctorBean;
	}
	public PatientBean getPatientBean() {
		return patientBean;
	}
	public void setPatientBean(PatientBean patientBean) {
		this.patientBean = patientBean;
	}
	public int getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(int appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public String getAppointmentTime() {
		return appointmentTime;
	}
	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}

}
