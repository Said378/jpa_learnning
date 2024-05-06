package com.said.jpa.model.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Embedded;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.EqualsAndHashCode;

@MappedSuperclass
@EqualsAndHashCode
public abstract class Base {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Embedded
	private Audit audit;

	public Audit getAudit() {
		if (audit == null) {
			audit = new Audit();
		}
		return audit;
	}
//
//	@PrePersist
//	public void fillCreatedAt() {
//		getAudit().setCreatedAt(LocalDateTime.now());
//	}
//
//	@PreUpdate
//	public void fillUpdatedAt() {
//		getAudit().setUpdateAt(LocalDateTime.now());
//	}

}
