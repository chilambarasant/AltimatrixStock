package com.altimatrix.stock.repository;


import java.util.List;

import org.springframework.data.jpa.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.altimatrix.stock.entities.StockEntities;

@Repository
public interface StockRepository extends CrudRepository<StockEntities, Long> {
	List<StockEntities> findAll();

}
