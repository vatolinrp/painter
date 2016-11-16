package by.bsu.vatolinrp.shapes.dimension.two;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

public class Polygon
  extends Figure2D
{

  protected Point[] pointsList;

  public Polygon( Point firstPoint, Color lineColor, Color fillColor,
    Point[] pointsList )
  {
    this.firstPoint = firstPoint;
    this.lineColor = lineColor;
    this.fillColor = fillColor;
    this.pointsList = pointsList;

  }

  public Point[] getPointsList()
  {
    return pointsList;
  }

  public void setPointsList( Point[] pointsList )
  {
    this.pointsList = pointsList;
  }

  public Point[] location()
  {
    return pointsList;
  }

  public void move( Point point )
  {

    Point p = pointsList[0];
    pointsList[0] = point;
    for( int i = 1; i < pointsList.length; i++ ) {
      pointsList[i] = new Point(
        pointsList[i].x - p.x + pointsList[0].x,
        pointsList[i].y - p.y + pointsList[0].y );
    }

  }

  public void draw( Graphics2D g )
  {
    java.awt.Polygon p = new java.awt.Polygon();
    for( Point elem : location() ) {
      p.addPoint( elem.x, elem.y );
    }
    g.setColor( getLineColor() );
    g.setStroke( new BasicStroke( 3 ) );
    g.drawPolygon( p );
    g.setColor( getFillColor() );
    g.fillPolygon( p );
  }

}
