package com.example.RoverProject.Bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class RoverBean {
		
	@JsonInclude(value=Include.NON_EMPTY, content=Include.NON_NULL)
	private String is;
	@JsonInclude(value=Include.NON_EMPTY, content=Include.NON_NULL)
	private PerformsBean performs;
	
	public PerformsBean getPerforms() {
		return performs;
	}
	public void setPerforms(PerformsBean performs) {
		this.performs = performs;
	}
	public String getIs() {
		return is;
	}
	public void setIs(String is) {
		this.is = is;
	}
	
	
	
}
