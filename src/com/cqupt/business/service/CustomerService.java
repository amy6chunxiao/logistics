package com.cqupt.business.service;

import com.cqupt.business.model.Customer;

public interface CustomerService {
	public Customer checkCustomer(String name, String password);

	public boolean addCustomer(Customer customer);

	public boolean deleteCustomer(int id);

	public boolean changeCustomer(int id, Customer customer);
}
