package com.tns.enum1;

interface Pizza {
	 public void displaySize();
	}

	enum Size implements Pizza {
	 SMALL, MEDIUM, LARGE, EXTRALARGE;

	 public void displaySize() {
	   System.out.println("The size is " + this);
	 }
	}

	class Example3 {
	 public static void main(String[] args) {
	  Size.MEDIUM.displaySize();
	 }
	}
