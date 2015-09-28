package by.bsu.vatolinrp;

import java.awt.*;

public class Parallelogram extends Polygon
{
    public Parallelogram(Point firstPoint, Color lineColor, Color fillColor, Point[] pointsList)
    {
        super(firstPoint, lineColor, fillColor, pointsList);
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

    private Point[] pointCalculation()
    {
        Point[] points = new Point[4];
        Point point1 = new Point(location()[0].x, location()[0].y);

        points[0] = point1;
        Point point2 = new Point(Math.abs(location()[0].x -location()[1].x)/4+location()[0].x, location()[1].y);

        points[1] = point2;

        Point point3 = new Point(location()[1].x, location()[1].y);
        points[2] = point3;

        Point point4 = new Point(3*Math.abs(location()[0].x -location()[1].x)/4+location()[0].x, location()[0].y);

        points[3] = point4;

        return points;

    }
}
