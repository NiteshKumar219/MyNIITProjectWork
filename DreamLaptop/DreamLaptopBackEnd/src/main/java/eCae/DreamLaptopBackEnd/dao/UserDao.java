package eCae.DreamLaptopBackEnd.dao;

import java.util.ArrayList;

import eCae.DreamLaptopBackEnd.model.Customer;

public interface UserDao {
	boolean addCustomer(Customer c);
	ArrayList<Customer> getAllCustomers();
}
