package com.pierredev.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pierredev.dsvendas.entities.Seller;

public interface SellerRepositoty extends JpaRepository<Seller, Long> {

}
