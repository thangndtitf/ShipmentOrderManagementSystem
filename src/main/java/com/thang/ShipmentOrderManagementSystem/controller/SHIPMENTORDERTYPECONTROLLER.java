package com.thang.ShipmentOrderManagementSystem.controller;

import java.util.List;
import java.util.Optional;

import org.apache.log4j.Logger;
import org.json.simple.JSONObject;
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
	private static final Logger LOGGER= Logger.getLogger(SHIPMENTORDERTYPECONTROLLER.class);
	private final SHIPMENTORDERTYPESERVICE shipmentOrderTypeService;
	
	@Autowired
	public SHIPMENTORDERTYPECONTROLLER(SHIPMENTORDERTYPESERVICE shipmentOrderTypeService) {
		super();
		this.shipmentOrderTypeService = shipmentOrderTypeService;
	}

	@GetMapping("searchAllShoTypeObj")
	public JSONObject searchAllShoTypeString(){
		LOGGER.info("Get All ShipmentOrder type");
		return shipmentOrderTypeService.getAllShoType();
	}
	
	@PostMapping("getShoTypeById")
	public JSONObject searchShoTypeByID( @RequestBody int shoId){
		LOGGER.info("Get ShipmentOrder type with ID: " + shoId);
		return shipmentOrderTypeService.getShipmentOrderByID(shoId);
	} 
	
	@PostMapping("insertNewShoType")
	public JSONObject insertNewShoType(@RequestBody SHIPMENTORDERTYPE newShoType) {
		LOGGER.info("insert new shipmentOrderType: "+ newShoType.getShipmentOrederTypeId());
		return shipmentOrderTypeService.insertNewShoType(newShoType);
		
	}

	
	@PostMapping("updateShoType")
	public JSONObject updateShoType(@RequestBody SHIPMENTORDERTYPE updateShoType){
		LOGGER.info("Update infor ShipmentOrderType: "+ updateShoType.toString());
		return shipmentOrderTypeService.updateShoType(updateShoType, updateShoType.getShipmentOrederTypeId());
	}
	
	@PostMapping("deleteShoType")
	public JSONObject deleteShoType(@RequestBody int shoTypeID) {
		LOGGER.info("Delete ShipmentOrderType with ID: "+ shoTypeID);
		return shipmentOrderTypeService.deleteShoType(shoTypeID);
	}
}
