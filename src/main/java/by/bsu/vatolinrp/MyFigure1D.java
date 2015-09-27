package by.bsu.vatolinrp;

import by.bsu.vatolinrp.MyFigure;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

/**
 * @version 1.0
 * @created 18-Sep-2014 15:38:17
 */
public abstract class MyFigure1D extends MyFigure {

	private Point secondPoint;

	public MyFigure1D(Point firstPoint, Color lineColor, Point secondPoint) {
		super(firstPoint, lineColor);
		this.secondPoint = secondPoint;

	}

	/**
	 * 
	 * @param secondPoint
	 * @param firstPoint
	 */
	public Point[] getLocation() {
		final int pointNum = 2;
		Point[] points = new Point[pointNum];
		points[0] = getFirstPoint();
		points[1] = secondPoint;
		return points;
	}

	/**
	 * 
	 * @param g
	 * @param secondPoint
	 * @param firstPoint
	 */
	

	public Point getSecondPoint() {
		return secondPoint;
	}

	public void setSecondPoint(Point secondPoint) {
		this.secondPoint = secondPoint;
	}

}