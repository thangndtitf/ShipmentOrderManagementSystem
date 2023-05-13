package com.thang.ShipmentOrderManagementSystem.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thang.ShipmentOrderManagementSystem.entity.SHIPMENTORDERTPYESTEP;
import com.thang.ShipmentOrderManagementSystem.repository.SHIPMENTORDERTYPESTEPREPO;

@Service
public class SHIPMENTORDERTYPESTEPSERVICE {
	private final SHIPMENTORDERTYPESTEPREPO shipmentOrderTypeStepRepo;

	@Autowired
	public SHIPMENTORDERTYPESTEPSERVICE(SHIPMENTORDERTYPESTEPREPO shipmentOrderTypeStepRepo) {
		super();
		this.shipmentOrderTypeStepRepo = shipmentOrderTypeStepRepo;
	}
	
	
	public List<SHIPMENTORDERTPYESTEP> getAllStep(){
		List<SHIPMENTORDERTPYESTEP> listStep = new ArrayList<SHIPMENTORDERTPYESTEP>() ;
		if(shipmentOrderTypeStepRepo.findAll().isEmpty()) {
			throw new IllegalStateException("SHO Step is Empty.");	
		}
		for (SHIPMENTORDERTPYESTEP shipmentordertpyestep : shipmentOrderTypeStepRepo.findAll()) {
			if(shipmentordertpyestep.isDeleted() == false) {
				listStep.add(shipmentordertpyestep);
			}
		}
		
		return listStep;
	}
	
	
	public Optional<SHIPMENTORDERTPYESTEP> getStepByID(int stepID){
		if(stepID<0) {
			throw new IllegalStateException("SHO Step with ID "+ stepID + " is <0");
		}
		
		Optional<SHIPMENTORDERTPYESTEP> newStep = shipmentOrderTypeStepRepo.findById(stepID);
		if(newStep.get().isDeleted() == true) {
			throw new IllegalStateException("SHO Step with ID "+ stepID + " was deleted");
		}
		return newStep;
	}
	
	
	
	public SHIPMENTORDERTPYESTEP insertNewStep(SHIPMENTORDERTPYESTEP newStep) {
		SHIPMENTORDERTPYESTEP insertStep = null;
		newStep.setCreatedDate(LocalDateTime.now());
		newStep.setCreatedUser("Thang");
		newStep.setDeleted(false);
		newStep.setDeletedDate(null);
		newStep.setDeletedUser(null);
		newStep.setUpdatedDate(null);
		newStep.setUpdatedUser(null);
		try {
			insertStep = shipmentOrderTypeStepRepo.save(newStep);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return insertStep;
	}
	
	
	
	
	
	
}
