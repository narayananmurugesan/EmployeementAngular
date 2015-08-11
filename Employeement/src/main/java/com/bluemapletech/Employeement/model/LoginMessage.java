package com.bluemapletech.Employeement.model;

/*In This class using of Error message will be show*/
public class LoginMessage {
	
	/****************declare variable************************************/
	private Object result;
	private Object error;
	private Object warning;
	private Object info;
	private Object success;
	
	/*=============================Getter and Setter Method==================*/
	public Object getError() {
		return error;
	}
	public void setError(Object error) {
		this.error = error;
	}
	public Object getWarning() {
		return warning;
	}
	public void setWarning(Object warning) {
		this.warning = warning;
	}
	public Object getInfo() {
		return info;
	}
	public void setInfo(Object info) {
		this.info = info;
	}
	public Object getResult() {
		return result;
	}
	public void setResult(Object result) {
		this.result = result;
	}
	public Object getSuccess() {
		return success;
	}
	public void setSuccess(Object success) {
		this.success = success;
	}
	

}
