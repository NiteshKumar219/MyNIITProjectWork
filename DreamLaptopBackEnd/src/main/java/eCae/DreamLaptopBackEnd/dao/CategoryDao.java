package eCae.DreamLaptopBackEnd.dao;

import java.util.ArrayList;
import eCae.DreamLaptopBackEnd.model.Category;

public interface CategoryDao {
	
boolean addCategory(Category category);

ArrayList<Category>gatAllCategory();

}
