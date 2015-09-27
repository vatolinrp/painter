package by.bsu.vatolinrp;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

public abstract class Figure
{

    private Point firstPoint;
    private Color lineColor;

    public Figure(Point firstPoint, Color lineColor)
    {
        this.firstPoint = firstPoint;
        this.lineColor = lineColor;

    }

    public Point[] getLocation()
    {
        final int pointNum = 1;
        Point[] points = new Point[pointNum];
        points[0] = getFirstPoint();
        return points;
    }

    public Point getFirstPoint()
    {
        return firstPoint;
    }

    public void setFirstPoint(Point firstPoint)
    {
        this.firstPoint = firstPoint;
    }

    public abstract void move(Point point);

    public Color getLineColor()
    {
        return lineColor;
    }

    public void setLineColor(Color lineColor)
    {
        this.lineColor = lineColor;
    }

    public abstract void paint(Graphics2D g);

}
