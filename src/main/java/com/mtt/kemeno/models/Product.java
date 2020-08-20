package com.mtt.kemeno.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
@Entity
@Table(name = "pim_catalog_product")

public class Product {
	@Id
    @GeneratedValue
    private Long id;
	
	private String code;
	
	private Boolean isActive;
	
	
	public Product() {
		
	}

	public String getCode() {
		return code;
	}
	

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
}
