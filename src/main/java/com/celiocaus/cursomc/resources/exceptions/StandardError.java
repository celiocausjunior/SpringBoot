package com.celiocaus.cursomc.resources.exceptions;

import java.io.Serializable;

public class StandardError implements Serializable {
	

	private static final long serialVersionUID = 1L;
	private Integer status;
	private String msg;
	private Long timeStam;
	public StandardError(Integer status, String msg, Long timeStam) {
		super();
		this.status = status;
		this.msg = msg;
		this.timeStam = timeStam;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Long getTimeStam() {
		return timeStam;
	}
	public void setTimeStam(Long timeStam) {
		this.timeStam = timeStam;
	}
	
	

	
}
