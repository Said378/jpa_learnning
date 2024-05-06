package com.said.jpa.mapper;

import org.mapstruct.Mapper;

import com.said.jpa.model.dto.CurrencyDTO;
import com.said.jpa.model.entity.Currency;

@Mapper(componentModel = "spring")
public interface CurrencyMapper {
	
	CurrencyDTO currencyToCurrencyDTO(Currency currency);
	
	Currency currencyDTOToCurrency(CurrencyDTO currencyDTO);

}
