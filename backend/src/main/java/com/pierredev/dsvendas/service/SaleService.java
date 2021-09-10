package com.pierredev.dsvendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pierredev.dsvendas.dtos.SaleDTO;
import com.pierredev.dsvendas.entities.Sale;
import com.pierredev.dsvendas.repositories.SaleRepository;
import com.pierredev.dsvendas.repositories.SellerRepositoty;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepositoty sellerRepositoty;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO>findAll(Pageable pageable) {
		sellerRepositoty.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}

}
