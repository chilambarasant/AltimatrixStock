package com.altimatrix.stock.utils;

import org.modelmapper.ModelMapper;

import com.altimatrix.stock.model.StockRequestModel;
import com.altimatrix.stock.repository.StockRepository;

public class CommonUtills {
	
	@Autowired
	private ModelMapper mapper;
	
	@Autowired
	static StockRepository stockRepository;
	
	public static  <F,T>T mapConvert(F from, T to)
	{
		to = (T) mapper.map(from,to.getClass());
		return to;
	}
	
	public static boolean idExistOrNot(StockRequestModel stockRequestModule) {
		boolean stockNoValue = false;
		return stockNoValue = stockRepository.existsById(stockRequestModule.getStockNo());
	}
	

}
