package com.worldmanager.models;

import java.io.Serializable;

public class Country implements Serializable {
	private static final long serialVersionUID = 1L;
	private String code;
	
	
	
	public void setCode(String value) {
		code = value;
	}



	public String getCode() {
		return code;
	}
	
}
