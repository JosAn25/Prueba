package edu.uptc.crearFigura;

import java.awt.Point;

public class Rectangule extends Figure {
	private int width;
	private int height;
	private int array[];
	
	public Rectangule(Point point, int width, int height) {
		super(point);
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}
	public void drawFigure() {
		
		


	}
	public double calculateArea() {
		return 0;


	}


}
