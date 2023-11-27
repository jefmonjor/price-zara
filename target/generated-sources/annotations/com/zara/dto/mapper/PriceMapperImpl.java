package com.zara.dto.mapper;

import com.zara.dto.PriceDTO;
import com.zara.model.Brand;
import com.zara.model.Price;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-27T02:32:35+0100",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.18 (Oracle Corporation)"
)
@Component
public class PriceMapperImpl implements PriceMapper {

    @Override
    public void updateDtoFromEntity(Price price, PriceDTO priceDTO) {
        if ( price == null ) {
            return;
        }

        priceDTO.setBrandId( priceBrandIdId( price ) );
        priceDTO.setStartDate( price.getStartDate() );
        priceDTO.setEndDate( price.getEndDate() );
        priceDTO.setProductId( price.getProductId() );
        priceDTO.setPriceList( price.getPriceList() );
        priceDTO.setPriority( price.getPriority() );
        priceDTO.setPrice( price.getPrice() );
        priceDTO.setCurrency( price.getCurrency() );
        priceDTO.setId( price.getId() );
    }

    @Override
    public Price toEntity(PriceDTO priceDTO) {
        if ( priceDTO == null ) {
            return null;
        }

        Price price = new Price();

        price.setBrandId( priceDTOToBrand( priceDTO ) );
        price.setStartDate( priceDTO.getStartDate() );
        price.setEndDate( priceDTO.getEndDate() );
        price.setProductId( priceDTO.getProductId() );
        price.setPriceList( priceDTO.getPriceList() );
        price.setPriority( priceDTO.getPriority() );
        price.setPrice( priceDTO.getPrice() );
        price.setCurrency( priceDTO.getCurrency() );
        price.setId( priceDTO.getId() );

        return price;
    }

    @Override
    public List<PriceDTO> toDtoList(List<Price> prices) {
        if ( prices == null ) {
            return null;
        }

        List<PriceDTO> list = new ArrayList<PriceDTO>( prices.size() );
        for ( Price price : prices ) {
            list.add( toDto( price ) );
        }

        return list;
    }

    private Integer priceBrandIdId(Price price) {
        if ( price == null ) {
            return null;
        }
        Brand brandId = price.getBrandId();
        if ( brandId == null ) {
            return null;
        }
        Integer id = brandId.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected Brand priceDTOToBrand(PriceDTO priceDTO) {
        if ( priceDTO == null ) {
            return null;
        }

        Brand brand = new Brand();

        brand.setId( priceDTO.getBrandId() );

        return brand;
    }
}
