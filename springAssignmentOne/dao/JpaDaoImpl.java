package com.cg.dao;

public class JpaDaoImpl implements IDao{

	public JpaDaoImpl() {
		System.out.println("jpa dao constructor");
	}

	public String getName() {
		return "jpa name";
	}

}
