package com.neusoft.java._200414object.ex07;

public class Acar extends Car{
	public Acar(String id, String brand, String color, double barePrice, String grade, double disp, double drivePrice) {
		super(id, brand, color, barePrice, grade, disp, drivePrice);
	}

	@Override
	public double calDrivePrice(double barePrice) {
		drivePrice=barePrice+barePrice/1.17*0.05+500+420+950;
		return drivePrice;
	}

}
