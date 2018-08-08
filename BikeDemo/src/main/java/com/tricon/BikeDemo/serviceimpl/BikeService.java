package com.tricon.BikeDemo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tricon.BikeDemo.dao.IBikeDao;
import com.tricon.BikeDemo.model.Bike;
import com.tricon.BikeDemo.service.IBikeService;

@Service
public class BikeService implements IBikeService {

	@Autowired
	private IBikeDao bikeDao; 
	


	@Override
	public List<Bike> getBikeDetails() {
		
		return bikeDao.getBikeDetails();
	}
	
	@Override
	public String getBikeAdd(Bike obj) {
		
		return bikeDao.getBikeAdd(obj);
	}
	
	@Override
	public String getBikeDelete(int id) {
		
		return bikeDao.getBikeDelete(id);
	}
	@Override
	public String getBikeUpdate(Bike obj) {
		
		return bikeDao.getBikeUpdate(obj);
	}

}

