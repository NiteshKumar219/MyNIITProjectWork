package eCae.DreamLaptopBackEnd.dao;

import java.util.ArrayList;

import eCae.DreamLaptopBackEnd.model.Category;
import eCae.DreamLaptopBackEnd.model.Product;

public interface ProductDao {
	
		boolean addProduct(Product productdao);
		
		ArrayList<Product>getAllProduct();
		
		Product getProductById(int id);
		
		boolean delproProduct(int id);

}
