package com.tricon.BikeDemo.service;

import java.util.List;

import com.tricon.BikeDemo.model.Bike;

public interface IBikeService {
	public List<Bike>  getBikeDetails();
	public Bike getBikeId(int id);
	public String getBikeAdd(Bike obj);
	public String getBikeUpdate(Bike obj);
	public String getBikeDelete(int id);
}