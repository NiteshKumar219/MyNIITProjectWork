package com.niit.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import eCae.DreamLaptopBackEnd.daoImpl.SupplierDaoImpl;
import eCae.DreamLaptopBackEnd.model.Supplier;

@Controller
public class SupplierController {

	
	static AnnotationConfigApplicationContext ctx;
	static SupplierDaoImpl supplierDao;
	static{
		ctx = new AnnotationConfigApplicationContext();
		ctx.scan("eCae.DreamLaptopBackEnd");
		ctx.refresh();
		supplierDao = (SupplierDaoImpl)ctx.getBean("SupplierDaoImpl");
	}
	
	@ModelAttribute("supplier")
	public Supplier getSupplier(){
		return new Supplier();
	}
	
	@RequestMapping("/supplier")
	public String gosupplier(){
		supplierDao.getAllsupplier();
		return "supplier";
		
	}
	
	@RequestMapping("/addsupplier")
	public String goaddsupplier(){
		return "addsupplier";
	}
	@RequestMapping("/SCat")
	public ModelAndView goSCat(@ModelAttribute Supplier c){
		supplierDao.addSupplier(c);
		ModelAndView m = new ModelAndView("supplier");
		m.addObject("slist",supplierDao.getAllsupplier());
		return m;	
		
	}
	@RequestMapping("/viewSupplier")
	public ModelAndView viewCat()
	{
		ModelAndView m = new ModelAndView("supplier");
		m.addObject("slist",supplierDao.getAllsupplier());
		return m;
	}
	@RequestMapping("/delsup/{id}")
	public String delsupSup(@PathVariable("id")int id){
		supplierDao.delSupplier(id);
		return "redirect:/viewSupplier";
	}
	@RequestMapping("/editsup/{id}")
	public ModelAndView editsupSup(@PathVariable("id")int id){
		Supplier s = supplierDao.getSupplierById(id);
		ModelAndView m = new ModelAndView("addsupplier");
		m.addObject("supplier",s);
		return m;
	}
}




