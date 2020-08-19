package com.altimatrix.stock.model;

import com.altimatrix.stock.model.StockRequestModel;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StockResponseModel {
	
	private String responseCode;
	private String responseMsg;
	private List<StockRequestModel> stockInfo;

}
