package com.melvin.tonia.tutorial.repo;

import java.util.ArrayList;
import java.util.List;

import com.melvin.tonia.tutorial.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	public List<Customer> getAll() {
		List <Customer> customers = new ArrayList<Customer>();
		 Customer customer = new Customer();
		 customer.setFirstName("Tonia");
		 customer.setLastName("Mel");
		 customers.add(customer);
		 return customers;
		
	}
}
