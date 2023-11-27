package com.zara.model;

import com.zara.utils.CurrencyEnum;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Price.class)
public abstract class Price_ {

	public static volatile SingularAttribute<Price, Integer> productId;
	public static volatile SingularAttribute<Price, LocalDateTime> endDate;
	public static volatile SingularAttribute<Price, Double> price;
	public static volatile SingularAttribute<Price, Brand> brandId;
	public static volatile SingularAttribute<Price, CurrencyEnum> currency;
	public static volatile SingularAttribute<Price, Integer> id;
	public static volatile SingularAttribute<Price, Integer> priority;
	public static volatile SingularAttribute<Price, LocalDateTime> startDate;
	public static volatile SingularAttribute<Price, Integer> priceList;

	public static final String PRODUCT_ID = "productId";
	public static final String END_DATE = "endDate";
	public static final String PRICE = "price";
	public static final String BRAND_ID = "brandId";
	public static final String CURRENCY = "currency";
	public static final String ID = "id";
	public static final String PRIORITY = "priority";
	public static final String START_DATE = "startDate";
	public static final String PRICE_LIST = "priceList";

}

