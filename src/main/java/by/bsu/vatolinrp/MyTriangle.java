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
public class MyTriangle extends MyRegularFigure {

	public MyTriangle(Point firstPoint, Color lineColor,Color fillColor,Point center){
		super(firstPoint,lineColor,fillColor,center);
		

	}


	
	public Point [] calculationVertex(){
		Point [] points=new Point[3];
		int length;
		int x=Math.abs(getCenter().x-getFirstPoint().x);
		int y=Math.abs(getCenter().y-getFirstPoint().y);
		if(x>y){
			length=x;
			
		}
		else{
			length=y;
		}
		points[0]=new Point(getCenter().x,getCenter().y-length);
		int temp=getCenter().y+(length)/2;
		
	
		int temp1=(int) ((length)*3/Math.sqrt(3.0));
		points[1]=new Point(getCenter().x-temp1/2,temp);
		
		points[2]=new Point(getCenter().x+temp1/2,temp);
		
		return points;
	}


	
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