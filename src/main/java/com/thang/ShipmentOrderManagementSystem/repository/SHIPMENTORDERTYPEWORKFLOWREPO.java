package com.thang.ShipmentOrderManagementSystem.repository;

import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

public interface SHIPMENTORDERTYPEWORKFLOWREPO extends JpaRepository<SHIPMENTORDERTYPEWORKFLOWREPO, Integer>{

	@Procedure(name = "MD.MD_SHIPMENTORDERWF_ADD")
	void insertProcedure(int workFlowID, int shipmentOrderTypeID, int stepID, int statusID, boolean isAutoChangeToStatus,
			int autoChangeToStatus, boolean isInitStep, boolean isFinishStep, LocalDateTime createdDate
			);
}
