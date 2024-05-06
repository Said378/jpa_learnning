package com.said.jpa.model.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Setter
@Getter
public class Audit {

	@Column(name = "created_at", nullable = false)
	private LocalDateTime createdAt;

	/**
	 * Need to be null because the first time this attribute not have a value, only
	 * with the modifications have a value.
	 **/
	@Column(name = "updated_at", nullable = true)
	private LocalDateTime updateAt;

}
