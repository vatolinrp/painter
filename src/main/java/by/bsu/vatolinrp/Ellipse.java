package by.bsu.vatolinrp;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

public class Ellipse extends Polygon
{
    public Ellipse(Point firstPoint, Color lineColor, Color fillColor, Point[] pointsList)
    {
        super(firstPoint, lineColor, fillColor, pointsList);
    }

    public void draw(Graphics2D g)
    {
        g.setStroke(new BasicStroke(3));
        g.setColor(getFillColor());
        g.fillOval(getPointsList()[0].x, getPointsList()[0].y, Math.abs(getPointsList()[1].x - getPointsList()[0].x),
                Math.abs(getPointsList()[1].y - getPointsList()[0].y));
        g.setColor(getLineColor());
        g.drawOval(getPointsList()[0].x, getPointsList()[0].y, Math.abs(getPointsList()[1].x - getPointsList()[0].x),
                Math.abs(getPointsList()[1].y - getPointsList()[0].y));
    }

}
