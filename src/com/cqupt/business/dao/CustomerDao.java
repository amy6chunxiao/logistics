package com.cqupt.business.dao;

import java.util.List;

import com.cqupt.business.model.Customer;

public interface CustomerDao {
	public List<Customer> findAllCustomer();

	public Customer findCustomerById(int id);
}
