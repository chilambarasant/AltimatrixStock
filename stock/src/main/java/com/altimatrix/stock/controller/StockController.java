package com.altimatrix.stock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.altimatrix.stock.service.impl.StockServices;
import com.altimatrix.stock.model.StockRequestModel;
import com.altimatrix.stock.model.StockResponseModel;

@RestController
@RequestMapping("/altimatrix")
public class StockController {
	
	@Autowired
	StockServices stockServices;
	
	@RequestMapping(method=RequestMethod.GET,value="/displayAllStock")
	public StockResponseModel getAllStockDetails()
	{
		 return stockServices.getListOfStock();
	}
	
	@PostMapping("/stockCreation")
	public StockResponseModel createStock(@RequestBody StockRequestModel stockRequestModel)
	{
		
		return stockServices.stockAdded(stockRequestModel);
	}
	
	@PutMapping("/stockUpdation")
	public StockResponseModel updateStock(@RequestBody StockRequestModel stockRequestModel)
	{
		return stockServices.stockUpdated(stockRequestModel);
	} 

}
