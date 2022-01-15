package com.user.bean;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserBean {
	@Id
	@Column(name = "userid")
	private Integer userId;
	@Column(name = "loginid")
	private String loginId;
	@Column(name = "password")
	private String password;
	@Column(name = "status")
	private String status;
	@Column(name = "otppreference")
	private Integer otpPreference;
	@Column(name = "mobile")
	private String mobile;
	@Column(name = "email")
	private String email;
	@Column(name = "country")
	private String country;
	@Column(name = "createdtimestamp")
	private Timestamp createdTimestamp;
	@Column(name = "lastupdatedtimestamp")
	private Timestamp lastUpdatedTimestamp;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
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
	public Integer getOtpPreference() {
		return otpPreference;
	}
	public void setOtpPreference(Integer otpPreference) {
		this.otpPreference = otpPreference;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
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
		return "UserBean [userId=" + userId + ", status=" + status + ", otpPreference=" + otpPreference
				+ ", createdTimestamp=" + createdTimestamp + ", lastUpdatedTimestamp=" + lastUpdatedTimestamp + "]";
	}
	
}
