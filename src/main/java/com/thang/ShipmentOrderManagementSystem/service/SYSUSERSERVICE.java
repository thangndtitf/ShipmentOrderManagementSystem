package com.thang.ShipmentOrderManagementSystem.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thang.ShipmentOrderManagementSystem.entity.SYSUSER;
import com.thang.ShipmentOrderManagementSystem.repository.SYSUSERREPO;

@Service
public class SYSUSERSERVICE {
	private final SYSUSERREPO sysUserRepo;
	
	
	@Autowired
	public SYSUSERSERVICE(SYSUSERREPO sysUserRepo) {
		super();
		this.sysUserRepo = sysUserRepo;
	}



	public List<SYSUSER> searchAllUser(){
		List<SYSUSER> resultList = sysUserRepo.findAll();
		for (SYSUSER sysuser : resultList) {
			
			if(sysuser.isDeleted() == true) {
				resultList.remove(sysuser);
			}
		}
		if(resultList.isEmpty()) {
			throw new IllegalStateException("The User is Empty");
		}
		
		
		
		
		
		return resultList;
	}
	

	
}
