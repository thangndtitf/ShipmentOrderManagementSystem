package com.thang.ShipmentOrderManagementSystem.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name = "MD_SHIPMENTORDERTYPE_WORKFLOW", schema = "MD")
public class SHIPMENTORDERTYPEWORKFLOW {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "WORKFLOWID")
	private int workFlowID;
	@Column(name = "SHIPMENTORDERTYPEID")
	private int shipmentOrderTypeID;
	@Column(name = "STEPID")
	private int stepID;
	@Column(name = "STATUSID")
	private int statusID;
	@Column(name = "ISAUTOCHANGETOSTATUS")
	private boolean isAutoChangeToStatus;
	@Column(name = "AUTOCHANGETOSTATUSID")
	private int autoChangeToStatus;
	@Column(name = "ISINITSTEP")
	private boolean isInitStep;
	@Column(name = "ISFINISHSTEP")
	private boolean isFinishStep;
	@Column(name = "ISDELETED")
	private boolean deleted;
	@Column(name = "DELETEDUSER")
	private String deletedUser;
	@Column(name = "DELETEDDATE")
	private LocalDateTime deletedDate;
	@Column(name = "UPDATEUSER")
	private String updatedUser;
	@Column(name = "UPDATEDDATE")
	private LocalDateTime updatedDate;
	@Column(name = "CREATEDUSER")
	private String createdUser;
	@Column(name = "CREATEDDATE")
	private LocalDateTime createdDate;
	public int getWorkFlowID() {
		return workFlowID;
	}
	public void setWorkFlowID(int workFlowID) {
		this.workFlowID = workFlowID;
	}
	public int getShipmentOrderTypeID() {
		return shipmentOrderTypeID;
	}
	public void setShipmentOrderTypeID(int shipmentOrderTypeID) {
		this.shipmentOrderTypeID = shipmentOrderTypeID;
	}
	public int getStepID() {
		return stepID;
	}
	public void setStepID(int stepID) {
		this.stepID = stepID;
	}
	public int getStatusID() {
		return statusID;
	}
	public void setStatusID(int statusID) {
		this.statusID = statusID;
	}
	public boolean isAutoChangeToStatus() {
		return isAutoChangeToStatus;
	}
	public void setAutoChangeToStatus(boolean isAutoChangeToStatus) {
		this.isAutoChangeToStatus = isAutoChangeToStatus;
	}
	public int getAutoChangeToStatus() {
		return autoChangeToStatus;
	}
	public void setAutoChangeToStatus(int autoChangeToStatus) {
		this.autoChangeToStatus = autoChangeToStatus;
	}
	public boolean isInitStep() {
		return isInitStep;
	}
	public void setInitStep(boolean isInitStep) {
		this.isInitStep = isInitStep;
	}
	public boolean isFinishStep() {
		return isFinishStep;
	}
	public void setFinishStep(boolean isFinishStep) {
		this.isFinishStep = isFinishStep;
	}
	public boolean isDeleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
	public String getDeletedUser() {
		return deletedUser;
	}
	public void setDeletedUser(String deletedUser) {
		this.deletedUser = deletedUser;
	}
	public LocalDateTime getDeletedDate() {
		return deletedDate;
	}
	public void setDeletedDate(LocalDateTime deletedDate) {
		this.deletedDate = deletedDate;
	}
	public String getUpdatedUser() {
		return updatedUser;
	}
	public void setUpdatedUser(String updatedUser) {
		this.updatedUser = updatedUser;
	}
	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getCreatedUser() {
		return createdUser;
	}
	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	public SHIPMENTORDERTYPEWORKFLOW(int shipmentOrderTypeID, int stepID, int statusID, boolean isAutoChangeToStatus,
			int autoChangeToStatus, boolean isInitStep, boolean isFinishStep, boolean deleted, String deletedUser,
			LocalDateTime deletedDate, String updatedUser, LocalDateTime updatedDate, String createdUser,
			LocalDateTime createdDate) {
		super();
		this.shipmentOrderTypeID = shipmentOrderTypeID;
		this.stepID = stepID;
		this.statusID = statusID;
		this.isAutoChangeToStatus = isAutoChangeToStatus;
		this.autoChangeToStatus = autoChangeToStatus;
		this.isInitStep = isInitStep;
		this.isFinishStep = isFinishStep;
		this.deleted = deleted;
		this.deletedUser = deletedUser;
		this.deletedDate = deletedDate;
		this.updatedUser = updatedUser;
		this.updatedDate = updatedDate;
		this.createdUser = createdUser;
		this.createdDate = createdDate;
	}
	public SHIPMENTORDERTYPEWORKFLOW() {
		super();
	}
	@Override
	public String toString() {
		return "SHIPMENTORDERTYPEWORKFLOWREPO [workFlowID=" + workFlowID + ", shipmentOrderTypeID=" + shipmentOrderTypeID
				+ ", stepID=" + stepID + ", statusID=" + statusID + ", isAutoChangeToStatus=" + isAutoChangeToStatus
				+ ", autoChangeToStatus=" + autoChangeToStatus + ", isInitStep=" + isInitStep + ", isFinishStep="
				+ isFinishStep + ", deleted=" + deleted + ", deletedUser=" + deletedUser + ", deletedDate="
				+ deletedDate + ", updatedUser=" + updatedUser + ", updatedDate=" + updatedDate + ", createdUser="
				+ createdUser + ", createdDate=" + createdDate + "]";
	}
	
	
	
	
	
	
	
}
