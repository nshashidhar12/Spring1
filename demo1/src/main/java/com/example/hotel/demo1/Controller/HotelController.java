package com.example.hotel.demo1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hotel.demo1.Entity.Hotel;
import com.example.hotel.demo1.Service.HotelService;

@RestController
public class HotelController {
	
	@Autowired
	private HotelService service;
	
	@GetMapping("/allhotels")
	public List<Hotel> htlList() {
		
	  return service.getHotelList();
		
	}
	
	

}
