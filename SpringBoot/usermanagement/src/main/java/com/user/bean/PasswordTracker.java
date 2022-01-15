package com.user.bean;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PasswordTracker {
	@Id
	private Integer passwordID;
	private String loginID;
	private String password;
	private String status;
	private Timestamp createdTimestamp;
	private Timestamp lastUpdatedTimestamp;
}
