package com.thang.ShipmentOrderManagementSystem.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.log4j.Logger;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.thang.ShipmentOrderManagementSystem.entity.ResponeObj;
import com.thang.ShipmentOrderManagementSystem.entity.SHIPMENTORDERTYPE;
import com.thang.ShipmentOrderManagementSystem.repository.SHIPMENTORDERTYPEREPO;

@Service
public class SHIPMENTORDERTYPESERVICE {
	private static final Logger LOGGER = Logger.getLogger(SHIPMENTORDERTYPESERVICE.class);
	private final SHIPMENTORDERTYPEREPO shipmentOrderTypeRepo;
	private final ResponeObj _respObj;

	@Autowired
	public SHIPMENTORDERTYPESERVICE(SHIPMENTORDERTYPEREPO shipmentOrderTypeRepo, ResponeObj _respObj) {
		super();
		this.shipmentOrderTypeRepo = shipmentOrderTypeRepo;
		this._respObj = _respObj;
		
		
	}

	// Hàm get all shotype respone về lại đối tượng dữ liệu JSON
	public JSONObject getAllShoType() {
		JSONObject resultObjString ;
		List<SHIPMENTORDERTYPE> shoTypeList = shipmentOrderTypeRepo.findAll();
		if(shoTypeList.isEmpty()) {
			_respObj.setError(true);
			_respObj.setMessage("Error at get All Sho Type ");
			_respObj.setMessageDetail("loi ne thay kong");
			_respObj.setResultObejct("");
			resultObjString = _respObj.setResponeObj(_respObj);
			LOGGER.warn(resultObjString);
		}else {
			for (SHIPMENTORDERTYPE shipmentordertype : shipmentOrderTypeRepo.findAll()) {
				if(shipmentordertype.isDeleted() == true) {
					shoTypeList.remove(shipmentordertype);
				}
			}
			_respObj.setError(false);
			_respObj.setMessage("OK");
			_respObj.setMessageDetail("");
			_respObj.setResultObejct(shoTypeList);
			resultObjString = _respObj.setResponeObj(_respObj);	
			LOGGER.info(resultObjString);
		}
		return resultObjString;
	}
	
	// Hàm get  shotype respone bằng ID được truyền vào bằng đối tượng dữ liệu JSON
	public JSONObject getShipmentOrderByID(int shoId) {
		Optional<SHIPMENTORDERTYPE> shoType = shipmentOrderTypeRepo.findById(shoId);
		JSONObject resultObject;
		if (shoId < 0) {
			_respObj.setError(true);
			_respObj.setMessage("Error at get Sho Type by ID");
			_respObj.setMessageDetail("loi ne thay kong");
			_respObj.setResultObejct("");
			resultObject = _respObj.setResponeObj(_respObj);
			return resultObject;
		}
		if (shoType.isEmpty()) {
			_respObj.setError(true);
			_respObj.setMessage("The ID : " + shoId + " is not exist.");
			_respObj.setMessageDetail("loi ne thay kong");
			_respObj.setResultObejct("");
			resultObject = _respObj.setResponeObj(_respObj);
			return resultObject;
		}
		if (shoType.get().isDeleted() == true) {
			_respObj.setError(true);
			_respObj.setMessage("The shipmentOrder " + shoId + " was deleted");
			_respObj.setMessageDetail("loi ne thay kong");
			_respObj.setResultObejct("");
			resultObject = _respObj.setResponeObj(_respObj);
			return resultObject;
		} else {
			_respObj.setError(false);
			_respObj.setMessage("OK");
			_respObj.setMessageDetail("");
			_respObj.setResultObejct(shoType);
			resultObject = _respObj.setResponeObj(_respObj);
			return resultObject;
		}
	}

