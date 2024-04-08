package com.tnsif.shopowner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


public class ShopownerController {
	@Autowired
	private Shopowner service;
	
	@PostMapping("/Shopownerservice")
	public void add(@RequestBody Shopowner cust)
	{
		service.insertRecord(cust);
	}
	
	
	@GetMapping("/Shopownerservice")
	public List<Shopowner> ShowAll()
	{
		return service.getAllRecords();
	}

	
	@GetMapping("/customerservice/{id}")
	public shopowner getCustomerById(@PathVariable Integer id)
	{
		return service.getCustomerById(id);
	}
	
	@DeleteMapping("/customerservice/{id}")
	public void deleteCustomer(@PathVariable Integer id)
	{
		service.deleteCustomer(id);
	}
	
	@PutMapping("/customerservice/{id}")
	public ResponseEntity<String> updateShopowner(@PathVariable Integer id,@RequestBody Shopowner updatedCustomer)
	{
		service.updateShopowner(id,updatedShopowner);
		return ResponseEntity.ok("Shopowner updated Successfully");
	}
		


}
