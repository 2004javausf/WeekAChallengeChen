package com.revature.beans2;

public class Wrapper {
	
	public static int myInt = 1;
	private Integer myInteger;
	private Double myDouble;
	
	
	public Wrapper(Integer myInteger, Double myDouble) {
		// TODO Auto-generated constructor stub
		this.myInt=myInt;
		this.myInteger=myInteger;
		this.myDouble=myDouble;
		System.out.println("Wrapper class calculation:");
		System.out.println(sum(myInt, myInteger));//unboxing
		System.out.println(minus(myInt, myDouble.intValue()));//boxing
	}

	public int getMyInt() {
		return myInt;
	}

	public static void setMyInt(int myInt) {
		Wrapper.myInt = myInt;
	}

	public Integer getMyInteger() {
		return myInteger;
	}

	public void setMyInteger(Integer myInteger) {
		this.myInteger = myInteger;
	}

	public Double getMyDouble() {
		return myDouble;
	}

	public void setMyDouble(Double myDouble) {
		this.myDouble = myDouble;
	}

	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static Integer minus(Integer a, Integer b) {
		return a-b;
		
	}
	


}
