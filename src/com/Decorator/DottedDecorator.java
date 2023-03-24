package com.Decorator;

public class DottedDecorator extends ShapeDecorator {
	
	
	public DottedDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}

	@Override
	public void print() {
		decoratedShape.print();
		setDottedBorder(decoratedShape);
	}
	
	private void setDottedBorder(Shape decoratedShape) {
		System.out.println("Border is Dotted");
	}

}
