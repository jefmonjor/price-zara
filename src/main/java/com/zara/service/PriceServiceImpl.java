/**
 * PriceServiceImpl.java 
 * 
 * @author Jefferson
 * @date   25 nov 2023 18:48:00
 *
 * Copyright (C) 2023 elAbogado
 *
 * All rights reserved.
 */
package com.zara.service;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zara.dto.PriceDTO;
import com.zara.dto.mapper.PriceMapper;
import com.zara.model.Price;
import com.zara.repository.PriceRepository;

/**
 * @author Jefferson
 *
 */
@Service
public class PriceServiceImpl implements PriceService {

    
    private PriceRepository priceRepository;

    @Autowired
    private PriceMapper priceMapper;

    public PriceDTO getPrice(LocalDateTime date,Integer productId, Integer brandId) {
        List<Price> prices = priceRepository.findPriceDate(date, productId, brandId);

        if (prices.isEmpty()) {
            return null;
        }

        Price finalPrice = prices.stream()
                .max(Comparator.comparing(Price::getPriority))
                .orElse(null);

        if (finalPrice != null) {
            PriceDTO priceDTO = priceMapper.toDto(finalPrice);

            priceDTO.setBrandId(finalPrice.getBrandId().getId()); 
            priceDTO.setPriceList(finalPrice.getPriceList()); 
            priceDTO.setStartDate(finalPrice.getStartDate()); 
            priceDTO.setPrice(finalPrice.getPrice()); 

            return priceDTO;
        } else {
            return null;
        }
    }
    
}