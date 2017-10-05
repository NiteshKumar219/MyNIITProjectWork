package com.niit.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import eCae.DreamLaptopBackEnd.daoImpl.CategoryDaoImpl;

import eCae.DreamLaptopBackEnd.model.Category;


@Controller
public class CategoryController {

	
	//@Autowired
	//CategoryDaoImpl categoryDao;
	static AnnotationConfigApplicationContext ctx;
	static CategoryDaoImpl categoryDao;
	static{
		ctx = new AnnotationConfigApplicationContext();
		ctx.scan("eCae.DreamLaptopBackEnd");
		ctx.refresh();
		categoryDao = (CategoryDaoImpl)ctx.getBean("CategoryDaoImpl");
	}
	
	@ModelAttribute("category")
	public Category getCategory(){
		return new Category();
	}
	
	@RequestMapping("/category")
	public ModelAndView gocategory(){
		ModelAndView m = new ModelAndView("category");
		m.addObject("clist",categoryDao.gatAllCategory());
		return m;
		
	}
	@RequestMapping("/addcategory")
	public String goaddcategory(){
		return "addcategory";
	}
	@RequestMapping("/saveCat")
	public ModelAndView gosaveCat(@ModelAttribute Category c){
       categoryDao.addCategory(c);
       	ModelAndView m = new ModelAndView("category");
		m.addObject("clist",categoryDao.gatAllCategory());
		return m;	
		
	}
	@RequestMapping("/viewCategory")
	public ModelAndView viewCat()
	{
		ModelAndView m = new ModelAndView("category");
		m.addObject("clist",categoryDao.gatAllCategory());
		return m;
	}
	@RequestMapping("/del/{id}")
	public String delCat(@PathVariable("id")int id){
		categoryDao.delCategory(id);
		return "redirect:/viewCategory";
	}
	@RequestMapping("/edit/{id}")
	public ModelAndView editCat(@PathVariable("id")int id){
		Category c = categoryDao.getCategoryById(id);
		ModelAndView m = new ModelAndView("addcategory");
		m.addObject("category",c);
		return m;
	}
}