	//Hàm insert new 1 ShipmentOrderType
	public JSONObject insertNewShoType(SHIPMENTORDERTYPE newShoType) {
		JSONObject resultObj ;
		newShoType.setDeleted(false);
		newShoType.setDeletedDate(null);
		newShoType.setDeletedUser(null);
		newShoType.setCreatedDate(LocalDateTime.now());
		System.out.println(newShoType.getCreatedDate());
		newShoType.setCreatedUser("Thang");
		newShoType.setUpdatedDate(null);
		newShoType.setUpdatedUser(null);
		if (newShoType.getShipmentOrederTypeId() < 0) {
			_respObj.setError(true);
			_respObj.setMessage("The ID : " + newShoType.getShipmentOrederTypeId() + " is <0.");
			_respObj.setMessageDetail("Loi ne thay kong");
			_respObj.setResultObejct(" ");
			resultObj = _respObj.setResponeObj(_respObj);
			return resultObj;
		}
		if (shipmentOrderTypeRepo.findById(newShoType.getShipmentOrederTypeId()).isPresent()) {	
			_respObj.setError(true);
			_respObj.setMessage("The shipmentOrderType with ID: " + newShoType.getShipmentOrederTypeId() + " is exist");
			_respObj.setMessageDetail("Loi ne thay kong");
			_respObj.setResultObejct(" ");
			resultObj = _respObj.setResponeObj(_respObj);
			return resultObj;
		}
		if (newShoType.isDeleted()) {
			_respObj.setError(true);
			_respObj.setMessage("The ShipmentOrderType with ID :" + newShoType.getShipmentOrederTypeId() + "was deleted!");
			_respObj.setMessageDetail("Loi ne thay kong");
			_respObj.setResultObejct(" ");
			resultObj = _respObj.setResponeObj(_respObj);
			return resultObj;
		} else {
			_respObj.setError(false);
			_respObj.setMessage("OK");
			_respObj.setMessageDetail("");
			_respObj.setResultObejct(shipmentOrderTypeRepo.save(newShoType));
			resultObj = _respObj.setResponeObj(_respObj);
			 return resultObj;
		}
	}

	//Hàm update 1 ShipmentORderTpe 
	public JSONObject updateShoType(SHIPMENTORDERTYPE updateShoType, int shoTypeID) {
		Optional<SHIPMENTORDERTYPE> shoType = shipmentOrderTypeRepo.findById(shoTypeID);
		JSONObject resultObj ;
		if (shoType.isEmpty()) {
			_respObj.setError(true);
			_respObj.setMessage("The ID : " + shoType.get().getShipmentOrederTypeId() + " is not exist.");
			_respObj.setMessageDetail("Loi ne thay kong");
			_respObj.setResultObejct(" ");
			resultObj = _respObj.setResponeObj(_respObj);
			return resultObj;
		}
		shoType.get().setShipmentOrderTypeName(updateShoType.getShipmentOrderTypeName());
		shoType.get().setUpdatedDate(LocalDateTime.now());
		shoType.get().setUpdatedUser("Thang");
		shoType.get().setDescription(updateShoType.getDescription());
		_respObj.setError(false);
		_respObj.setMessage("Ok");
		_respObj.setMessageDetail("");
		_respObj.setResultObejct(shipmentOrderTypeRepo.save(shoType.get()));
		resultObj = _respObj.setResponeObj(_respObj);
		return resultObj;
	}

