package com.altimatrix.stock.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "altistocks")
@Setter
@Getter
public class StockEntities {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stockNo; 
	private String stockName;
	private Double purchaseRate;
	private Date purchaseDate;
	private int quantity;

}
