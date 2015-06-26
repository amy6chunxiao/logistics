package com.cqupt.business.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cqupt.business.dao.CustomerDao;
import com.cqupt.business.model.Customer;
import com.cqupt.business.service.CustomerService;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	@Resource
	private CustomerDao customerDao;

	@Resource(name = "customerDao")
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public List<Customer> findAllCustomer() {
		return customerDao.findAllCustomer();
	}

	@Override
	public Customer findCustomerById(int id) {
		return customerDao.findCustomerById(id);
	}

	@Override
	public boolean addCustomer(Customer customer) {
		return customerDao.addCustomer(customer)!=0;
	}

	@Override
	public boolean deleteCustomer(int id) {
		return customerDao.deleteCustomer(id)!=0;
	}

	@Override
	public boolean batchDeleteCustomer(int id) {
		return customerDao.batchDeleteCustomer(id)!=0;
	}

	@Override
	public boolean changeCustomer(int id, Customer customer) {
		return customerDao.changeCustomer(id, customer)!=0;
	}

}
