package by.bsu.vatolinrp.shapes.dimension.one;

import by.bsu.vatolinrp.shapes.dimension.Figure;

import java.awt.Point;

public abstract class Figure1D extends Figure
{

  protected Point secondPoint;

  public Point[] location()
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

  public void setSecondPoint( Point secondPoint )
  {
    this.secondPoint = secondPoint;
  }

}
