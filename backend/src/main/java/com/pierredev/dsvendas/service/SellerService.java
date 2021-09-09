package com.pierredev.dsvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pierredev.dsvendas.dtos.SellerDTO;
import com.pierredev.dsvendas.entities.Seller;
import com.pierredev.dsvendas.repositories.SellerRepositoty;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepositoty repositoty;
	
	public List<SellerDTO> findALl() {
		List<Seller> result = repositoty.findAll();
 		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}

}
