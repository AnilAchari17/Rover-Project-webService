package com.example.RoverProject.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.RoverProject.Bean.EnvironmentConfig;
import com.example.RoverProject.Bean.RoverConfig;

@Repository
public class RoverConditionsRepository {
	
	@Autowired
	private  RoverConfig roverConfgrepo;

	
	public RoverConfig saveRoverConfigurations(RoverConfig roverConfig) {
		
		roverConfgrepo.setDeploy_point(roverConfig.getDeploy_point());
		roverConfgrepo.setInitial_battery(roverConfig.getInitial_battery());
		roverConfgrepo.setInventory(roverConfig.getInventory());
		roverConfgrepo.setScenarios(roverConfig.getScenarios());
		roverConfgrepo.setStates(roverConfig.getStates());
		
				
		return roverConfgrepo;
	}
	
	

}
