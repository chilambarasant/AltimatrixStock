package com.altimatrix.stock.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.altimatrix.stock.model.StockRequestModel;
import com.altimatrix.stock.model.StockResponseModel;
import com.altimatrix.stock.service.StockServiceInterface;
import com.altimatrix.stock.repository.StockRepository;
import com.altimatrix.stock.entities.StockEntities;
import com.altimatrix.stock.utils.CommonUtills;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StockServices implements StockServiceInterface {

	@Autowired
	StockRepository stockRepository;
	
	@Override
	public StockResponseModel getListOfStock() {
		
		// TODO Auto-generated method stub
		StockResponseModel list = new StockResponseModel();
		List<StockEntities> stockRepoList = new ArrayList();
		List<StockRequestModel> stockModelList = new ArrayList();
		stockModelList = CommonUtills.mapConvert(stockRepoList, stockModelList);
		stockRepoList = stockRepository.findAll();
		list.setStockInfo(stockModelList);
		list.setResponseCode(HttpStatus.OK.toString());
		list.setResponseMsg(HttpStatus.OK.getReasonPhrase());
		return list;
		
	}
	
	@Override
	public StockResponseModel stockUpdated(StockRequestModel stockRequestModel) {
		// TODO Auto-generated method stub
		StockResponseModel response = new StockResponseModel();
		boolean isStockID = CommonUtills.idExistOrNot(stockRequestModel);
		if(isStockID)
		{
				StockEntities stockEntity = new StockEntities();
				stockEntity =  CommonUtills.mapConvert(stockRequestModel, stockEntity);
				
				stockRepository.save(stockEntity);
				response.setResponseCode(HttpStatus.ACCEPTED.toString());
				response.setResponseMsg(HttpStatus.ACCEPTED.getReasonPhrase());
			
		}
		else
		{
			response.setResponseCode(HttpStatus.NOT_FOUND.toString());
			response.setResponseMsg(HttpStatus.NOT_FOUND.getReasonPhrase());
		}
		return response;	
	
	}

	@Override
	public StockResponseModel stockAdded(StockRequestModel stockRequestModel) {
		// TODO Auto-generated method stub
		StockResponseModel response = new StockResponseModel();

		boolean isIDExits = CommonUtills.idExistOrNot(stockRequestModel);
		if(!isIDExits)
		{
			StockEntities stockEntity = new StockEntities();
			stockEntity = CommonUtills.mapConvert(stockRequestModel, stockEntity);
			
			stockRepository.save(stockEntity);
				response.setResponseCode(HttpStatus.CREATED.toString());
				response.setResponseMsg(HttpStatus.CREATED.getReasonPhrase());
			
		}
		else
		{
			response.setResponseCode(HttpStatus.CONFLICT.toString());
			response.setResponseMsg("Stock ID Already Exists");
		}
		
		return response;
	}

}
