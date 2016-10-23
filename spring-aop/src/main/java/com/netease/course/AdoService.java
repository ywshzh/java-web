package com.netease.course;

public class AdoService {
	
	public int select(int key) 
	{
		System.out.println("select method");
		return key * 100;
	}
	
	public void insert(int key, int value) 
	{
		System.out.println("insert method");
	}

	public void update(int key, int value) 
	{
		System.out.println("update method");
	}
	
	public void delete(int key) 
	{
		System.out.println("delete method");
	}
}
