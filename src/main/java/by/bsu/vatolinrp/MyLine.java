package by.bsu.vatolinrp;

import by.bsu.vatolinrp.MyBeam;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

/**
 * @version 1.0
 * @created 18-Sep-2014 15:38:17
 */
public class MyLine extends MyBeam {
	
	

	public MyLine(Point firstPoint, Color lineColor, Point secondPoint){
		super(firstPoint, lineColor,secondPoint);
	}

	
	public void paint(Graphics2D g){
		pointCalculation();
      super.drawLine(g);
	}
	
	private int checkDirection1() {
		if(getFirstPoint().x<=getSecondPoint().x){
			return maxValue;
		}
		else{
			return minValue;
		}
	}
	
	private int checkDirection2() {
		if(getFirstPoint().x<=getSecondPoint().x){
			return minValue;
		}
		else{
			return maxValue;
		}
	}
	public void pointCalculation(){
		int value=0;
		value= checkDirection1();
		Point firstPoint= new Point(value,lineEquation(value));
		value= checkDirection2();
		Point secondPoint =new Point(value,lineEquation(value));
		setFirstPoint(firstPoint);
		
		setSecondPoint(secondPoint);
		

	}

}