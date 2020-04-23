package com.neusoft.java._200414object.ex07;

public class Ccar extends Car{
	public Ccar(String id, String brand, String color, double barePrice, String grade, double disp, double drivePrice) {
		super(id, brand, color, barePrice, grade, disp, drivePrice);
	}

	@Override
	public double calDrivePrice(double barePrice) {
		drivePrice=barePrice+barePrice/1.17*0.1+500+580+1100;
		return drivePrice;
	}
}
