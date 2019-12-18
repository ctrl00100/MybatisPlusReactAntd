package com.example.my.mybatispp.config;

public class RestResult {


	private boolean flag;
	private Integer status;
	private String message;
	private Object data;



	public RestResult(boolean flag, Integer status, String message, Object data) {
		super();
		this.flag = flag;
		this.status = status;
		this.message = message;
		this.data = data;
	}

	public RestResult(boolean flag, Integer status, String message) {
		super();
		this.flag = flag;
		this.status = status;
		this.message = message;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
