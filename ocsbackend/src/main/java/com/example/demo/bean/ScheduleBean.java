package com.example.demo.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="OCS_TBL_SCHEDULES")
public class ScheduleBean {
	@Id
    private String scheduleID;
	@ManyToOne
   @JoinColumn(name="dd", referencedColumnName="doctorID")	
	private DoctorBean doctorBean;

	@Override
	public String toString() {
		return "ScheduleBean [scheduleID=" + scheduleID + ", doctorBean=" + doctorBean + ", availableDays="
				+ availableDays + ", slots=" + slots + "]";
	}
	public DoctorBean getDoctorBean() {
		return doctorBean;
	}
	public void setDoctorBean(DoctorBean doctorBean) {
		this.doctorBean = doctorBean;
	}
	public String getScheduleID() {
		return scheduleID;
	}
	public void setScheduleID(String scheduleID) {
		this.scheduleID = scheduleID;
	}

	public String getAvailableDays() {
		return availableDays;
	}
	public void setAvailableDays(String availableDays) {
		this.availableDays = availableDays;
	}
	public String getSlots() {
		return slots;
	}
	public void setSlots(String slots) {
		this.slots = slots;
	}
	@Column
	private String availableDays;
	@Column
	private String slots;
}
