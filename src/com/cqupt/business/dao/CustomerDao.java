package com.cqupt.business.dao;

import java.util.List;

import com.cqupt.business.model.Customer;

public interface CustomerDao {
	public List<Customer> findAllCustomer();

	public Customer findCustomerById(int id);
	
	public boolean addCustomer(Customer customer);

	public boolean deleteCustomer(int id);

	public boolean batchDeleteCustomer(int id);

	public boolean changeCustomer(int id, Customer customer);
}
