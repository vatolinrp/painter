package by.bsu.vatolinrp;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

/**
 * @version 1.0
 * @created 18-Sep-2014 15:38:17
 */
public class MyOval extends MyRectangle {

	public MyOval(Point firstPoint, Color lineColor,Color fillColor,Point [] pointsList){
		super(firstPoint,lineColor,fillColor,pointsList);
		
	}

	
	public void paint(Graphics2D g){
		g.setStroke(new BasicStroke(3));
		g.setColor(getFillColor());
		g.fillOval(getPointsList()[0].x, getPointsList()[0].y,Math.abs( getPointsList()[1].x-getPointsList()[0].x),Math.abs(getPointsList()[1].y-getPointsList()[0].y));
		g.setColor(getLineColor());
		g.drawOval(getPointsList()[0].x, getPointsList()[0].y, Math.abs(getPointsList()[1].x-getPointsList()[0].x),Math.abs(getPointsList()[1].y-getPointsList()[0].y));

	}

}