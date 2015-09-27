package by.bsu.vatolinrp;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

/**
 * @version 1.0
 * @created 18-Sep-2014 15:38:17
 */
public class MyBeam extends MySegment {

	public final int maxValue=601;
	public final int minValue=0;
	
	public MyBeam(Point firstPoint, Color lineColor, Point secondPoint){
		super(firstPoint, lineColor,secondPoint);
	}

	
	public void paint(Graphics2D g){
		pointCalculation();
		super.drawLine(g);
	}

	
	
	public void pointCalculation(){
		int value=0;
		value= checkDirection();
		Point point=new Point(value,lineEquation(value));
		setSecondPoint(point);

	}


	private int checkDirection() {
		if(getFirstPoint().x<=getSecondPoint().x){
			return maxValue;
		}
		else{
			return minValue;
		}
	}


	public int lineEquation(int x) {
		if(getFirstPoint().x!=getSecondPoint().x){
		return (getFirstPoint().x*getSecondPoint().y-getSecondPoint().x*getFirstPoint().y+x*(getFirstPoint().y-getSecondPoint().y))/(getFirstPoint().x-getSecondPoint().x);
		}
		else{
			return checkDirection();
		}
	}

}