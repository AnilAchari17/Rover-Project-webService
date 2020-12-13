package com.example.RoverProject.Bean;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class EnvironmentConfig {
	
	public enum terrainType{dirt, water , rock , sand;}
			
	private int temperature;
	private int humidity;
	private boolean solar_flare;
	private boolean storm;
	private ArrayList<ArrayList<terrainType>> area_map;
	
	
	public ArrayList<ArrayList<terrainType>> getArea_map() {
		return area_map;
	}
	public void setArea_map(ArrayList<ArrayList<terrainType>> area_map) {
		this.area_map = area_map;
	}
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	public int getHumidity() {
		return humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	public boolean isSolar_flare() {
		return solar_flare;
	}
	public void setSolar_flare(boolean solar_flare) {
		this.solar_flare = solar_flare;
	}
	public boolean isStorm() {
		return storm;
	}
	public void setStorm(boolean storm) {
		this.storm = storm;
	}

}
