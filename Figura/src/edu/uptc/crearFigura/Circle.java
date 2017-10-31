package edu.uptc.crearFigura;

import java.awt.Point;

public class Circle extends Figure{
	private int radio;

	public Circle(Point point, int radio) {
		super(point);
		this.radio = radio;
	}


	public int getRadio() {
		return radio;
	}


	public void setRadio(int radio) {
		this.radio = radio;
	}


	public void drawFigure() {


	}
	public double calculateArea() {
		return radio;

	}


}