	//Hàm delete 1 ShipmentOrderType
	public JSONObject deleteShoType(int shoTypeId) {
		
		JSONObject resultObj ;
		Optional<SHIPMENTORDERTYPE> shoType = shipmentOrderTypeRepo.findById(shoTypeId);
		if (shoType.isEmpty()) {
			_respObj.setError(true);
			_respObj.setMessage("The ID : " + shoType.get().getShipmentOrederTypeId() + " is not exist.");
			_respObj.setMessageDetail("Loi ne thay kong");
			_respObj.setResultObejct(" ");
			resultObj = _respObj.setResponeObj(_respObj);
			return resultObj;
		}
		try {
			shoType.get().setDeleted(true);
			shoType.get().setDeletedDate(LocalDateTime.now());
			shoType.get().setDeletedUser("Thang");
			shipmentOrderTypeRepo.save(shoType.get());
			_respObj.setError(false);
			_respObj.setMessage("Ok");
			_respObj.setMessageDetail("");
			_respObj.setResultObejct(" ");
			resultObj = _respObj.setResponeObj(_respObj);
			return resultObj;
		} catch (Exception e) {
			_respObj.setError(true);
			_respObj.setMessage("Delete ShipmentOrderType " + shoTypeId + " is not Success");
			_respObj.setMessageDetail("Loi ne thay kong");
			_respObj.setResultObejct(" ");
			resultObj = _respObj.setResponeObj(_respObj);
			return resultObj;
		}
	}

//	@Scheduled(fixedRate = 5000)
//	public void insertNewShoTypeSch() {
//		SHIPMENTORDERTYPE newShoType = new SHIPMENTORDERTYPE();
//		newShoType.setShipmentOrderTypeName("Oke");
//		newShoType.setDescription("ShipmentOrderType Create By Cron Job");
//		newShoType.setDeleted(false);
//		newShoType.setDeletedDate(null);
//		newShoType.setDeletedUser(null);
//		newShoType.setCreatedDate(LocalDateTime.now());
//		System.out.println(newShoType.getCreatedDate());
//		newShoType.setCreatedUser("Thang");
//		newShoType.setUpdatedDate(null);
//		newShoType.setUpdatedUser(null);
//		if (newShoType.getShipmentOrederTypeId() < 0) {
//			LOGGER.warn("The ID : " + newShoType.getShipmentOrederTypeId() + " is <0.");
//		}
//		if (shipmentOrderTypeRepo.findById(newShoType.getShipmentOrederTypeId()).isPresent()) {
//			LOGGER.warn("The shipmentOrderType with ID: " + newShoType.getShipmentOrederTypeId() + " is exist");
//		}
//		if (newShoType.isDeleted()) {
//			LOGGER.warn("The ShipmentOrderType with ID :" + newShoType.getShipmentOrederTypeId() + "was deleted!");
//		} else {
//			shipmentOrderTypeRepo.save(newShoType);
//			LOGGER.info("Insert new Shipment Order type" + newShoType.toString());
//		}
//	}

//	@Scheduled(fixedRate = 5000)
//	public void insertNewShoTypeSchclone() {
//		SHIPMENTORDERTYPE newShoType = new SHIPMENTORDERTYPE();
//		newShoType.setShipmentOrderTypeName("Oke");
//		newShoType.setDescription("ShipmentOrderType Create By Cron Job 2 nha");
//		newShoType.setDeleted(false);
//		newShoType.setDeletedDate(null);
//		newShoType.setDeletedUser(null);
//		newShoType.setCreatedDate(LocalDateTime.now());
//		System.out.println(newShoType.getCreatedDate());
//		newShoType.setCreatedUser("Thang");
//		newShoType.setUpdatedDate(null);
//		newShoType.setUpdatedUser(null);
//
//		if (newShoType.getShipmentOrederTypeId() < 0) {
//			LOGGER.warn("The ID : " + newShoType.getShipmentOrederTypeId() + " is <0.");
//		}
//		if (shipmentOrderTypeRepo.findById(newShoType.getShipmentOrederTypeId()).isPresent()) {
//			LOGGER.warn("The shipmentOrderType with ID: " + newShoType.getShipmentOrederTypeId() + " is exist");
//		}
//		if (newShoType.isDeleted()) {
//			LOGGER.warn("The ShipmentOrderType with ID :" + newShoType.getShipmentOrederTypeId() + "was deleted!");
//		} else {
//
//			shipmentOrderTypeRepo.save(newShoType);
//			LOGGER.info(" 2 Insert new Shipment Order type " + newShoType.toString());
//		}
//	}


}
