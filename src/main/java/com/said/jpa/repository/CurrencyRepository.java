package com.said.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.said.jpa.model.entity.Currency;

public interface CurrencyRepository extends JpaRepository<Currency, Long> {

}
