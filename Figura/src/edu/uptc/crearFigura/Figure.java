package edu.uptc.crearFigura;

import java.awt.Point;
/*
 * @author Jose Antonio  Chaparro
 * @param 
 */


public abstract class Figure {

	private Point point;

	public Figure(Point point) {
		this.point = point;
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	abstract public void  drawFigure();
	abstract public double calculateArea();

}
