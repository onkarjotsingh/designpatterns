package com.Decorator;

public class Main {
	
 public static void main(String args[]) {
	 Shape Circle =new Circle();
	 Shape DottedCircle =new DottedDecorator(new Circle());
	 
	 Circle.print();
	 DottedCircle.print();
	 
//	 
//	 ShapeMaker shapeMaker = new ShapeMaker();
//
//     shapeMaker.drawCircle();
//     shapeMaker.drawRectangle();
//     shapeMaker.drawSquare();		
  }
 }
	
