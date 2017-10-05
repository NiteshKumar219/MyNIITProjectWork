package eCae.DreamLaptopBackEnd.dao;

import java.util.ArrayList;

import eCae.DreamLaptopBackEnd.model.Supplier;

public interface SupplierDao {

	boolean addSupplier(Supplier s);
	ArrayList<Supplier>getAllsupplier();
	boolean delSupplier(int id);
	Supplier getSupplierById(int id);
}
