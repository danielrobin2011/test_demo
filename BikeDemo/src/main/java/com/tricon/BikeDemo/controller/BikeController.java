package com.tricon.BikeDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tricon.BikeDemo.model.Bike;
import com.tricon.BikeDemo.service.IBikeService;



@RestController
public class BikeController {

	@Autowired
	private IBikeService  bike;
	
	@RequestMapping(value="/bikedetails", method=RequestMethod.GET)
	public List<Bike> getbikedetails() {
		System.out.println("Inside: Controller");
		return bike.getBikeDetails();
	}
	
	@RequestMapping(value="/bikedetails", method=RequestMethod.POST)
	public String getBikeAdd(@RequestBody Bike obj) {
		System.out.println("Inside: Controller");
		return bike.getBikeAdd(obj);
	}
	@RequestMapping(value="/bikedetails", method=RequestMethod.PUT)
	public String getBikeUpdate(@RequestBody Bike obj) {
		System.out.println("Inside: Controller");
		return bike.getBikeUpdate(obj);
	}
	
	@RequestMapping(value="/bikedetails/{id}", method=RequestMethod.DELETE)
	public String getBikeDelete(@PathVariable int id) {
		System.out.println("Inside: Controller");
		return bike.getBikeDelete(id);
	}
}
