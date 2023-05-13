package com.thang.ShipmentOrderManagementSystem.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class SHIPMENTORDERTYPESTATUS {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "STATUSID")
	private int statusID;
	@Column(name = "STATUSNAME")
	private String statusName;
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
	public int getStatusID() {
		return statusID;
	}
	public void setStatusID(int statusID) {
		this.statusID = statusID;
	}
	public String getStatusName() {
		return statusName;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
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
	public SHIPMENTORDERTYPESTATUS(String statusName, String description, boolean deleted, String deletedUser,
			LocalDateTime deletedDate, String updatedUser, LocalDateTime updatedDate, String createdUser,
			LocalDateTime createdDate) {
		super();
		this.statusName = statusName;
		Description = description;
		this.deleted = deleted;
		this.deletedUser = deletedUser;
		this.deletedDate = deletedDate;
		this.updatedUser = updatedUser;
		this.updatedDate = updatedDate;
		this.createdUser = createdUser;
		this.createdDate = createdDate;
	}
	public SHIPMENTORDERTYPESTATUS() {
		super();
	}
	@Override
	public String toString() {
		return "SHIPMENTORDERTYPESTATUS [statusID=" + statusID + ", statusName=" + statusName + ", Description="
				+ Description + ", deleted=" + deleted + ", deletedUser=" + deletedUser + ", deletedDate=" + deletedDate
				+ ", updatedUser=" + updatedUser + ", updatedDate=" + updatedDate + ", createdUser=" + createdUser
				+ ", createdDate=" + createdDate + "]";
	}
	
	
	
	
}
