package com.said.jpa.model.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CurrencyDTO {

	private Long id;

	private String code;

	private String description;

	private String decimalPlaces;

	private String symbol;

	private boolean enable;

	private LocalDateTime createdAt;

	private LocalDateTime updateAt;
}
