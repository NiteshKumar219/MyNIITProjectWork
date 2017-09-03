package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import eCae.DreamLaptopBackEnd.dao.CategoryDao;
import eCae.DreamLaptopBackEnd.daoImpl.CategoryDaoImpl;
import eCae.DreamLaptopBackEnd.daoImpl.ProductDaoImpl;
import eCae.DreamLaptopBackEnd.daoImpl.SupplierDaoImpl;
import eCae.DreamLaptopBackEnd.model.Category;

@Controller
public class adminController {

	@Autowired
	CategoryDaoImpl categoryDaoImpl;
	@Autowired
	ProductDaoImpl productDaoImpl;
	@Autowired
	SupplierDaoImpl supplierDaoImpl;
	
	@RequestMapping("/addPage")
	public ModelAndView goToLogin()
	{
	ModelAndView mav = new ModelAndView();
	mav.setViewName("adding");
	return mav;
	
	}
	@ModelAttribute
	public void addAttributes(Model m) {
		m.addAttribute("catList",categoryDaoImpl.gatAllCategory());
		m.addAttribute("suppList",supplierDaoImpl.getAllsupplier());

		m.addAttribute("prodList",productDaoImpl.getAllProduct());

	}
	
	@RequestMapping(value="/saveCat",method = RequestMethod.POST)
	public ModelAndView saveRegister(@RequestParam("cid")int cid,@RequestParam("name")String name)

	{
		ModelAndView mv = new ModelAndView();
		Category c = new Category();
		c.setCid(cid);
		c.setName(name);
		categoryDaoImpl.addCategory(c);
		mv.setViewName("index");
		return mv;
	}
		
		
	}

