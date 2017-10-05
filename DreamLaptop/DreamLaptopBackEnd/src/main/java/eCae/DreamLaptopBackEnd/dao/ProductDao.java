package eCae.DreamLaptopBackEnd.dao;

import java.util.ArrayList;

import eCae.DreamLaptopBackEnd.model.Product;

public interface ProductDao {
	boolean addProduct(Product productdao);
	ArrayList<Product>getAllProduct();

}
