/**
 * PriceControllerIntegrationTest.java 
 * 
 * @author Jefferson
 * @date   25 nov 2023 20:59:45
 *
 * Copyright (C) 2023 elAbogado
 *
 * All rights reserved.
 */
package com.zara.prueba;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.time.LocalDateTime;
import java.time.Month;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.zara.dto.PriceDTO;
import com.zara.service.PriceServiceImpl;

/**
 * @author Jefferson
 *
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class PriceControllerTest {
    

    @Autowired
    private PriceServiceImpl priceServiceImpl;

    
    @MockBean
    private PriceServiceImpl mockPriceServiceImpl;
    
    @Test
    public void test1() {
        LocalDateTime date = LocalDateTime.of(2020, Month.JUNE, 14, 10, 0, 0);
        int productId = 35455;
        int brandId = 1;

        final PriceDTO mockPrice = new PriceDTO();
        mockPrice.setId(1);
        mockPrice.setBrandId(1);
        mockPrice.setProductId(35455);
        mockPrice.setPrice(30.35);
        mockPrice.setPriceList(1);
        mockPrice.setStartDate(LocalDateTime.of(2020, Month.JUNE, 14, 0, 0, 0));
        mockPrice.setEndDate(LocalDateTime.of(2020, Month.DECEMBER, 31, 23, 59, 59));

        when(mockPriceServiceImpl.getPrice(date, 1, 35455)).thenReturn(mockPrice);

        PriceDTO result = priceServiceImpl.getPrice(date, 1, 35455);

        assertNotNull(result);
        assertEquals(1, result.getId());
        assertEquals(productId, result.getProductId());
        assertEquals(brandId, result.getBrandId());
        assertEquals(30.35, result.getPrice(), 0.01);

    }
    
    @Test
    public void test2() {
        LocalDateTime date = LocalDateTime.of(2020, Month.JUNE, 14, 16, 0, 0);
        int productId = 35455;
        int brandId = 1;

        final PriceDTO mockPrice = new PriceDTO();
        mockPrice.setId(2);
        mockPrice.setBrandId(1);
        mockPrice.setProductId(35455);
        mockPrice.setPrice(25.45);
        mockPrice.setPriceList(1);
        mockPrice.setStartDate(LocalDateTime.of(2020, Month.JUNE, 14, 15, 0, 0));
        mockPrice.setEndDate(LocalDateTime.of(2020, Month.JUNE, 15, 23, 59, 59));

        when(mockPriceServiceImpl.getPrice(date, 1, 35455)).thenReturn(mockPrice);

        PriceDTO result = priceServiceImpl.getPrice(date, 1, 35455);

        assertNotNull(result);
        assertEquals(2, result.getId());
        assertEquals(productId, result.getProductId());
        assertEquals(brandId, result.getBrandId());
        assertEquals(25.45, result.getPrice(), 0.01);
    }
    
    @Test
    public void test3() {
        LocalDateTime date = LocalDateTime.of(2020, Month.JUNE, 14, 21, 0, 0);
        int productId = 35455;
        int brandId = 1;

        final PriceDTO mockPrice = new PriceDTO();
        mockPrice.setId(3);
        mockPrice.setBrandId(1);
        mockPrice.setProductId(35455);
        mockPrice.setPrice(35.50);
        mockPrice.setPriceList(1);
        mockPrice.setStartDate(LocalDateTime.of(2020, Month.JUNE, 14, 15, 0, 0));
        mockPrice.setEndDate(LocalDateTime.of(2020, Month.JUNE, 15, 23, 59, 59));

        when(mockPriceServiceImpl.getPrice(date, 1, 35455)).thenReturn(mockPrice);

        PriceDTO result = priceServiceImpl.getPrice(date, 1, 35455);

        assertNotNull(result);
        assertEquals(3, result.getId());
        assertEquals(productId, result.getProductId());
        assertEquals(brandId, result.getBrandId());
        assertEquals(35.50, result.getPrice(), 0.01);
    }
    
    @Test
    public void test4() {
        LocalDateTime date = LocalDateTime.of(2020, Month.JUNE, 15, 10, 0, 0);
        int productId = 35455;
        int brandId = 1;

        final PriceDTO mockPrice = new PriceDTO();
        mockPrice.setId(4);
        mockPrice.setBrandId(1);
        mockPrice.setProductId(35455);
        mockPrice.setPrice(30.50);
        mockPrice.setPriceList(1);
        mockPrice.setStartDate(LocalDateTime.of(2020, Month.JUNE, 14, 15, 0, 0));
        mockPrice.setEndDate(LocalDateTime.of(2020, Month.JUNE, 15, 23, 59, 59));

        when(mockPriceServiceImpl.getPrice(date, 1, 35455)).thenReturn(mockPrice);

        PriceDTO result = priceServiceImpl.getPrice(date, 1, 35455);

        assertNotNull(result);
        assertEquals(4, result.getId());
        assertEquals(productId, result.getProductId());
        assertEquals(brandId, result.getBrandId());
        assertEquals(30.50, result.getPrice(), 0.01);
    }
    
    @Test
    public void test5() {
        LocalDateTime date = LocalDateTime.of(2020, Month.JUNE, 21, 0, 0, 0);
        int productId = 35455;
        int brandId = 1;

        final PriceDTO mockPrice = new PriceDTO();
        mockPrice.setId(5);
        mockPrice.setBrandId(1);
        mockPrice.setProductId(35455);
        mockPrice.setPrice(38.95);
        mockPrice.setPriceList(1);
        mockPrice.setStartDate(LocalDateTime.of(2020, Month.JUNE, 14, 15, 0, 0));
        mockPrice.setEndDate(LocalDateTime.of(2020, Month.JUNE, 15, 23, 59, 59));

        when(mockPriceServiceImpl.getPrice(date, 1, 35455)).thenReturn(mockPrice);

        PriceDTO result = priceServiceImpl.getPrice(date, 1, 35455);

        assertNotNull(result);
        assertEquals(5, result.getId());
        assertEquals(productId, result.getProductId());
        assertEquals(brandId, result.getBrandId());
        assertEquals(38.95, result.getPrice(), 0.01);
    }
}