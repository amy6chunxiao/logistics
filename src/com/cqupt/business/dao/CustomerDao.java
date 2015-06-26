package com.cqupt.business.dao;

import com.cqupt.business.model.Customer;

public interface CustomerDao {

	public Customer checkCustomer(String name, String password);

	public int addCustomer(Customer customer);

	public int deleteCustomer(int id);

	public int changeCustomer(int id, Customer customer);
}
