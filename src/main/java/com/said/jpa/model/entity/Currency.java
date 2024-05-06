package com.said.jpa.model.entity;

import com.said.jpa.model.AuditListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "currencies")
@EntityListeners(AuditListener.class)
public class Currency extends Base {

	@Column(name = "code")
	@NotBlank(message = "Code is required")
	private String code;

	@Column(name = "description")
	@NotBlank(message = "Description is required")
	private String description;

	@Column(name = "decimal_places")
	@Min(value = 1, message = "Decimal places must be greater than or equal to 0")
	@Max(value = 5, message = "Decimal places must be less than or equal to 5")
	private String decimalPlaces;

	@Column(name = "symbol")
	@NotBlank(message = "Symbol is required")
	private String symbol;

	@Column(name = "enable")
	@NotNull(message = "The status of the currency is required")
	private boolean enable;
}
