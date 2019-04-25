package com.bank.service;

import java.sql.SQLException;

import com.bank.beans.CustomerDetails;
import com.bank.exception.Customer;
import com.bank.exception.LoginException;
import com.bank.exception.UserIdException;

public interface CustomerValidation {
 CustomerDetails registration(CustomerDetails customer) throws SQLException, Customer, UserIdException;
 boolean login(long accountNo) throws SQLException, LoginException;
}
