/**
 * PriceDTO.java 
 * 
 * @author Jefferson
 * @date   25 nov 2023 18:47:02
 *
 * Copyright (C) 2023 elAbogado
 *
 * All rights reserved.
 */
package com.zara.dto;

import java.time.LocalDateTime;

import com.zara.utils.CurrencyEnum;

/**
 * @author Jefferson
 *
 */
public class PriceDTO {

    private Integer id;
    private Integer brandId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Integer priceList;
    private Integer productId;
    private Integer priority;
    private Double price;
    private CurrencyEnum currency;

    public PriceDTO() {
    }

    
    public Integer getId() {
        return id;
    }

    
    public void setId(Integer id) {
        this.id = id;
    }

    
    public Integer getBrandId() {
        return brandId;
    }

    
    public void setBrandId(Integer brandId) {
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

    
}