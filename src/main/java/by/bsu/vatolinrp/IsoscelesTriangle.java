package by.bsu.vatolinrp;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

public class IsoscelesTriangle extends Polygon
{
    public IsoscelesTriangle(Point firstPoint, Color lineColor, Color fillColor, Point[] pointsList)
    {
        super(firstPoint, lineColor, fillColor, pointsList);
    }

    private Point[] pointCalculation()
    {
        Point[] points = new Point[3];
        int length;
        int x = Math.abs(location()[0].x - location()[1].x);
        int y = Math.abs(location()[0].y - location()[1].y);
        if (x > y)
        {
            length = x;
        }
        else
        {
            length = y;
        }
        int dist = (int)Math.sqrt(2*length*length);

        points[0] = new Point(location()[0].x-dist, location()[0].y + length);
        points[1] = new Point(location()[0].x+dist, location()[0].y + length);
        points[2] = new Point(location()[0].x, location()[0].y - length*2);

        return points;

    }

    public void draw(Graphics2D g)
    {
        java.awt.Polygon p = new java.awt.Polygon();
        for (Point elem : pointCalculation())
        {
            p.addPoint(elem.x, elem.y);
        }
        g.setStroke(new BasicStroke(3));
        g.setColor(getLineColor());
        g.drawPolygon(p);
        g.setColor(getFillColor());
        g.fillPolygon(p);
    }
}
