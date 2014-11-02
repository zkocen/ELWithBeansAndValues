package com.worldmanager.models;

import java.io.Serializable;

public class WebUser implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String uid;
	private String pwd;
	private String authLevel;
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getAuthLevel() {
		return authLevel;
	}
	public void setAuthLevel(String authLevel) {
		this.authLevel = authLevel;
	}
	
	public String toString() {
		return String.format("UID: %s\tPWD: %s\tAuthLevel: %d\n", getUid(), getPwd(), getAuthLevel());
	}
}
