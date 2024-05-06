package com.said.jpa.model;

import java.time.LocalDateTime;

import com.said.jpa.model.entity.Base;

import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

public class AuditListener {

	 @PrePersist
	    public void prePersist(Object entity) {
	        if (entity instanceof Base) {
	            Base base = (Base) entity;
	            base.getAudit().setCreatedAt(LocalDateTime.now());
	        }
	    }

	    @PreUpdate
	    public void preUpdate(Object entity) {
	        if (entity instanceof Base) {
	            Base base = (Base) entity;
	            base.getAudit().setUpdateAt(LocalDateTime.now());
	        }
	    }
}
