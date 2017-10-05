package com.niit.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import eCae.DreamLaptopBackEnd.daoImpl.ProductDaoImpl;
import eCae.DreamLaptopBackEnd.model.Product;

@Controller
public class ProductController {
	//@Autowired
		//ProductDaoImpl productDao;
		static AnnotationConfigApplicationContext ctx;
		static ProductDaoImpl productDao;
		static{
			ctx = new AnnotationConfigApplicationContext();
			ctx.scan("eCae.DreamLaptopBackEnd");
			ctx.refresh();
			productDao = (ProductDaoImpl)ctx.getBean("ProductDaoImpl");
		}
		
		@ModelAttribute("product")
		public Product getProduct(){
			return new Product();
		}
		
		@RequestMapping("/product")
		public String goproduct(){
			productDao.getAllProduct();
			return "product";
			
		}
		
		@RequestMapping("/addproduct")
		public String goaddproduct(){
			return "addproduct";
		}
		@RequestMapping("/PCat")
		public ModelAndView goPCat(@ModelAttribute Product c){
			productDao.addProduct(c);
	       	ModelAndView m = new ModelAndView("product");
			m.addObject("plist",productDao.getAllProduct());
			return m;	
			
		}
		@RequestMapping("/viewProduct")
		public ModelAndView PCat()
		{
			ModelAndView m = new ModelAndView("product");
			m.addObject("plist",productDao.getAllProduct());
			return m;
		}
		@RequestMapping("/delpro/{id}")
		public String delproPro(@PathVariable("id")int id){
			productDao.delproProduct(id);
			return "redirect:/viewProduct";
		}
		@RequestMapping("/editpro/{id}")
		public ModelAndView editproCat(@PathVariable("id")int id){
			Product p = productDao.getProductById(id);
			ModelAndView m = new ModelAndView("addproduct");
			m.addObject("product",p);
			return m;
		}
	}

	



