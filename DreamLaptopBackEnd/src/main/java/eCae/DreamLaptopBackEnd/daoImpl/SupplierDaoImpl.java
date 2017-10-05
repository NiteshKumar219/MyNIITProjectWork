package eCae.DreamLaptopBackEnd.daoImpl;

import java.util.ArrayList;

import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;

import eCae.DreamLaptopBackEnd.dao.SupplierDao;
import eCae.DreamLaptopBackEnd.model.Category;
import eCae.DreamLaptopBackEnd.model.Supplier;

public class SupplierDaoImpl implements SupplierDao {

	@Autowired
	SessionFactory sf;
	
	public SupplierDaoImpl(SessionFactory sf){
		super();
		this.sf = sf;
	}
	
	@Override
	public boolean addSupplier(Supplier s) {
		Session ss = sf.openSession();
		Transaction t = ss.beginTransaction();
		ss.save(s);
		t.commit();
		
		return false;
	}

	@Override
	public ArrayList<Supplier> getAllsupplier() {
  ArrayList<Supplier> list;
  Session ss = sf.openSession();
  Transaction t = ss.beginTransaction();
  list = (ArrayList<Supplier>) ss.createQuery("form Supplier").list();
  t.commit();
		return null;
	}
	@Override
	public boolean delSupplier(int id){
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Supplier su=s.get(Supplier.class, id);
		s.delete(su);
		t.commit();
		return true;
	}
	@Override
	public Supplier getSupplierById(int id){
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Supplier su=s.get(Supplier.class, id);
		t.commit();
		return su;
	}

}
