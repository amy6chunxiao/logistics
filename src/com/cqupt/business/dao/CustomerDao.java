package com.cqupt.business.dao;

import java.util.List;

import com.cqupt.business.model.Customer;

public interface CustomerDao {
	public List<Customer> findAllCustomer();

	public Customer findCustomerById(int id);
	
	public int addCustomer(Customer customer);

	public int deleteCustomer(int id);

	public int batchDeleteCustomer(int id);

	public int changeCustomer(int id, Customer customer);
}
