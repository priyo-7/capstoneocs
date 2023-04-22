package com.example.demo.bean;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="OCS_TBL_USER_CREDENTIALS")
public class CredentialsBean {
	@Id 
	private int cid;
public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
@ManyToOne
@JoinColumn(name="credenID" , referencedColumnName="userID")
private ProfileBean profilebean;
 @Column
	private String password;
 @Column
	private String userType;
 @Column
	private int loginStatus;
public ProfileBean getProfilebean() {
	return profilebean;
}
@Override
public String toString() {
	return "CredentialsBean [cid=" + cid + ", profilebean=" + profilebean + ", password=" + password + ", userType="
			+ userType + ", loginStatus=" + loginStatus + "]";
}
public void setProfilebean(ProfileBean profilebean) {
	this.profilebean = profilebean;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getUserType() {
	return userType;
}
public void setUserType(String userType) {
	this.userType = userType;
}
public int getLoginStatus() {
	return loginStatus;
}
public void setLoginStatus(int loginStatus) {
	this.loginStatus = loginStatus;
}
}
