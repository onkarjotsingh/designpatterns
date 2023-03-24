package com.Decorator;

public class ShapeMaker {
		private Shape circle;
	   private Shape rectangle;
	   private Shape square;

	   public ShapeMaker() {
	      circle = new Circle();
	      rectangle = new Rectangle();
	      square = new Square();
	   }

	   public void drawCircle(){
	      circle.print();
	   }
	   public void drawRectangle(){
	      rectangle.print();
	   }
	   public void drawSquare(){
	      square.print();
	   }
}
