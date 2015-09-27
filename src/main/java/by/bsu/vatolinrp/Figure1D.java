package by.bsu.vatolinrp;

import java.awt.Color;
import java.awt.Point;

public abstract class Figure1D extends Figure
{

    private Point secondPoint;

    public Figure1D(Point firstPoint, Color lineColor, Point secondPoint)
    {
        super(firstPoint, lineColor);
        this.secondPoint = secondPoint;

    }

    public Point[] getLocation()
    {
        final int pointNum = 2;
        Point[] points = new Point[pointNum];
        points[0] = getFirstPoint();
        points[1] = secondPoint;
        return points;
    }

    public Point getSecondPoint()
    {
        return secondPoint;
    }

    public void setSecondPoint(Point secondPoint)
    {
        this.secondPoint = secondPoint;
    }

}
