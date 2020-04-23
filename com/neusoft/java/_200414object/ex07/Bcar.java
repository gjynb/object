package com.neusoft.java._200414object.ex07;

public class Bcar extends com.neusoft.java._200414object.ex07.Car {
	public Bcar(String id, String brand, String color, double barePrice, String grade, double disp, double drivePrice) {
		super(id, brand, color, barePrice, grade, disp, drivePrice);
	}

	@Override
	public double calDrivePrice(double barePrice) {
		drivePrice=barePrice+barePrice/1.17*0.075+500+480+1000;
		return drivePrice;
	}

}
