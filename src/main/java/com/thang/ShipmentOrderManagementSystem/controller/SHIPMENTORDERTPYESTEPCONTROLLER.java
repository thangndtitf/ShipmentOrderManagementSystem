package com.thang.ShipmentOrderManagementSystem.controller;

import java.util.List;

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



	@GetMapping("searchAllStep")
	public List<SHIPMENTORDERTPYESTEP> searchAllShoTypeStep(){
		return shipmentOrderTypeStepRepo.getAllStep();
	}
	
	@PostMapping("insertNewStep")
	public SHIPMENTORDERTPYESTEP insertNewStep (@RequestBody SHIPMENTORDERTPYESTEP newStep) {
		return shipmentOrderTypeStepRepo.insertNewStep(newStep);
	}
	
	
	@PostMapping("updateStep")
	public SHIPMENTORDERTPYESTEP updateStep(SHIPMENTORDERTPYESTEP updateStep) {
		return shipmentOrderTypeStepRepo.updateStep(updateStep);
	}
	
}
