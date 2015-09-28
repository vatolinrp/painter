package by.bsu.vatolinrp;

import java.awt.*;
import java.awt.Polygon;

public class RegularFigure extends Figure2D
{

    private Point center;
    private int numberOfSides;

    public RegularFigure(Point firstPoint, Color lineColor, Color fillColor, Point center, int numberOfSides)
    {
        super(firstPoint, lineColor, fillColor);
        this.center = center;
        this.numberOfSides = numberOfSides;

    }

    public void move(Point point)
    {
        Point p = getCenter();
        setCenter(point);
        setFirstPoint(new Point(getFirstPoint().x - p.x + getCenter().x, getFirstPoint().y - p.y + getCenter().y));

    }

    public void draw(Graphics2D g)
    {
        switch(numberOfSides)
        {
            case 3:
            {
                draw3(g);
                break;
            }
            case 4:
            {
                draw4(g);
                break;
            }
        }
    }

    private void draw4(Graphics2D g)
    {
        Point[] points = calculationVertex4();
        g.setColor(getFillColor());
        g.setStroke(new BasicStroke(3));
        g.fillRect(points[0].x, points[0].y, points[1].x - points[0].x, points[1].y - points[0].y);
        g.setColor(getLineColor());
        g.setColor(getLineColor());
        g.drawRect(points[0].x, points[0].y, points[1].x - points[0].x, points[1].y - points[0].y);
    }

    private void draw3(Graphics2D g)
    {
        java.awt.Polygon p = new Polygon();
        for (Point elem : calculationVertex3())
        {
            p.addPoint(elem.x, elem.y);
        }
        g.setStroke(new BasicStroke(3));
        g.setColor(getLineColor());
        g.drawPolygon(p);
        g.setColor(getFillColor());
        g.fillPolygon(p);
    }



    public Point[] location()
    {
        Point[] points = new Point[2];
        points[0] = getFirstPoint();
        points[1] = center;
        return points;
    }

    public Point getCenter()
    {
        return center;
    }

    public void setCenter(Point center)
    {
        this.center = center;
    }

    private Point[] calculationVertex4()
    {
        Point[] points = new Point[2];
        int x = Math.abs(getCenter().x - getFirstPoint().x);
        int y = Math.abs(getCenter().y - getFirstPoint().y);
        int length;
        if (x > y)
        {
            length = x;

        }
        else
        {
            length = y;
        }
        points[0] = new Point(getCenter().x - length, getCenter().y - length);
        points[1] = new Point(getCenter().x + length, getCenter().y + length);


        return points;

    }

    private Point[] calculationVertex3()
    {
        Point[] points = new Point[3];
        int length;
        int x = Math.abs(getCenter().x - getFirstPoint().x);
        int y = Math.abs(getCenter().y - getFirstPoint().y);
        if (x > y)
        {
            length = x;
        }
        else
        {
            length = y;
        }
        int dist = (int)Math.sqrt(2*length*length);

        points[0] = new Point(getCenter().x-dist, getCenter().y + length);
        points[1] = new Point(getCenter().x+dist, getCenter().y + length);
        points[2] = new Point(getCenter().x, getCenter().y - length);

        return points;
    }

}
