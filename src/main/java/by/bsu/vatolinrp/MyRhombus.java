package by.bsu.vatolinrp;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;

/**
 * @version 1.0
 * @created 18-Sep-2014 15:38:18
 */
public class MyRhombus extends MyRectangle {

	public MyRhombus(Point firstPoint, Color lineColor,Color fillColor,Point [] pointsList){
		super(firstPoint,lineColor,fillColor,pointsList);
		
	}

	

	public Point [] calculationVertex(){
		Point [] points=new Point [4];
		Point point1=new Point(getLocation()[0].x,getLocation()[0].y+(getLocation()[1].y-getLocation()[0].y)/2);
		
		points[0]=point1;
		Point point2=new Point(getLocation()[0].x+(getLocation()[1].x-getLocation()[0].x)/2,getLocation()[0].y);
		
		points[1]=point2;
		
		
		Point point3=new Point(getLocation()[1].x,getLocation()[0].y+(getLocation()[1].y-getLocation()[0].y)/2);
		points[2]=point3;
	
		
		Point point4=new Point(getLocation()[0].x+(getLocation()[1].x-getLocation()[0].x)/2,getLocation()[1].y);
		
		points[3]=point4;
		
		return points;
		
	}

	/**
	 * 
	 * @param g
	 */
	public void paint(Graphics2D g){
		Polygon p=new Polygon();
		for(Point elem:calculationVertex()){
		p.addPoint(elem.x, elem.y);
		}
		g.setStroke(new BasicStroke(3));
		g.setColor(getLineColor());
		g.drawPolygon(p);
		g.setColor(getFillColor());
		g.fillPolygon(p);
		

	}

}