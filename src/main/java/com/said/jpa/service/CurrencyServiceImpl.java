package com.said.jpa.service;

import org.springframework.stereotype.Service;

import com.said.jpa.mapper.CurrencyMapper;
import com.said.jpa.model.dto.CurrencyDTO;
import com.said.jpa.model.entity.Currency;
import com.said.jpa.repository.CurrencyRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CurrencyServiceImpl implements CurrencyService {

	private final CurrencyRepository repository;

	private final CurrencyMapper mapper;

	@Override
	public CurrencyDTO saveCurrency( CurrencyDTO currencyDTO) {
		Currency currency = mapper.currencyDTOToCurrency(currencyDTO);
		currency = repository.save(currency);
		return mapper.currencyToCurrencyDTO(currency);
	}

	@Override
	public CurrencyDTO updateCurrency(CurrencyDTO currencyDTO) {
		Currency currency = mapper.currencyDTOToCurrency(currencyDTO);
		currency = repository.save(currency);
		return mapper.currencyToCurrencyDTO(currency);
	}

}
