package com.thang.ShipmentOrderManagementSystem.entity;

import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Entity;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.springframework.stereotype.Component;

@Component
public class ResponeObj {
	private boolean isError;
	private String message;
	private String messageDetail;
	private Object resultObejct;

	public ResponeObj(boolean isError, String message, String messageDetail, Object resultObejct) {
		super();
		this.isError = isError;
		this.message = message;
		this.messageDetail = messageDetail;
		this.resultObejct = resultObejct;
	}

	public ResponeObj() {
		super();
	}

	public boolean isError() {
		return isError;
	}

	public void setError(boolean isError) {
		this.isError = isError;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessageDetail() {
		return messageDetail;
	}

	public void setMessageDetail(String messageDetail) {
		this.messageDetail = messageDetail;
	}

	public Object getResultObejct() {
		return resultObejct;
	}

	public void setResultObejct(Object resultObejct) {
		this.resultObejct = resultObejct;
	}

	public JSONObject setResponeObj(ResponeObj _resp) {
		JSONObject resultString = new JSONObject();
		Map resultMap = new HashMap();
		resultString.put("isError", _resp.isError);
		resultString.put("message", _resp.getMessage());
		resultString.put("messageDetail", _resp.getMessageDetail());
		resultString.put("resultObj", _resp.getResultObejct());
		return resultString;
	}

}
