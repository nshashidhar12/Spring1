package com.example.hotel.demo1.Entity;

public class Hotel {
	
	private int hotelid;
	private String name;
	private int rooms;
	
	public Hotel() {
		super();
	}
	
	public Hotel(int hotelid, String name, int rooms) {
		super();
		this.hotelid = hotelid;
		this.name = name;
		this.rooms = rooms;
	}
	
	public int getHotelid() {
		return hotelid;
	}
	public void setHotelid(int hotelid) {
		this.hotelid = hotelid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRooms() {
		return rooms;
	}
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
	@Override
	public String toString() {
		return "Hotel [hotelid=" + hotelid + ", name=" + name + ", rooms=" + rooms + "]";
	}
}
