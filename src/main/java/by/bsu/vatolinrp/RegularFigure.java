package by.bsu.vatolinrp;

import java.awt.*;


public class RegularFigure extends Polygon
{

    private int numberOfSides;

    public RegularFigure(Point firstPoint, Color lineColor, Color fillColor, Point[] pointsList, int numberOfSides)
    {
        super(firstPoint, lineColor, fillColor, pointsList);
        this.numberOfSides = numberOfSides;
    }

    public void draw(Graphics2D g)
    {
        java.awt.Polygon p = new java.awt.Polygon();
        double radius;
        int x = Math.abs(location()[1].x - location()[0].x);
        int y = Math.abs(location()[1].y - location()[0].y);
        if (x > y)
        {
            radius = x;
        }
        else
        {
            radius = y;
        }
        double x0 = location()[1].x;
        double y0 = location()[1].y;
        int xi = 0;
        int yi = 0;
        for(int i=0;i<numberOfSides;i++)
        {
            xi = (int)(x0-(radius*(Math.cos(2 * i * 3.14 / numberOfSides))));
            yi = (int)(y0-(radius*(Math.sin(2 * i * 3.14 / numberOfSides))));
            p.addPoint(xi, yi);
        }
        g.setStroke(new BasicStroke(3));
        g.setColor(getLineColor());
        g.drawPolygon(p);
        g.setColor(getFillColor());
        g.fillPolygon(p);
    }

    public int getNumberOfSides()
    {
        return numberOfSides;
    }

    public void setNumberOfSides(int numberOfSides)
    {
        this.numberOfSides = numberOfSides;
    }
}
