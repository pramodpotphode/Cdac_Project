package com.app.services;

import java.util.List;

import com.app.pojos.Seller;

public interface SellerService {
	Seller registerSeller(Seller seller);
	List<Seller> allSellers();
	Seller findById(int id);
	Seller validate(String userid,String pwd);
	void deleteSeller(int id);
	void updateSellerStatus(String status,int id);
	
}
