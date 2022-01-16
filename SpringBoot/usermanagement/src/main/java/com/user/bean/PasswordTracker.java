package com.user.bean;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userpasswordtracker")
public class PasswordTracker {
	@Id
	@Column(name = "index")
	private Integer passwordID;
	@Column(name = "loginid")
	private String loginID;
	@Column(name = "password")
	private String password;
	@Column(name = "status")
	private String status;
	@Column(name = "createdtimestamp")
	private Timestamp createdTimestamp;
	@Column(name = "lastupdatedtimestamp")
	private Timestamp lastUpdatedTimestamp;
	public Integer getPasswordID() {
		return passwordID;
	}
	public void setPasswordID(Integer passwordID) {
		this.passwordID = passwordID;
	}
	public String getLoginID() {
		return loginID;
	}
	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
		return "PasswordTracker [passwordID=" + passwordID + ", status=" + status + ", createdTimestamp="
				+ createdTimestamp + ", lastUpdatedTimestamp=" + lastUpdatedTimestamp + "]";
	}
	
}
