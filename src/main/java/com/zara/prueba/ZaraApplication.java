package com.zara.prueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.zara.repository.PriceRepository;

@SpringBootApplication
@ComponentScan("com.zara")
public class ZaraApplication {

    
    @Bean
    public PriceRepository priceRepository() {
        return null; 
    }
	public static void main(String[] args) {
		SpringApplication.run(ZaraApplication.class, args);
	}

}
