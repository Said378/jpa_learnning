package com.said.jpa.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.said.jpa.model.dto.CurrencyDTO;
import com.said.jpa.service.CurrencyService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/v1/currencies")
@RequiredArgsConstructor
public class CurrencyController {

	private final CurrencyService currencyService;

	@PostMapping
	public ResponseEntity<CurrencyDTO> saveCurrency(@RequestBody @Valid CurrencyDTO currencyDTO) {

	
		CurrencyDTO currency = currencyService.saveCurrency(currencyDTO);

		return ResponseEntity.status(HttpStatus.CREATED).body(currency);
	}

	@PutMapping
	public ResponseEntity<CurrencyDTO> updateCurrency(@RequestBody CurrencyDTO currencyDTO) {

		CurrencyDTO currency = currencyService.saveCurrency(currencyDTO);

		return ResponseEntity.status(HttpStatus.OK).body(currency);
	}

}
