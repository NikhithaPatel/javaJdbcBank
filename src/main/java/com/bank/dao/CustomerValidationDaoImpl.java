package com.bank.dao;
import com.bank.beans.CustomerDetails;
import com.bank.exception.Customer;
import com.bank.exception.LoginException;
import com.bank.exception.UserIdException;
import com.bank.service.CustomerValidation;
import com.bank.ui.MainUi;
import com.bank.utility.*;
import java.sql.*;
import java.util.Scanner;


public class CustomerValidationDaoImpl implements  CustomerValidation {
	
	OracleConnection connect=new OracleConnection();
	Connection connect1=connect.dataConnection();
    
	Scanner sc= new Scanner(System.in);
	CustomerDetails customer=new CustomerDetails(0, 0, 0, null, null, null, null, null);
	
	public CustomerDetails registration(CustomerDetails customer) throws SQLException,Customer, UserIdException {
	
		long aadhar=customer.getAadharNo();
		String email=customer.getEmailId();
		
		PreparedStatement ps=connect1.prepareStatement("select aadhar_number,email_id from bankcustomer");
		ResultSet rs=ps.executeQuery();	
		
		while(rs.next()) {
			long aadharNos=rs.getLong("aadhar_nnumber");
			String emailIds=rs.getString("email_id");
			if(Long.compare(aadhar, aadharNos)==0) 
				throw new Customer("Customer aleady exists");
			else if(email.compareTo(emailIds)==0) 
				throw new UserIdException("User id already exists create another id");
		else {
				PreparedStatement ps1=connect1.prepareStatement("insert into bankcustomer (first_name,last_name,"
					+ "email_id,password,pancard_number,aadhar_number,address,mobile_number,balance) values(?,?,?,?,?,?,?,?,?)");
				
				ps1.setString(1,customer.getFirstName());
				ps1.setString(2,customer.getLastName());
				ps1.setString(3,customer.getEmailId());
				ps1.setString(4,customer.getPassword());
				ps1.setLong(5,customer.getPancardNo());
				ps1.setLong(6,customer.getAadharNo());
				ps1.setString(7,customer.getAddress());
				ps1.setLong(8,customer.getMobileNo());
				ps1.setFloat(9,customer.getBalance());
		}
		}
				return customer;
		}
	
	
	

	public boolean login(long accountNo) throws SQLException,LoginException {
		long accountNumber=accountNo;
	
		PreparedStatement ps1=connect1.prepareStatement("select account_number from bankcustomer");
		ResultSet rs1=ps1.executeQuery();
		boolean flag=false;
		while(rs1.next()) {
			long accountNumbers=rs1.getLong("account_number");
			if(Long.compare(accountNumber,accountNumbers)!=0) 
					throw new LoginException("Userid does not exist");
			else 
		       flag=true;
			break;
		}
		return true;
	}




	



	
}
