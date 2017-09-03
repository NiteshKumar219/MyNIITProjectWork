package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;

import com.sun.jmx.snmp.UserAcl;

import eCae.DreamLaptopBackEnd.dao.UserDao;
import eCae.DreamLaptopBackEnd.daoImpl.UserDaoImpl;
import eCae.DreamLaptopBackEnd.model.Customer;

@Controller
public class HomeController {

	/*static AnnotationConfigApplicationContext ctx;
	static UserDao userDao;
	static{
		ctx = new AnnotationConfigApplicationContext();
		ctx.scan("eCae.NisrisBackEnd");
		ctx.refresh();
		userDao = (UserDao)ctx.getBean(UserDaoImpl.class);
	}*/
	@Autowired
	UserDaoImpl userDao;
	
	@RequestMapping("/")
	public String gohome(){
		return "index";
	}
	
	@ModelAttribute("customer")
	public Customer getCustomer(){
		return new Customer();
	}
	
	@RequestMapping("/register")
	public String goregister(){
		return "register";
		
	}
	@RequestMapping("/signup")
	public String gosignup(@ModelAttribute Customer c){
		System.out.println("-------------------"+c.getEmail());
		if(userDao.addCustomer(c))
			return "index";
		else
			return "register";
	}
	
}
