package com.thang.ShipmentOrderManagementSystem.controller;


import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thang.ShipmentOrderManagementSystem.entity.SHIPMENTORDERTPYESTEP;
import com.thang.ShipmentOrderManagementSystem.service.SHIPMENTORDERTYPESTEPSERVICE;

@RestController
@RequestMapping("api/v1/shoTypeStep")
public class SHIPMENTORDERTPYESTEPCONTROLLER {
	
	private final SHIPMENTORDERTYPESTEPSERVICE shipmentOrderTypeStepRepo;

	@Autowired
	public SHIPMENTORDERTPYESTEPCONTROLLER(SHIPMENTORDERTYPESTEPSERVICE shipmentOrderTypeStepRepo) {
		super();
		this.shipmentOrderTypeStepRepo = shipmentOrderTypeStepRepo;
	}
	
	
	@GetMapping("/searchAllShoStep")
	public JSONObject searchAllShoStep() {
		return shipmentOrderTypeStepRepo.getAllShipmentOrderStep();
	}
	
	@PostMapping("/searchStepByID")
	public JSONObject searchStepByID(@RequestBody int stepID) {
		return shipmentOrderTypeStepRepo.searchShoStepByID(stepID);
	}
	
	@PostMapping("insertNewStep")
	public JSONObject insertNewStep(@RequestBody SHIPMENTORDERTPYESTEP newStep) {
		return shipmentOrderTypeStepRepo.insertNewStep(newStep);
	}
	
	
}
