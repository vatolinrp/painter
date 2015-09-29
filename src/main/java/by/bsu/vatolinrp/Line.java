package by.bsu.vatolinrp;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

public class Line extends Ray
{

    public Line(Point firstPoint, Color lineColor, Point secondPoint)
    {
        super(firstPoint, lineColor, secondPoint);
    }

    public void draw(Graphics2D g)
    {
        Point point1 = getFirstPoint();
        Point point2 = getSecondPoint();
        super.draw(g);
        setFirstPoint(point2);
        setSecondPoint(point1);
        super.draw(g);
    }

}
