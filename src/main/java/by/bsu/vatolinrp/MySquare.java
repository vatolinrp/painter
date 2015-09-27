package by.bsu.vatolinrp;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

/**
 * @version 1.0
 * @created 18-Sep-2014 15:38:18
 */
public class MySquare extends MyRegularFigure {

	public MySquare(Point firstPoint, Color lineColor,Color fillColor,Point center){
		super(firstPoint,lineColor,fillColor,center);
		

	}


	

	public Point [] calculationVertex(){
//		if(getFirstPoint().x<getCenter().x){
//			Point p=getCenter();
//			setCenter(getFirstPoint());
//			setFirstPoint(p);
//		}
		Point [] points=new Point[2];
		int x=Math.abs(getCenter().x-getFirstPoint().x);
		int y=Math.abs(getCenter().y-getFirstPoint().y);
		int length;
				if(x>y){
					length=x;
					
				}
				else{
					length=y;
				}
		points[0]=new Point(getCenter().x-length,getCenter().y-length);
		points[1]=new Point(getCenter().x+length,getCenter().y+length);;
		
		return points;
		
	}

	
	public void paint(Graphics2D g){
		
		Point [] points= calculationVertex();
		g.setColor(getFillColor());
		g.setStroke(new BasicStroke(3));
		g.fillRect(points[0].x, points[0].y, points[1].x-points[0].x,points[1].y-points[0].y);
		g.setColor(getLineColor());
		g.setColor(getLineColor());
		g.drawRect(points[0].x, points[0].y, points[1].x-points[0].x,points[1].y-points[0].y);

	}

}