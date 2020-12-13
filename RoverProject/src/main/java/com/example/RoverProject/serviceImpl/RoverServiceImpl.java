package com.example.RoverProject.serviceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RoverProject.Bean.DeployPointBean;
import com.example.RoverProject.Bean.DirectionBean;
import com.example.RoverProject.Bean.EnvironmentBean;
import com.example.RoverProject.Bean.EnvironmentConfig;
import com.example.RoverProject.Bean.EnvironmentConfig.terrainType;
import com.example.RoverProject.Bean.Location;
import com.example.RoverProject.Bean.RoverConfig;
import com.example.RoverProject.Bean.RoverStatusBean;
import com.example.RoverProject.Repository.EnvironmentConditionsRepository;
import com.example.RoverProject.Repository.RoverConditionsRepository;
import com.example.RoverProject.service.RoverService;

@Service
public class RoverServiceImpl implements RoverService {
	
	@Autowired
	EnvironmentConditionsRepository environmentConditionsRepository;
	
	@Autowired
	RoverStatusBean roverStatusBean;
	
	@Autowired
	EnvironmentConfig environmentConfigRepo;
	
	@Autowired
    RoverConditionsRepository roverConditionsRepository;
	
	@Autowired
	RoverConfig roverConfigRepo;
	
	
	

	public EnvironmentConfig saveEnvironmentConfigurations(EnvironmentConfig environmentConfig) {
		// TODO Auto-generated method stub
		
		environmentConfigRepo  = environmentConditionsRepository.saveEnvironmentConfigurations(environmentConfig);
		return environmentConfigRepo;
		
		}
	
	@Override
	public RoverConfig saveRoverConfigurations(RoverConfig roverConfig) {
		
		roverConfigRepo = roverConditionsRepository.saveRoverConfigurations(roverConfig);
		
		return roverConfigRepo;
	}
	
	public void updateDirection(DirectionBean direction) {
		
		String direc = direction.getDirection().toString();
		
		DeployPointBean dpb = roverConfigRepo.getDeploy_point();
		
		if(direc.equals("right")) {
			dpb.setColoumn(dpb.getColoumn()+1);
			roverConfigRepo.setInitial_battery(roverConfigRepo.getInitial_battery()-1);
		}
		if(direc.equals("left")) {
			dpb.setColoumn(dpb.getColoumn()-1);
			roverConfigRepo.setInitial_battery(roverConfigRepo.getInitial_battery()-1);
		}
       if(direc.equals("up")&&(!environmentConfigRepo.isStorm())) {
			dpb.setRow(dpb.getRow()-1);
			roverConfigRepo.setInitial_battery(roverConfigRepo.getInitial_battery()-1);
		}
       if(direc.equals("down")&&(!environmentConfigRepo.isStorm())) {
    	   dpb.setRow(dpb.getRow()+1);
    	   roverConfigRepo.setInitial_battery(roverConfigRepo.getInitial_battery()-1);
		}
       
       roverConfigRepo.setDeploy_point(dpb);
       roverConfigRepo =saveRoverConfigurations(roverConfigRepo);
       
		
		
	}
	
	public void updateStorm(EnvironmentConfig environmentConfig) {
		
		environmentConfigRepo.setStorm(environmentConfig.isStorm());
		
		environmentConditionsRepository.saveEnvironmentConfigurations(environmentConfigRepo);
		
	}
	
	
	public RoverStatusBean getRoverStatus()
	{
		
			
			DeployPointBean dpb = roverConfigRepo.getDeploy_point();
			Location location = new Location();
			location.setColoumn(dpb.getColoumn());
			location.setRow(dpb.getRow());
			ArrayList<ArrayList<terrainType>> areaMp = environmentConfigRepo.getArea_map();
			
			
			EnvironmentBean eb = new EnvironmentBean();
			eb.setHumidity(environmentConfigRepo.getHumidity());
			eb.setTemperature(environmentConfigRepo.getTemperature());
			eb.setStorm(environmentConfigRepo.isStorm());
			eb.setSolar_flare(environmentConfigRepo.isSolar_flare());
			eb.setTerrain( areaMp.get(dpb.getRow()).get(dpb.getColoumn()).toString());
			
			roverStatusBean.setBattery(roverConfigRepo.getInitial_battery());
			roverStatusBean.setLocation(location);
			roverStatusBean.setInventory(roverConfigRepo.getInventory());
			roverStatusBean.setEnvironment(eb);
			
		
		
		return roverStatusBean;
	}

	
}
