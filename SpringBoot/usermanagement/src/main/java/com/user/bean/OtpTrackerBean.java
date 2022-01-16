package com.user.bean;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "otptracker")
public class OtpTrackerBean {
	@Id
	@Column(name = "otpid")
	private Integer otpID;
	@Column(name = "loginid")
	private String otp;
	@Column(name = "otp")
	private String loginId;
	@Column(name = "createdtimestamp")
	private Timestamp createdTimestamp;
	@Column(name = "lastupdatedtimestamp")
	private Timestamp lastUpdatedTimestamp;
	public Integer getOtpID() {
		return otpID;
	}
	public void setOtpID(Integer otpID) {
		this.otpID = otpID;
	}
	public String getOtp() {
		return otp;
	}
	public void setOtp(String otp) {
		this.otp = otp;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public Timestamp getCreatedTimestamp() {
		return createdTimestamp;
	}
	public void setCreatedTimestamp(Timestamp createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}
	public Timestamp getLastUpdatedTimestamp() {
		return lastUpdatedTimestamp;
	}
	public void setLastUpdatedTimestamp(Timestamp lastUpdatedTimestamp) {
		this.lastUpdatedTimestamp = lastUpdatedTimestamp;
	}
	@Override
	public String toString() {
		return "OtpTrackerBean [otpID=" + otpID + ", createdTimestamp=" + createdTimestamp + ", lastUpdatedTimestamp="
				+ lastUpdatedTimestamp + "]";
	}
	
}
