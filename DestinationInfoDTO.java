package com.internousdev.red.dto;

public class DestinationInfoDTO {

	private int id;
	private String userId;
	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private String email;
	private String telNumber;
	private String userAddress;
	
	public String getUserId(){
		return this.userId;
	}
	
	public void setUserId(String userId){
		this.userId = userId;
	}

	public int getId(){
		return this.id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getFamilyName(){
		return this.familyName;
	}
	public void setFamilyName(String familyname){
		this.familyName = familyname;
	}
	public String getFirstName(){
		return this.firstName;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public String getFamilyNameKana(){
		return this.familyNameKana;
	}
	public void setFamilyNameKana(String familyNameKana){
		this.familyNameKana = familyNameKana;
	}
	public String getFirstNameKana(){
		return this.firstNameKana;
	}
	public void setFirstNameKana(String firstNameKana){
		this.firstNameKana = firstNameKana;
	}
	public String getEmail(){
		return this.email;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public String getTelNumber(){
		return this.telNumber;
	}
	public void setTelNumber(String telNumber){
		this.telNumber = telNumber;
	}
	public String getUserAddress(){
		return this.userAddress;
	}
	public void setUserAddress(String userAddress){
		this.userAddress = userAddress;
	}
}