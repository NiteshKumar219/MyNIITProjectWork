/*package eCae.NisrisBackEnd;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import eCae.NisrisBackEnd.dao.UserDao;
import eCae.NisrisBackEnd.daoImpl.UserDaoImpl;
import eCae.NisrisBackEnd.model.Customer;

public class CustomerTest {

	@Test
	public void test() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("eCae.NisrisBackEnd");
		ctx.refresh();
		UserDao ud = (UserDao)ctx.getBean(UserDaoImpl.class);
		
		Customer c = new Customer();
		c.setEmail("asd@a.c");
		c.setName("asd");
		c.setPhno("1233123");
		assertTrue(ud.addCustomer(c));
	}
}
*/