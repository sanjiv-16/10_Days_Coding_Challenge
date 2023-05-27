package com.sbasics.reg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Year;
import java.util.ArrayList;

@Component
public class ProductServices {
	
	@Autowired
	productdb db;
	public void addproduct(Products p) {
		db.save(p);
	}
	
	public List<Products> show() {
		return db.findAll();
		
	}
	
	public void findwithname(String str) {
		List<Products> smp=db.findbyName(str);
		smp.forEach((n) -> System.out.println(n));
	}
	public void isexist() {
		System.out.println(db.existsById(5));
	}
	public void findwithplace(String str) {
		List<Products> smp=db.findbyPlace(str);
		smp.forEach((n) -> System.out.println(n));
	}
	
	
	public void findwithwar() {
		int year=Year.now().getValue();
		List<Products> smp=db.findbyWarrenty(year);
		smp.forEach((n) -> System.out.println(n));
	}
	
	
	
	
	
	
	
	
}
