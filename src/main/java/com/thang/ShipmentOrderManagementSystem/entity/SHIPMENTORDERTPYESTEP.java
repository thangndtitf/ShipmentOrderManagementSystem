package com.thang.ShipmentOrderManagementSystem.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MD_SHIPMENTORDERTPYE_STEP", schema = "MD")
public class SHIPMENTORDERTPYESTEP {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "STEPID")
	private int stepID;
	@Column(name = "STEPNAME")
	private String stepName;
	@Column(name = "DESCRIPTION")
	private String description;
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
	public int getStepID() {
		return stepID;
	}
	public void setStepID(int stepID) {
		this.stepID = stepID;
	}
	public String getStepName() {
		return stepName;
	}
	public void setStepName(String stepName) {
		this.stepName = stepName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	@Override
	public String toString() {
		return "SHIPMENTORDERTPYESTEP [stepID=" + stepID + ", stepName=" + stepName + ", description=" + description
				+ ", deleted=" + deleted + ", deletedUser=" + deletedUser + ", deletedDate=" + deletedDate
				+ ", updatedUser=" + updatedUser + ", updatedDate=" + updatedDate + ", createdUser=" + createdUser
				+ ", createdDate=" + createdDate + "]";
	}
	public SHIPMENTORDERTPYESTEP(String stepName, String description, boolean deleted, String deletedUser,
			LocalDateTime deletedDate, String updatedUser, LocalDateTime updatedDate, String createdUser,
			LocalDateTime createdDate) {
		super();
		this.stepName = stepName;
		this.description = description;
		this.deleted = deleted;
		this.deletedUser = deletedUser;
		this.deletedDate = deletedDate;
		this.updatedUser = updatedUser;
		this.updatedDate = updatedDate;
		this.createdUser = createdUser;
		this.createdDate = createdDate;
	}
	public SHIPMENTORDERTPYESTEP() {
		super();
	}
	
	
	
}
