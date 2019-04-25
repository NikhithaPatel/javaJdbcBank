package com.bank.beans;

public class CustomerDetails {
long accountNumber,mobileNumber,aadharNumber,pancardNumber;
String firstName, lastName,emailId,password,address;
float balance;
public CustomerDetails(long phoneNo,long aadhar,long pancard,String fName,String lName,String email,String password1,String address1){
    mobileNumber=phoneNo;
	aadharNumber=aadhar;
	pancardNumber=pancard;
	firstName=fName;
	lastName=lName;
	emailId=email;
	password=password1;
	address=address1;
}
public long getAadharNo() {
	return aadharNumber;
}
public void setAadharNo(long aadharNo) {
	this.aadharNumber = aadharNo;
}
public long getPancardNo() {
	return pancardNumber;
}
public void setPancardNo(long pancardNo) {
	this.pancardNumber = pancardNo;
}
public long getAccountNo() {
	return accountNumber;
}
public void setAccountNo(long accountNo) {
	this.accountNumber = accountNo;
}
public long getMobileNo() {
	return mobileNumber;
}
public void setMobileNo(long mobileNo) {
	this.mobileNumber = mobileNo;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public float getBalance() {
	return balance;
}
public void setBalance(float balance) {
	this.balance = balance;
}

}
