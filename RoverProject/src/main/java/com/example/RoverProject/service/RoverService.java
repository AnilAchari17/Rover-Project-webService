package com.example.RoverProject.service;

import org.springframework.stereotype.Service;

import com.example.RoverProject.Bean.DirectionBean;
import com.example.RoverProject.Bean.EnvironmentConfig;
import com.example.RoverProject.Bean.RoverConfig;
import com.example.RoverProject.Bean.RoverStatusBean;

@Service
public interface RoverService {
	public EnvironmentConfig saveEnvironmentConfigurations(EnvironmentConfig environmentConfig);
	
	public RoverConfig saveRoverConfigurations(RoverConfig roverConfig);
	
	public void updateStorm(EnvironmentConfig environmentConfig);
	
	public void updateDirection(DirectionBean direction);
	
	public RoverStatusBean getRoverStatus();

}
