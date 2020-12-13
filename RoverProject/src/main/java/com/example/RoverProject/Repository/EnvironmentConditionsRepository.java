package com.example.RoverProject.Repository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.RoverProject.Bean.EnvironmentConfig;

@Repository
public class EnvironmentConditionsRepository {

	@Autowired
	private  EnvironmentConfig envConfgrepo;

	
	public EnvironmentConfig saveEnvironmentConfigurations(EnvironmentConfig environmentConfig) {
		
		envConfgrepo.setArea_map(environmentConfig.getArea_map());
		envConfgrepo.setHumidity(environmentConfig.getHumidity());
		envConfgrepo.setTemperature(environmentConfig.getTemperature());
		envConfgrepo.setSolar_flare(environmentConfig.isSolar_flare());
		envConfgrepo.setStorm(environmentConfig.isStorm());
		
		
		return envConfgrepo;
	}
	
	public int updateTemperature(int temperature) {
		
		envConfgrepo.setTemperature(temperature);
		
		return envConfgrepo.getTemperature();
	}

}
