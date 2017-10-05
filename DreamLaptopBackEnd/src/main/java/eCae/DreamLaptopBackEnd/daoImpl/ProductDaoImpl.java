package eCae.DreamLaptopBackEnd.daoImpl;

import java.util.ArrayList;


import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import eCae.DreamLaptopBackEnd.dao.ProductDao;
import eCae.DreamLaptopBackEnd.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao{
	
@Autowired
SessionFactory sf;

public ProductDaoImpl(SessionFactory sf){
	super();
	this.sf = sf;
}

	@Override
	public boolean addProduct(Product productdao) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(productdao);
		t.commit();
		return false;
	}

	@Override
	public ArrayList<Product> getAllProduct() {
		ArrayList<Product> list;
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		list = (ArrayList<Product>) s.createQuery("from Product").list();
		t.commit();
		return null;
	}
	@Override
	public boolean delproProduct(int id){
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Product p=s.get(Product.class, id);
		s.delete(p);
		t.commit();
		return true;
	}
	@Override
	public Product getProductById(int id){
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Product p=s.get(Product.class, id);
		t.commit();
		return p;
	}

}
