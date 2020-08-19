package com.altimatrix.stock.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StockRequestModel {
	
	private int stockNo; 
	private String stockName;
	private Double purchaseRate;
	private Date purchaseDate;
	private int quantity;

}
