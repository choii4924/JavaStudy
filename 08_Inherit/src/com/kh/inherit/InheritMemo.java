package com.kh.inherit;

public class InheritMemo {
	/*
	 *  상속 : 부모 클래스의 멤버(필드, 메소드)를 자식 클래스에서
	 * 		  그대로 이어받아 사용하는 것
	 * 		  실제 상속된 클래스를 통해 객체 생성 시 부모 클래스의
	 * 		  멤버들도 생성됨!
	 * 
	 *  * 장점
	 *  	- 적은 양의 코드로 새로운 클래스를 정의하고 사용할 수 있음(생산성이 좋은!)
	 *  	- 코드를 공통으로 관리하기 때문에 코드의 추가나 수정이 용이함 (유지보수 좋음!)
	 *  
	 *  * 특징
	 * 		- 부모클래스의 생성자는 상속되지 않음
	 * 		- 부모클래스의 private 멤버는 상속은 되지만, 직접 접근 불가
	 * 		- 모든 클래스는 Objact 클래스의 후속
	 * 		=> 자바에서 이미 만들어진 클래스, 직접 만든 클래스
	 * 		- 클래스 간의 상속은 "단일 상속"만 가능(다중 상속 불가 = 부모는 하나!)
	 * 		- 부모 클래스의 정의도이 있는 메소드를 자식 클래스에서 재정의 할 수 있음
	 * 		=> 오버라이딩!
	 */
	// -------------------------------------------
	/*
	 * 	Desktop 클래스
	 * --------------
	 * -brand:String
	 * -code:String
	 * -name:String
	 * -price:int
	 * -allInone:boolean
	 * --------------
	 * +Desktop(brand:String, code:Sting, name:String, price:int, allInone:boolean)
	 * +information():String
	 * --------------
	 * 
	 * TV 클래스
	 * --------------
	 * -brand:String
	 * -code:String
	 * -name:String
	 * -price:int
	 * -inch:int
	 * --------------
	 * +TV(모든 필드를 매개변수로 가짐)
	 * ++information():String
	 * --------------
	 */
public class Desktop {
	private String brand;
	private String code;
	private String name;
	private int price;
	private boolean allInOne;
	
	public Desktop(String brand, String code, String name, int price, boolean allInOne) {
		this.brand = brand;
		this.code = code;
		this.name = name;
		this.price = price;
		this.allInOne = allInOne;
	}
	
	public String information() {
		return "brand: " + brand + ", code: " + code + ", name: " + name + ", price: " + price + ","
				+ ", allInOne: " + allInOne;
		// * String.format(포멧, ...):String
//		turn String.format("brand: %s, code: %s, name: %s, price: %d, allInOne");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	
	
}



}
