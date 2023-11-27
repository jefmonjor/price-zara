/**
 * PriceController.java 
 * 
 * @author Jefferson
 * @date   25 nov 2023 18:46:48
 *
 * Copyright (C) 2023 elAbogado
 *
 * All rights reserved.
 */
package com.zara.controller;



import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zara.dto.PriceDTO;
import com.zara.service.PriceServiceImpl;

/**
 * @author Jefferson
 *
 */

@RestController
@RequestMapping("/api/zara")
public class PriceController {

    @Autowired
    private PriceServiceImpl priceService;

    @GetMapping("/price")
    public ResponseEntity<PriceDTO> getPrice(
            @RequestParam Integer productId,
            @RequestParam Integer brandId,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime date) {
        PriceDTO priceDTO = priceService.getPrice(date,productId, brandId);

        if (priceDTO != null) {
            return new ResponseEntity<>(priceDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}


