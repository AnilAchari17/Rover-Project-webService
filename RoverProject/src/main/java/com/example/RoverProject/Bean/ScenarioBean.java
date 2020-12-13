package com.example.RoverProject.Bean;

import java.util.ArrayList;

public class ScenarioBean {

	private String name;
	private ArrayList<ConditionsBean> conditions;
	private ArrayList<RoverBean> rover;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<ConditionsBean> getConditions() {
		return conditions;
	}
	public void setConditions(ArrayList<ConditionsBean> conditions) {
		this.conditions = conditions;
	}
	public ArrayList<RoverBean> getRover() {
		return rover;
	}
	public void setRover(ArrayList<RoverBean> rover) {
		this.rover = rover;
	}
	
}
