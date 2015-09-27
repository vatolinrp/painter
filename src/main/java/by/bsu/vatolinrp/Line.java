package by.bsu.vatolinrp;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

public class Line extends Beam
{

    public Line(Point firstPoint, Color lineColor, Point secondPoint)
    {
        super(firstPoint, lineColor, secondPoint);
    }

    public void paint(Graphics2D g)
    {
        pointCalculation();
        super.drawLine(g);
    }

    private int checkDirection1()
    {
        if (getFirstPoint().x <= getSecondPoint().x)
        {
            return maxValue;
        }
        else
        {
            return minValue;
        }
    }

    private int checkDirection2()
    {
        if (getFirstPoint().x <= getSecondPoint().x)
        {
            return minValue;
        }
        else
        {
            return maxValue;
        }
    }

    public void pointCalculation()
    {
        int value = 0;
        value = checkDirection1();
        Point firstPoint = new Point(value, lineEquation(value));
        value = checkDirection2();
        Point secondPoint = new Point(value, lineEquation(value));
        setFirstPoint(firstPoint);

        setSecondPoint(secondPoint);

    }

}
