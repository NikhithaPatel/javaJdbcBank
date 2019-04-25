package com.bank.service;

import java.sql.SQLException;

import com.bank.beans.CustomerDetails;
import com.bank.dao.CustomerValidationDaoImpl;
import com.bank.exception.Customer;
import com.bank.exception.LoginException;
import com.bank.exception.UserIdException;

public class CustomerValidationImpl implements  CustomerValidation {
   
	CustomerValidation dao=new CustomerValidationDaoImpl();
	
	public CustomerDetails registration(CustomerDetails customer) throws SQLException, Customer, UserIdException {
	
		return dao.registration(customer);
	}

	public boolean login(long accountNo) throws SQLException, LoginException {
		
		return dao.login(accountNo);
	}

}
