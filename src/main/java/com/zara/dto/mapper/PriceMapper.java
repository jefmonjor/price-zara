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
package com.zara.dto.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;
import org.mapstruct.Named;

import com.zara.dto.PriceDTO;
import com.zara.model.Brand;
import com.zara.model.Price;

/**
 * @author Jefferson
 *
 */
@Mapper(componentModel = "spring")
public interface PriceMapper {

    @Mappings({
        @Mapping(source = "brandId.id", target = "brandId"),
        @Mapping(source = "startDate", target = "startDate"),
        @Mapping(source = "endDate", target = "endDate"),
        @Mapping(source = "productId", target = "productId"),
        @Mapping(source = "priceList", target = "priceList"),
        @Mapping(source = "priority", target = "priority"),
        @Mapping(source = "price", target = "price"),
        @Mapping(source = "currency", target = "currency")
    })
    void updateDtoFromEntity(Price price, @MappingTarget PriceDTO priceDTO);

    default PriceDTO toDto(Price price) {
        if (price == null) {
            return null;
        }
        PriceDTO priceDTO = new PriceDTO();
        updateDtoFromEntity(price, priceDTO);
        return priceDTO;
    }

    @InheritInverseConfiguration
    Price toEntity(PriceDTO priceDTO);

    List<PriceDTO> toDtoList(List<Price> prices);

    @Named("mapBrandId")
    default Brand mapBrandId(Integer brandId) {
        Brand brand = new Brand();
        brand.setId(brandId);
        return brand;
    }
}

