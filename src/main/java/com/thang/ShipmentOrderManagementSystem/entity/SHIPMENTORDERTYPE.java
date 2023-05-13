package com.thang.ShipmentOrderManagementSystem.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;


@Entity
@Table(name="MD_SHIPMENTORDERTYPE", schema = "MD")
public class SHIPMENTORDERTYPE {
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SHIPMENTORDERTYPEID")
	private int shipmentOrederTypeId;
	@Column(name = "SHIPMENTORDERTYPENAME")
	private String shipmentOrderTypeName;
	@Column(name = "DESCRIPTION")
	private String Description;
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

	public int getShipmentOrederTypeId() {
		return shipmentOrederTypeId;
	}
	public void setShipmentOrederTypeId(int shipmentOrederTypeId) {
		this.shipmentOrederTypeId = shipmentOrederTypeId;
	}
	public String getShipmentOrderTypeName() {
		return shipmentOrderTypeName;
	}
	public void setShipmentOrderTypeName(String shipmentOrderTypeName) {
		this.shipmentOrderTypeName = shipmentOrderTypeName;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
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
	public SHIPMENTORDERTYPE(String shipmentOrderTypeName, String description, boolean deleted, String deletedUser,
			LocalDateTime deletedDate, String updatedUser, LocalDateTime updatedDate, String createdUser,
			LocalDateTime createdDate) {
		super();
		this.shipmentOrderTypeName = shipmentOrderTypeName;
		Description = description;
		this.deleted = deleted;
		this.deletedUser = deletedUser;
		this.deletedDate = deletedDate;
		this.updatedUser = updatedUser;
		this.updatedDate = updatedDate;
		this.createdUser = createdUser;
		this.createdDate = createdDate;
	}
	public SHIPMENTORDERTYPE() {
		super();
	}
	@Override
	public String toString() {
		return "SHIPMENTORDERTYPE [shipmentOrederTypeId=" + shipmentOrederTypeId + ", shipmentOrderTypeName="
				+ shipmentOrderTypeName + ", Description=" + Description + ", deleted=" + deleted + ", deletedUser="
				+ deletedUser + ", deletedDate=" + deletedDate + ", updatedUser=" + updatedUser + ", updatedDate="
				+ updatedDate + ", createdUser=" + createdUser + ", createdDate=" + createdDate + "]";
	}
	
	
	
	
}
