package eCae.DreamLaptopBackEnd.daoImpl;

import java.util.ArrayList;

import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import eCae.DreamLaptopBackEnd.dao.UserDao;
import eCae.DreamLaptopBackEnd.model.Customer;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	SessionFactory sf;
	
	public UserDaoImpl(SessionFactory sf){
		super();
		this.sf = sf;
	}
	@Override
	public boolean addCustomer(Customer c){
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(c);
		t.commit();
		return true;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Customer> getAllCustomers(){
		ArrayList<Customer> list;
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		list = (ArrayList<Customer>) s.createQuery("from Customer").list();
		t.commit();
		return list;
	}
}
