package com.example.RoverProject.Bean;

import java.util.ArrayList;

public class StatesBean {
	
	
	private String name;
	private ArrayList<String> allowedActions;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<String> getAllowedActions() {
		return allowedActions;
	}
	public void setAllowedActions(ArrayList<String> allowedActions) {
		this.allowedActions = allowedActions;
	}
	
	
	
}
