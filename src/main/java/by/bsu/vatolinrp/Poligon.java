package by.bsu.vatolinrp;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;

public class Poligon extends Figure2D
{

    private Point[] pointsList;

    public Poligon(Point firstPoint, Color lineColor, Color fillColor, Point[] pointsList)
    {
        super(firstPoint, lineColor, fillColor);
        this.pointsList = pointsList;

    }

    public Point[] getPointsList()
    {
        return pointsList;
    }

    public void setPointsList(Point[] pointsList)
    {
        this.pointsList = pointsList;
    }

    public Point[] getLocation()
    {
        // Point [] points=new Point[pointsList.length+1];
        // points[0]=getFirstPoint();
        // for(int i=1;i<points.length;i++){
        // points[i]=pointsList[i-1];
        // }
        // return points;
        return pointsList;
    }

    public void move(Point point)
    {

        Point p = pointsList[0];
        pointsList[0] = point;
        for (int i = 1; i < pointsList.length; i++)
        {
            pointsList[i] = new Point(pointsList[i].x - p.x + pointsList[0].x, pointsList[i].y - p.y + pointsList[0].y);
        }

    }

    public void paint(Graphics2D g)
    {
        Polygon p = new Polygon();
        for (Point elem : getLocation())
        {
            p.addPoint(elem.x, elem.y);
        }
        g.setColor(getLineColor());
        g.setStroke(new BasicStroke(3));
        g.drawPolygon(p);
        g.setColor(getFillColor());
        g.fillPolygon(p);

    }

}
