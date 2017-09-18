package eCae.DreamLaptopBackEnd.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Supplier {
	
@Id
private int sid;
private String sname;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}


}
