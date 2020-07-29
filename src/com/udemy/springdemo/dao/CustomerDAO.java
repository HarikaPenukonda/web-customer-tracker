package com.udemy.springdemo.dao;

import java.util.List;

import com.udemy.springdemo.entity.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

}
