package com.tnsif.shopowner;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class Shopowner {@Id
	@Column(name="cid")
	private int cid;

	@Column(name="cname")
	private String cname;
	
	@Column(name="address")
	private String address;

	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Shopowner() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Shopowner(int cid, String cname, String address) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", address=" + address + "]";
	}
	public List<Shopowner> getAllRecords() {
		// TODO Auto-generated method stub
		return null;
	}
	
}


