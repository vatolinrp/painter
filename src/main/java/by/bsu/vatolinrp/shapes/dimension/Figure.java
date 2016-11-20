package by.bsu.vatolinrp.shapes.dimension;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

public abstract class Figure
{
  protected Point firstPoint;
  protected Color lineColor;

  public Point[] location()
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

  public void setFirstPoint( Point firstPoint )
  {
    this.firstPoint = firstPoint;
  }

  public Color getLineColor()
  {
    return lineColor;
  }

  public void setLineColor( Color lineColor )
  {
    this.lineColor = lineColor;
  }

  public abstract void draw( Graphics2D g );

  public abstract void move( Point point );

}
