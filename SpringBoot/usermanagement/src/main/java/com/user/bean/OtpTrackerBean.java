package com.user.bean;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OtpTrackerBean {
	@Id
	private Integer otpID;
	private String otp;
	private String loginId;
	private Timestamp createdTimestamp;
	private Timestamp lastUpdatedTimestamp;
}
