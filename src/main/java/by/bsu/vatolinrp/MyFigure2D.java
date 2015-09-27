package by.bsu.vatolinrp;

import by.bsu.vatolinrp.MyFigure;

import java.awt.Color;
import java.awt.Point;

/**
 * @version 1.0
 * @created 18-Sep-2014 15:38:17
 */
public abstract class MyFigure2D extends MyFigure {

	private Color fillColor;

	public MyFigure2D(Point firstPoint, Color lineColor,Color fillColor){
		super(firstPoint,lineColor);
		this.fillColor=fillColor;

	}

	public Color getFillColor() {
		return fillColor;
	}

	public void setFillColor(Color fillColor) {
		this.fillColor = fillColor;
	}

	

}