package by.bsu.vatolinrp;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

public class Segment extends Figure1D
{

    public Segment(Point firstPoint, Color lineColor, Point secondPoint)
    {
        super(firstPoint, lineColor, secondPoint);
    }

    public void draw(Graphics2D g)
    {
        g.setStroke(new BasicStroke(3));
        g.setColor(getLineColor());
        g.drawLine(getFirstPoint().x, getFirstPoint().y, getSecondPoint().x, getSecondPoint().y);
    }

    public void move(Point point)
    {
        Point p = getFirstPoint();
        setFirstPoint(point);
        setSecondPoint(new Point(getSecondPoint().x - p.x + getFirstPoint().x, getSecondPoint().y - p.y
                + getFirstPoint().y));

    }

}
