/**
 * PriceService.java 
 * 
 * @author Jefferson
 * @date   25 nov 2023 18:47:44
 *
 * Copyright (C) 2023 elAbogado
 *
 * All rights reserved.
 */
package com.zara.service;

import java.time.LocalDateTime;

import com.zara.dto.PriceDTO;

/**
 * @author Jefferson
 *
 */
public interface PriceService {
    PriceDTO getPrice(LocalDateTime date,Integer productId, Integer brandId);
}