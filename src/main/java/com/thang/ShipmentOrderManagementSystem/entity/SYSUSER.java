package com.thang.ShipmentOrderManagementSystem.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MD_SYSUSER", schema = "MD")
public class SYSUSER {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SYSUSERID")
	private int sysUserId;
	@Column(name = "USERNAME")
	private int userName;
	@Column(name = "USERFIRSTNAME")
	private String userFirstName;
	@Column(name = "USERLASTNAME")
	private String userLastName;
	@Column(name = "USERFULLNAME")
	private String userFullName;
	@Column(name = "DATEOFBIRD")
	private LocalDateTime dateOfBird;
	@Column(name = "FIRSTDATEIN")
	private LocalDateTime firstDateIn;
	@Column(name = "CARDID")
	private long cardID;
	@Column(name = "DATECREATECARD")
	private LocalDate dateCreatedCard;
	@Column(name = "PROVINCECREATECARD")
	private String provinceCreatedCard;
	@Column(name = "BANKACCNAME")
	private String bankAccName;
	@Column(name = "BANKACCNUMBER")
	private int bankAccNum;
	@Column(name = "BANKNAME")
	private String bankName;
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
	public int getSysUserId() {
		return sysUserId;
	}
	public void setSysUserId(int sysUserId) {
		this.sysUserId = sysUserId;
	}
	public int getUserName() {
		return userName;
	}
	public void setUserName(int userName) {
		this.userName = userName;
	}
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public String getUserFullName() {
		return userFullName;
	}
	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}
	public LocalDateTime getDateOfBird() {
		return dateOfBird;
	}
	public void setDateOfBird(LocalDateTime dateOfBird) {
		this.dateOfBird = dateOfBird;
	}
	public LocalDateTime getFirstDateIn() {
		return firstDateIn;
	}
	public void setFirstDateIn(LocalDateTime firstDateIn) {
		this.firstDateIn = firstDateIn;
	}
	public long getCardID() {
		return cardID;
	}
	public void setCardID(long cardID) {
		this.cardID = cardID;
	}
	public LocalDate getDateCreatedCard() {
		return dateCreatedCard;
	}
	public void setDateCreatedCard(LocalDate dateCreatedCard) {
		this.dateCreatedCard = dateCreatedCard;
	}
	public String getProvinceCreatedCard() {
		return provinceCreatedCard;
	}
	public void setProvinceCreatedCard(String provinceCreatedCard) {
		this.provinceCreatedCard = provinceCreatedCard;
	}
	public String getBankAccName() {
		return bankAccName;
	}
	public void setBankAccName(String bankAccName) {
		this.bankAccName = bankAccName;
	}
	public int getBankAccNum() {
		return bankAccNum;
	}
	public void setBankAccNum(int bankAccNum) {
		this.bankAccNum = bankAccNum;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
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
	public SYSUSER(int userName, String userFirstName, String userLastName, String userFullName,
			LocalDateTime dateOfBird, LocalDateTime firstDateIn, long cardID, LocalDate dateCreatedCard,
			String provinceCreatedCard, String bankAccName, int bankAccNum, String bankName, boolean deleted,
			String deletedUser, LocalDateTime deletedDate, String updatedUser, LocalDateTime updatedDate,
			String createdUser, LocalDateTime createdDate) {
		super();
		this.userName = userName;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userFullName = userFullName;
		this.dateOfBird = dateOfBird;
		this.firstDateIn = firstDateIn;
		this.cardID = cardID;
		this.dateCreatedCard = dateCreatedCard;
		this.provinceCreatedCard = provinceCreatedCard;
		this.bankAccName = bankAccName;
		this.bankAccNum = bankAccNum;
		this.bankName = bankName;
		this.deleted = deleted;
		this.deletedUser = deletedUser;
		this.deletedDate = deletedDate;
		this.updatedUser = updatedUser;
		this.updatedDate = updatedDate;
		this.createdUser = createdUser;
		this.createdDate = createdDate;
	}
	public SYSUSER() {
		super();
	}
	@Override
	public String toString() {
		return "SYSUSER [sysUserId=" + sysUserId + ", userName=" + userName + ", userFirstName=" + userFirstName
				+ ", userLastName=" + userLastName + ", userFullName=" + userFullName + ", dateOfBird=" + dateOfBird
				+ ", firstDateIn=" + firstDateIn + ", cardID=" + cardID + ", dateCreatedCard=" + dateCreatedCard
				+ ", provinceCreatedCard=" + provinceCreatedCard + ", bankAccName=" + bankAccName + ", bankAccNum="
				+ bankAccNum + ", bankName=" + bankName + ", deleted=" + deleted + ", deletedUser=" + deletedUser
				+ ", deletedDate=" + deletedDate + ", updatedUser=" + updatedUser + ", updatedDate=" + updatedDate
				+ ", createdUser=" + createdUser + ", createdDate=" + createdDate + "]";
	}
	
	
}
