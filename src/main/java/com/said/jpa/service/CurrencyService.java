package com.said.jpa.service;

import com.said.jpa.model.dto.CurrencyDTO;

public interface CurrencyService {

	CurrencyDTO saveCurrency(CurrencyDTO currencyDTO);
	CurrencyDTO updateCurrency(CurrencyDTO currencyDTO);
	

}
