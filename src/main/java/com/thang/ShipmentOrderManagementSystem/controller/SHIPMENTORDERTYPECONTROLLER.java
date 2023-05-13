package com.thang.ShipmentOrderManagementSystem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thang.ShipmentOrderManagementSystem.entity.SHIPMENTORDERTYPE;
import com.thang.ShipmentOrderManagementSystem.service.SHIPMENTORDERTYPESERVICE;

@RestController
@RequestMapping(path = "api/v1/shipmentordertype")
public class SHIPMENTORDERTYPECONTROLLER {

	private final SHIPMENTORDERTYPESERVICE shipmentOrderTypeService;

	@Autowired
	public SHIPMENTORDERTYPECONTROLLER(SHIPMENTORDERTYPESERVICE shipmentOrderTypeService) {
		super();
		this.shipmentOrderTypeService = shipmentOrderTypeService;
	}
	
	@GetMapping("searchAllShoType")
	public List<SHIPMENTORDERTYPE> searchAllShoType(){
		return shipmentOrderTypeService.getAllShipmentOrder();
	}
	
	@PostMapping("getShoTypeById")
	public Optional<SHIPMENTORDERTYPE> searchShoTypeByID( @RequestBody int shoId){
		return shipmentOrderTypeService.getShipmentOrderByID(shoId);
	} 
	
	@PostMapping("insertNewShoType")
	public SHIPMENTORDERTYPE insertNewShoType(@RequestBody SHIPMENTORDERTYPE newShoType) {
		return shipmentOrderTypeService.insertNewShoType(newShoType);
	}

	
	@PostMapping("updateShoType")
	public SHIPMENTORDERTYPE updateShoType(@RequestBody SHIPMENTORDERTYPE updateShoType){
		return shipmentOrderTypeService.updateShoType(updateShoType, updateShoType.getShipmentOrederTypeId());
	}
	
	@PostMapping("deleteShoType")
	public boolean deleteShoType(@RequestBody int shoTypeID) {
		return shipmentOrderTypeService.deleteShoType(shoTypeID);
	}
	
	
	
	
}
