package com.example.RoverProject.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity.BodyBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RoverProject.Bean.DirectionBean;
import com.example.RoverProject.Bean.EnvironmentConfig;
import com.example.RoverProject.Bean.RoverConfig;
import com.example.RoverProject.Bean.RoverStatusBean;
import com.example.RoverProject.Repository.EnvironmentConditionsRepository;
import com.example.RoverProject.service.RoverService;

@RestController
public class RoverResource {

	@Autowired
	RoverConfig roverConfigbean;
	
	@Autowired
	RoverService roverService;

	@PostMapping(value = "/api/rover/configure")
	public ResponseEntity<String> getEnvironmentConditions(@RequestBody RoverConfig roverConfig) {

		RoverConfig roverConfigg = roverService.saveRoverConfigurations(roverConfig);

		return ResponseEntity.ok("200 ok");
	}

	@PostMapping(value = "/api/rover/move")
	public ResponseEntity<String> setDirection(@RequestBody DirectionBean directionBean) {

		roverService.updateDirection(directionBean);
		return ResponseEntity.ok("200 ok");
	}

	@GetMapping(value = "/api/rover/status")
	public RoverStatusBean getRoverStatus() {

		RoverStatusBean roverStatusBean = roverService.getRoverStatus();

		return roverStatusBean;
	}

}
