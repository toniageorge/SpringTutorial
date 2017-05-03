package com.melvin.tonia.tutorial.service;

import java.util.List;

import com.melvin.tonia.tutorial.model.Customer;
import com.melvin.tonia.tutorial.repo.CustomerRepository;
import com.melvin.tonia.tutorial.repo.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	CustomerRepository customrepo;
	private String dbUsername;



	public void setDbUsername(String dbUsername) {
		this.dbUsername = dbUsername;
	}

	public CustomerServiceImpl() {

	}

	public CustomerServiceImpl(CustomerRepository customrepo) {

		this.customrepo = customrepo;
	}

	public void setCustomrepo(CustomerRepository customrepo) {
		this.customrepo = customrepo;
	}

	public List<Customer> getAll() {
		System.out.println(dbUsername);
		return customrepo.getAll();
	}

	

}
