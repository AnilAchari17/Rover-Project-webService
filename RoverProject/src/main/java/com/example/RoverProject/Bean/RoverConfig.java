package com.example.RoverProject.Bean;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class RoverConfig {

	
	private ArrayList<ScenarioBean> scenarios;
	private ArrayList<StatesBean> states;
	private DeployPointBean deploy_point;
	private int initial_battery;
	private ArrayList<InventoryBean> inventory;
	
	
	public ArrayList<ScenarioBean> getScenarios() {
		return scenarios;
	}
	public void setScenarios(ArrayList<ScenarioBean> scenarios) {
		this.scenarios = scenarios;
	}
	public ArrayList<StatesBean> getStates() {
		return states;
	}
	public void setStates(ArrayList<StatesBean> states) {
		this.states = states;
	}
	public DeployPointBean getDeploy_point() {
		return deploy_point;
	}
	public void setDeploy_point(DeployPointBean deploy_point) {
		this.deploy_point = deploy_point;
	}
	public int getInitial_battery() {
		return initial_battery;
	}
	public void setInitial_battery(int initial_battery) {
		this.initial_battery = initial_battery;
	}
	public ArrayList<InventoryBean> getInventory() {
		return inventory;
	}
	public void setInventory(ArrayList<InventoryBean> inventory) {
		this.inventory = inventory;
	}
	
	
}
