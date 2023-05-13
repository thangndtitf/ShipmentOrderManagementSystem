package com.thang.ShipmentOrderManagementSystem.service;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thang.ShipmentOrderManagementSystem.repository.SHIPMENTORDERTYPEWORKFLOWREPO;


@Service
public class SHIPMENTORDERTYPEWORKFLOWSERVICE {

	private final SHIPMENTORDERTYPEWORKFLOWREPO shipmentOrderTypeWorkFlowRepo;
	@Autowired
	private EntityManager entityManager;

	@Autowired
	public SHIPMENTORDERTYPEWORKFLOWSERVICE(SHIPMENTORDERTYPEWORKFLOWREPO shipmentOrderTypeWorkFlowRepo) {
		super();
		this.shipmentOrderTypeWorkFlowRepo = shipmentOrderTypeWorkFlowRepo;
	}
	

	public void insertProcedure(int workFlowID, int shipmentOrderTypeID, int stepID, int statusID, boolean isAutoChangeToStatus,
			int autoChangeToStatus, boolean isInitStep, boolean isFinishStep, LocalDateTime createdDate) {
		StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery("MD.MD_SHIPMENTORDERWF_ADD");
		
	}
	
	
	
}
