package com.tests;

public class LombokTest {

	public static void main(String[] args) {
		Model m = new Model();
		m.setFirstName("FName");
		m.setLastName("LName");
		System.out.println(m.toString());
		
		Model m1  = Model.builder().firstName("test1").lastName("test2").build();
		System.out.println(m1.toString());

	}

}
