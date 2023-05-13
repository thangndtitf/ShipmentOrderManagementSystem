package com.thang.ShipmentOrderManagementSystem.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.thang.ShipmentOrderManagementSystem.entity.SHIPMENTORDERTYPE;
import com.thang.ShipmentOrderManagementSystem.repository.SHIPMENTORDERTYPEREPO;

@Service
public class SHIPMENTORDERTYPESERVICE {

	private final SHIPMENTORDERTYPEREPO shipmentOrderTypeRepo;

	@Autowired
	public SHIPMENTORDERTYPESERVICE(SHIPMENTORDERTYPEREPO shipmentOrderTypeRepo) {
		super();
		this.shipmentOrderTypeRepo = shipmentOrderTypeRepo;
	}

	public List<SHIPMENTORDERTYPE> getAllShipmentOrder(){
		
		if(shipmentOrderTypeRepo.findAll().isEmpty()) {
			throw new IllegalStateException("Cannot find any ShipmentOrderType");
		}
		
		List<SHIPMENTORDERTYPE> listResult = new ArrayList<SHIPMENTORDERTYPE>();
		
		for (SHIPMENTORDERTYPE shoType : shipmentOrderTypeRepo.findAll()) {
			if(shoType.isDeleted() == false) {
				listResult.add(shoType);
			}
		}
		
		return listResult;
	}
	
	public Optional<SHIPMENTORDERTYPE> getShipmentOrderByID(int shoId){
		Optional<SHIPMENTORDERTYPE> shoType= shipmentOrderTypeRepo.findById(shoId);
		
		if(shoId<0) {
			throw new IllegalStateException("The ID : "+ shoId+ " is <0.");
		}
		if(shoType.isEmpty()){
			throw new IllegalStateException("The ID : "+ shoId+ " is not exist.");
		}
		if(shoType.get().isDeleted() == true) {
			throw new IllegalStateException("The shipmentOrder "+shoId+" was deleted");
		}
		else {
			return shoType;
		}
	}
	
	
	public SHIPMENTORDERTYPE insertNewShoType(SHIPMENTORDERTYPE newShoType) {
		newShoType.setDeleted(false);
		newShoType.setDeletedDate(null);
		newShoType.setDeletedUser(null);
		newShoType.setCreatedDate(LocalDateTime.now());
		System.out.println(newShoType.getCreatedDate());
		newShoType.setCreatedUser("Thang");;
		newShoType.setUpdatedDate(null);
		newShoType.setUpdatedUser(null);
		if(newShoType.getShipmentOrederTypeId()<0) {
			throw new IllegalStateException("The ID : "+ newShoType.getShipmentOrederTypeId()+ " is <0.");
		}
		if(shipmentOrderTypeRepo.findById(newShoType.getShipmentOrederTypeId()).isPresent()) {
			throw new IllegalStateException("The shipmentOrderType with ID: "+ newShoType.getShipmentOrederTypeId()+ " is exist");
		}
		if(newShoType.isDeleted()) {
			throw new IllegalStateException("The ShipmentOrderType with ID :"+ 
					newShoType.getShipmentOrederTypeId()+ "was deleted!");
		}
		else {
			return shipmentOrderTypeRepo.save(newShoType);
		}
		
	}
	
	public SHIPMENTORDERTYPE updateShoType(SHIPMENTORDERTYPE updateShoType, int shoTypeID) {
		Optional<SHIPMENTORDERTYPE>  shoType = shipmentOrderTypeRepo.findById(shoTypeID);
		if(shoType.isEmpty()) {
			throw new IllegalStateException("The ID : "+ shoType.get().getShipmentOrederTypeId() + " is not exist.");
		}
		shoType.get().setShipmentOrderTypeName(updateShoType.getShipmentOrderTypeName());
		shoType.get().setUpdatedDate(LocalDateTime.now());
		shoType.get().setUpdatedUser("Thang");
		shoType.get().setDescription(updateShoType.getDescription());
		
		return shipmentOrderTypeRepo.save(shoType.get());
	}
	
	
	public boolean deleteShoType(int shoTypeId) {
		boolean result = false;
		Optional<SHIPMENTORDERTYPE>  shoType = shipmentOrderTypeRepo.findById(shoTypeId);
		if(shoType.isEmpty()) {
			throw new IllegalStateException("The ID : "+ shoType.get().getShipmentOrederTypeId() + " is not exist.");
		}
		
		try {
			shoType.get().setDeleted(true);
			shoType.get().setDeletedDate(LocalDateTime.now());
			shoType.get().setDeletedUser("Thang");
			shipmentOrderTypeRepo.save(shoType.get());
			result = true;
		} catch (Exception e) {
			result = false;
			throw new IllegalStateException("Delete ShipmentOrderType "+ shoTypeId + " is not Success");
			
		}
		return result;
		
	}
	
	}
