package com.neusoft.java._200414object.ex06;

public class Rectangle implements Shape2D{
	double length;
	double width;

	@Override
	public void grith() {
		double grith=(length+width)*2;
		System.out.println("�����ε��ܳ�Ϊ��"+grith);
	}

	@Override
	public void area() {
		double grith=length*width;
		System.out.println("�����ε��ܳ�Ϊ��"+grith);
	}
}
