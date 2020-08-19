package com.altimatrix.stock.service;

import org.springframework.stereotype.Service;

import com.altimatrix.stock.model.StockRequestModel;
import com.altimatrix.stock.model.StockResponseModel;

@Service
public interface StockServiceInterface {
	
	StockResponseModel getListOfStock();
	StockResponseModel stockUpdated(StockRequestModel stockRequestModel);
	StockResponseModel stockAdded(StockRequestModel stockRequestModel);

}
