package com.grzybowski.mateusz.vehicle.fullVehicleAplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleModelController {

	@GetMapping("/index")
	public String goHome(){
		return "index";
	}
}