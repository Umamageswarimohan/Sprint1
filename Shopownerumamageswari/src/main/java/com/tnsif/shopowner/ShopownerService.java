package com.tnsif.shopowner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class ShopownerService {
	@Autowired
	private ShopownerRepository repo;
	//Inserting the records to the table in database
	public void insertRecord(Shopowner cust)
	{
		repo.save(cust);
	}
	
	//Show all the records from the table in database
	public List<Shopowner> getAllRecords()
	{
		return repo.findAll();
	}
	
	//Show specific record from the table in database
	public Shopowner getCustomerById(Integer id)
	{
		return repo.findById(id).orElse(null);
	}
	
	//Deleting the specific record from the table in database
	public void deleteShopowner(Integer id)
	{
		repo.deleteById(id);
	}
	
	//updating the existing record
	public void updateShopowner(Integer id,Shopowner updateShopowner)
	{
		 Shopowner existingShopowner = repo.findById(id).orElse(null);
		 if(existingShopowner!=null)
		{
			existingShopowner.setCid(updateShopowner.getCid());
			existingShopowner.setCname(updateShopowner.getCname());
			existingShopowner.setAddress(updateShopowner.getAddress());
			repo.save(existingShopowner);
		}
	}

}
