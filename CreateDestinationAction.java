package com.internousdev.red.action;

import java.util.Map;
import java.util.Objects;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class CreateDestinationAction extends ActionSupport implements SessionAware{

	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private String userAddress;
	private String telNumber;
	private String email;

	private int backFlag;
	private Map<String, Object> session;

public String execute(){

	// セッションタイムアウトの判定
	if(Objects.isNull(session.get("userId")) && Objects.isNull(session.get("tempUserId"))){
		return "sessionTimeout";
	}

	if (backFlag != 1) {
		session.remove("familyName");
		session.remove("firstName");
		session.remove("familyNameKana");
		session.remove("firstNameKana");
		session.remove("email");
		session.remove("telNumber");
		session.remove("userAddress");
	}
	return SUCCESS;
}
public int getBackFlag() {
	return backFlag;
}

public void setBackFlag(int backFlag) {
	this.backFlag = backFlag;
}
public Map<String, Object> getSession() {
	return session;
}
public void setSession(Map<String, Object> session) {
	this.session = session;
}
public String getFamilyName() {
	return familyName;
}
public void setFamilyName(String familyName) {
	this.familyName = familyName;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getFamilyNameKana() {
	return familyNameKana;
}
public void setFamilyNameKana(String familyNameKana) {
	this.familyNameKana = familyNameKana;
}
public String getFirstNameKana() {
	return firstNameKana;
}
public void setFirstNameKana(String firstNameKana) {
	this.firstNameKana = firstNameKana;
}
public String getUserAddress() {
	return userAddress;
}
public void setUserAddress(String userAddress) {
	this.userAddress = userAddress;
}
public String getTelNumber() {
	return telNumber;
}
public void setTelNumber(String telNumber) {
	this.telNumber = telNumber;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}
