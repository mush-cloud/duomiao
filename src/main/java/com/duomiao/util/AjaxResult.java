package com.duomiao.util;

import java.io.Serializable;
import java.util.Map;

public class AjaxResult implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean success = false;
	private Map<String,Object> message;
    public AjaxResult() {}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public Map<String,Object> getMessage() {
		return message;
	}
	public void setMessage(Map<String,Object> map) {
		this.message = map;
	}
}
