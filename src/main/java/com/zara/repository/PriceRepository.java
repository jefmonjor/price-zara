/**
 * PriceRepository.java 
 * 
 * @author Jefferson
 * @date   25 nov 2023 18:47:28
 *
 * Copyright (C) 2023 elAbogado
 *
 * All rights reserved.
 */
package com.zara.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.zara.model.Price;
/**
 * @author Jefferson
 *
 */
@Repository("priceRepository")
public interface PriceRepository extends CrudRepository<Price, Integer> {
        @Query("SELECT p FROM Price p WHERE (:date BETWEEN p.startDate AND p.endDate ) AND p.productId = :productId  AND p.brandId = :brandId order by priority DESC")
        List<Price> findPriceDate(@Param("date") LocalDateTime date, @Param("productId") Integer productId,  @Param("brandId") Integer brandId);
}


 
