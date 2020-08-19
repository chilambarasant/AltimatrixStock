package com.altimatrix.stock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AltimatrixStockApplication {

	public static void main(String[] args) {
		SpringApplication.run(AltimatrixStockApplication.class, args);
	}
    
	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
}
