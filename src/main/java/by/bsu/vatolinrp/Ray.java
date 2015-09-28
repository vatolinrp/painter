package by.bsu.vatolinrp;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

public class Ray extends Segment
{

    public final int maxValue = 601;
    public final int minValue = 0;

    public Ray(Point firstPoint, Color lineColor, Point secondPoint)
    {
        super(firstPoint, lineColor, secondPoint);
    }

    public void draw(Graphics2D g)
    {
        pointCalculation();
        super.draw(g);
    }

    private void pointCalculation()
    {
        int value = 0;
        value = checkDirection();
        Point point = new Point(value, lineEquation(value));
        setSecondPoint(point);

    }

    private int checkDirection()
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

    protected int lineEquation(int x)
    {
        if (getFirstPoint().x != getSecondPoint().x)
        {
            return (getFirstPoint().x * getSecondPoint().y - getSecondPoint().x * getFirstPoint().y + x
                    * (getFirstPoint().y - getSecondPoint().y))
                    / (getFirstPoint().x - getSecondPoint().x);
        }
        else
        {
            return checkDirection();
        }
    }

}
