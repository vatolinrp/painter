package by.bsu.vatolinrp;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

/**
 * @version 1.0
 * @created 18-Sep-2014 15:38:18
 */
public abstract class MyRegularFigure extends MyFigure2D {

	private Point center;

	public MyRegularFigure(Point firstPoint, Color lineColor,Color fillColor,Point center){
		super(firstPoint,lineColor,fillColor);
		this.center=center;

	}
	
//	public void  move(Point point){
//		
//		setFirstPoint(new Point(getFirstPoint().x+point.x-center.x,getFirstPoint().y+point.y-center.y));
//		setCenter(point);
//		
//	}
	public void  move(Point point){
		Point p=getCenter();
		setCenter(point);
		setFirstPoint(new Point(getFirstPoint().x-p.x+getCenter().x,getFirstPoint().y-p.y+getCenter().y));
		
	}



	
	public Point [] getLocation(){
		Point [] points=new Point[2];
		points[0]=getFirstPoint();
		points[1]=center;
		return points;
	}
	
	

	


	public Point getCenter() {
		return center;
	}


	public void setCenter(Point center) {
		this.center = center;
	}

}