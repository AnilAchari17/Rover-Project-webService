package com.example.RoverProject.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RoverProject.Bean.EnvironmentConfig;
import com.example.RoverProject.Repository.EnvironmentConditionsRepository;
import com.example.RoverProject.service.RoverService;

@RestController
public class EnvironmentResource {
	
	
	@Autowired
	RoverService roverService;
	
	@PostMapping(value ="/api/environment/configure")
	public ResponseEntity<String> getEnvironmentConditions(@RequestBody EnvironmentConfig environmentConfig) {
		
				
		roverService.saveEnvironmentConfigurations(environmentConfig);
		
		return ResponseEntity.ok("200 ok");
	}
	
	@PatchMapping(value="/api/environment")
	public String updateTemp(@RequestBody EnvironmentConfig environmentConfig)
	{
		
		
		String patch = "updated";
		
		return patch;
	}

}
