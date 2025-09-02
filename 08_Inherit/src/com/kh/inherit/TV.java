package com.kh.inherit;

import com.kh.inherit.after.Product;

public class TV extends Product { // product 클래스 상속
	private int inch;
	
	public TV(String brand, String code, String name, int price, int inch) {
		super(brand, code, name, price);
		this.inch = inch;
	}
	
	@Override
	public String information() {
	    return super.information() + ", inch: " + inch;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}
}
