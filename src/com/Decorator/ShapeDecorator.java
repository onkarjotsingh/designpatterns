package com.Decorator;

public abstract class ShapeDecorator implements Shape {

	protected Shape decoratedShape;
	
	
	public ShapeDecorator(Shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}
	@Override
	public void print() {
		decoratedShape.print();
	}

}
