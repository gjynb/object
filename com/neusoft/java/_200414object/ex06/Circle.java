package com.neusoft.java._200414object.ex06;

public class Circle implements Shape2D{
	double r;
	@Override
	public void grith() {
		double grith=Shape2D.PI*2*r;
		System.out.println("Բ���ܳ�Ϊ��"+grith);
	}

	@Override
	public void area() {
		double area=Shape2D.PI*r*r;
		System.out.println("Բ�����Ϊ��"+area);
	}

}
