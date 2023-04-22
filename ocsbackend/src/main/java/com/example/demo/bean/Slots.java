package com.example.demo.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="OCS_TBL_SLOTS")
public class Slots {
	@Id
 private int slotNumber;
	@Column
 private String duration;
	@Override
	public String toString() {
		return "Slots [slotNumber=" + slotNumber + ", duration=" + duration + "]";
	}
	public int getSlotNumber() {
		return slotNumber;
	}
	public void setSlotNumber(int slotNumber) {
		this.slotNumber = slotNumber;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
}
