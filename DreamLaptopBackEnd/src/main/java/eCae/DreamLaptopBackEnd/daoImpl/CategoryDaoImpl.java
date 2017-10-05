package eCae.DreamLaptopBackEnd.daoImpl;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import eCae.DreamLaptopBackEnd.dao.CategoryDao;
import eCae.DreamLaptopBackEnd.model.Category;


@Repository
public class CategoryDaoImpl implements CategoryDao  {
	@Autowired
	SessionFactory sf;
	
	public CategoryDaoImpl(SessionFactory sf){
		super();
		this.sf = sf;
	}
	
	@Override
	public boolean addCategory(Category category){
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.saveOrUpdate(category);
		t.commit();
		return true;
	}
		
		@Override
		public ArrayList<Category> gatAllCategory() {
			ArrayList<Category> list;
			Session s = sf.openSession();
			Transaction t = s.beginTransaction();
			list = (ArrayList<Category>) s.createQuery("from Category").list();
			t.commit();
			return list;
		}
		@Override
		public boolean delCategory(int id){
			Session s = sf.openSession();
			Transaction t = s.beginTransaction();
			Category c=s.get(Category.class, id);
			s.delete(c);
			t.commit();
			return true;
		}
		@Override
		public Category getCategoryById(int id){
			Session s = sf.openSession();
			Transaction t = s.beginTransaction();
			Category c=s.get(Category.class, id);
			t.commit();
			return c;
		}
	}

