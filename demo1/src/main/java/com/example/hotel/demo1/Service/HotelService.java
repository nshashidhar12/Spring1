package com.example.hotel.demo1.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.hotel.demo1.Entity.Hotel;

@Service
public class HotelService {

	public List<Hotel> hotels = new ArrayList<>(Arrays.asList
			(new Hotel(1,"Suraj",200)),
			(new Hotel(2,"Ajantha",500)),(new Hotel(3,"City inn",300)));
	
	public List<Hotel> getHotelList(){
		return hotels;
	}
}
