package com.example.RoverProject.Bean;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class RoverStatusBean {

	private Location location;
	private int battery;
	private ArrayList<InventoryBean> Inventory;
	private EnvironmentBean Environment;
	
	public EnvironmentBean getEnvironment() {
		return Environment;
	}
	public void setEnvironment(EnvironmentBean environment) {
		Environment = environment;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public int getBattery() {
		return battery;
	}
	public void setBattery(int battery) {
		this.battery = battery;
	}
	public ArrayList<InventoryBean> getInventory() {
		return Inventory;
	}
	public void setInventory(ArrayList<InventoryBean> inventory) {
		Inventory = inventory;
	}
	
}
