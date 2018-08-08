package com.tricon.BikeDemo.dao;

import java.util.List;

import com.tricon.BikeDemo.model.Bike;



public interface IBikeDao {

	public List<Bike> getBikeDetails();
	public String getBikeAdd(Bike obj);
	public String getBikeUpdate(Bike Obj);
	public String getBikeDelete(int id);
}
