package com.thang.ShipmentOrderManagementSystem.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.log4j.Logger;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thang.ShipmentOrderManagementSystem.entity.ResponeObj;
import com.thang.ShipmentOrderManagementSystem.entity.SHIPMENTORDERTPYESTEP;
import com.thang.ShipmentOrderManagementSystem.repository.SHIPMENTORDERTYPESTEPREPO;

@Service
public class SHIPMENTORDERTYPESTEPSERVICE {
	private static final Logger LOGGER = Logger.getLogger(SHIPMENTORDERTYPESERVICE.class);
	private final SHIPMENTORDERTYPESTEPREPO shipmentOrderTypeStepRepo;
	private ResponeObj _responeObj;
	
	@Autowired
	public SHIPMENTORDERTYPESTEPSERVICE(SHIPMENTORDERTYPESTEPREPO shipmentOrderTypeStepRepo, ResponeObj _responeObj) {
		super();
		this.shipmentOrderTypeStepRepo = shipmentOrderTypeStepRepo;
		this._responeObj = _responeObj;
	}
	
	
	public JSONObject getAllShipmentOrderStep() {
		JSONObject resultObj ;
		List<SHIPMENTORDERTPYESTEP> listStep = shipmentOrderTypeStepRepo.findAll();
		if(listStep.isEmpty()) {
			_responeObj.setError(true);
			_responeObj.setMessage("list ShipmentOrder Step is Empty");
			_responeObj.setMessageDetail("Loi ne thay khong");
			_responeObj.setResultObejct(null);	
			resultObj = _responeObj.setResponeObj(_responeObj);
			LOGGER.warn("list ShipmentOrder Step is Empty");
			return resultObj;
		}else {
			for (SHIPMENTORDERTPYESTEP shipmentordertypestep : listStep) {
				if(shipmentordertypestep.isDeleted()) {
					listStep.remove(shipmentordertypestep);
				}
			}
			_responeObj.setError(false);
			_responeObj.setMessage("Ok");
			_responeObj.setMessageDetail(null);
			_responeObj.setResultObejct(listStep);	
			resultObj = _responeObj.setResponeObj(_responeObj);
			LOGGER.info(resultObj.toString());
			return resultObj;
		}
		
		
	}
	
	public JSONObject searchShoStepByID(int stepID) {
		JSONObject resultObj ;
		Optional<SHIPMENTORDERTPYESTEP> shoStepOptional = shipmentOrderTypeStepRepo.findById(stepID);
		if(stepID<=0) {
			_responeObj.setError(true);
			_responeObj.setMessage("stepID is <- 0");
			_responeObj.setMessageDetail(null);
			_responeObj.setResultObejct(null);	
			resultObj = _responeObj.setResponeObj(_responeObj);
			LOGGER.warn(resultObj.toString());
			return resultObj;
		}
		else if(shoStepOptional.get().isDeleted()) {
			_responeObj.setError(true);
			_responeObj.setMessage("StepID was deleted");
			_responeObj.setMessageDetail(null);
			_responeObj.setResultObejct(null);	
			resultObj = _responeObj.setResponeObj(_responeObj);
			LOGGER.warn(resultObj.toString());
			return resultObj;
		}else if(shoStepOptional.get() == null) {
			_responeObj.setError(true);
			_responeObj.setMessage("Can not find step with ID "+ stepID);
			_responeObj.setMessageDetail(null);
			_responeObj.setResultObejct(null);	
			resultObj = _responeObj.setResponeObj(_responeObj);
			LOGGER.warn(shoStepOptional);
			return resultObj;
		}else {
			_responeObj.setError(false);
			_responeObj.setMessage("Ok");
			_responeObj.setMessageDetail(null);
			_responeObj.setResultObejct(shoStepOptional);	
			resultObj = _responeObj.setResponeObj(_responeObj);
			LOGGER.info(resultObj.toString());
			return resultObj;
		}
		
	}
	
	public JSONObject insertNewStep(SHIPMENTORDERTPYESTEP newStep) {
		JSONObject resultObj ;
		newStep.setCreatedDate(LocalDateTime.now());
		newStep.setCreatedUser("Thang");
		newStep.setDeleted(false);
		newStep.setDeletedDate(null);
		newStep.setDeletedUser(null);
		newStep.setUpdatedDate(null);
		newStep.setUpdatedUser(null);
		if(newStep.getStepName().isEmpty()) {
			_responeObj.setError(true);
			_responeObj.setMessage("Step Name is Empty");
			_responeObj.setMessageDetail(null);
			_responeObj.setResultObejct(null);	
			resultObj = _responeObj.setResponeObj(_responeObj);
			LOGGER.info(resultObj.toString());
			return resultObj;
		}
		else {
			_responeObj.setError(false);
			_responeObj.setMessage("Ok");
			_responeObj.setMessageDetail(null);
			_responeObj.setResultObejct(shipmentOrderTypeStepRepo.save(newStep));	
			resultObj = _responeObj.setResponeObj(_responeObj);
			LOGGER.info(resultObj.toString());
			return resultObj;
		}
	}
	
	
	
	
	
}
