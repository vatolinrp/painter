package by.bsu.vatolinrp.shapes.dimension.two;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

public class Rhombus extends Parallelogram
{

  public Rhombus( Point firstPoint, Color lineColor, Color fillColor,
    Point[] pointsList )
  {
    super( firstPoint, lineColor, fillColor, pointsList );
  }

  public void draw( Graphics2D g )
  {
    java.awt.Polygon p = new java.awt.Polygon();
    Point[] points = new Point[4];
    Point point1 = new Point(
      location()[0].x, location()[0].y + ( location()[1].y - location()[0].y ) / 2 );

    points[0] = point1;
    Point point2 = new Point(
      location()[0].x + ( location()[1].x - location()[0].x ) / 2, location()[0].y );

    points[1] = point2;

    Point point3 = new Point(
      location()[1].x, location()[0].y + ( location()[1].y - location()[0].y ) / 2 );
    points[2] = point3;

    Point point4 = new Point(
      location()[0].x + ( location()[1].x - location()[0].x ) / 2, location()[1].y );

    points[3] = point4;
    for( Point elem : points ) {
      p.addPoint( elem.x, elem.y );
    }
    g.setStroke( new BasicStroke( 3 ) );
    g.setColor( getLineColor() );
    g.drawPolygon( p );
    g.setColor( getFillColor() );
    g.fillPolygon( p );
  }

}
