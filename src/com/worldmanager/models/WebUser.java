package com.worldmanager.models;

import java.io.Serializable;

public class WebUser implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String uid;
	private String pwd;
	
	private int authLevel;
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
	public int getAuthLevel() {
		return authLevel;
	}
	public void setAuthLevel(int authLevel) {
		this.authLevel = authLevel;
	}
	
	@Override
	public String toString() {
		return String.format("WebUser [uid=" + uid + ", pwd=" + pwd + ", authLevel="
				+ authLevel + "]");
	}
}
