/**
 * Price.java 
 * 
 * @author Jefferson
 * @date   25 nov 2023 18:47:16
 *
 * Copyright (C) 2023 elAbogado
 *
 * All rights reserved.
 */
package com.zara.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.zara.utils.CurrencyEnum;

/**
 * @author Jefferson
 *
 */

@Entity
@Table(name = "PRICES")
@JsonInclude
public class Price implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BRAND_ID")
    private Brand brandId;

    @Column(name = "START_DATE")
    private LocalDateTime startDate;

    @Column(name = "END_DATE")
    private LocalDateTime endDate;

    @Column(name = "PRICE_LIST")
    private Integer priceList;

    @Column(name = "PRODUCT_ID")
    private Integer productId;

    @Column(name = "PRIORITY")
    private Integer priority;

    @Column(name = "PRICE")
    private Double price;

    @Enumerated(EnumType.STRING)
    @Column(name = "CURR")
    private CurrencyEnum currency;

    public Price() {
        
    }
  
    public Price(Integer id) {
        super();
        this.id = id;
    }

    
    public Integer getId() {
        return id;
    }

    
    public void setId(Integer id) {
        this.id = id;
    }

    
    public Brand getBrandId() {
        return brandId;
    }

    
    public void setBrandId(Brand brandId) {
        this.brandId = brandId;
    }

    
    public LocalDateTime getStartDate() {
        return startDate;
    }

    
    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    
    public LocalDateTime getEndDate() {
        return endDate;
    }

    
    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    
    public Integer getPriceList() {
        return priceList;
    }

    
    public void setPriceList(Integer priceList) {
        this.priceList = priceList;
    }

    public Integer getProductId() {
        return productId;
    }

    
    public void setProductId(Integer productId) {
        this.productId = productId;
    }
    
    public Integer getPriority() {
        return priority;
    }

    
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    
    public Double getPrice() {
        return price;
    }

    
    public void setPrice(Double price) {
        this.price = price;
    }

    
    public CurrencyEnum getCurrency() {
        return currency;
    }

    
    public void setCurrency(CurrencyEnum currency) {
        this.currency = currency;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Price)) {
            return false;
        }
        Price other = (Price) obj;
        return Objects.equals(id, other.id);
    }

}
