package com.neusoft.java._200414object;

public class Student {
	static int age;
	String name;
	String sex;
	public Student(String name, String sex) {
		super();
		this.name = name;
		this.sex = sex;
	}
	
	@Override
	public String toString() {
		return "��λѧ����������" + name + ", �Ա���:" + sex + ",������:"+Student.age;
	}

	void beginClass(String name) {
		System.out.println(name+"��ʼ�Ͽ��ˣ�");
	}
	
	void endClass(String name) {
		System.out.println(name+"�¿��ˣ�");
	}
}
