/**
 * Brand.java 
 * 
 * @author Jefferson
 * @date   26 nov 2023 12:00:07
 *
 * Copyright (C) 2023 elAbogado
 *
 * All rights reserved.
 */
package com.zara.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Jefferson
 *
 */

@Entity
@Table(name = "BRANDS")
public class Brand {

    @Id
    @Column(name = "BRAND_ID")
    private Integer id;
    @Column(name = "NAME")
    private String name;
    
    public Brand() {
        super();
    }

    
    public Integer getId() {
        return id;
    }

    
    public void setId(Integer id) {
        this.id = id;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
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
        if (!(obj instanceof Brand)) {
            return false;
        }
        Brand other = (Brand) obj;
        return Objects.equals(id, other.id);
    }
    
    
    
}
