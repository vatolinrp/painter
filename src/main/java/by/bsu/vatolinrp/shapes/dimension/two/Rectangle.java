package by.bsu.vatolinrp.shapes.dimension.two;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

public class Rectangle extends Polygon
{
  public Rectangle( Point firstPoint, Color lineColor, Color fillColor,
    Point[] pointsList )
  {
    super( firstPoint, lineColor, fillColor, pointsList );

  }

  public void draw( Graphics2D g )
  {
    g.setStroke( new BasicStroke( 3 ) );
    g.setColor( getFillColor() );
    g.fillRect(
      getPointsList()[0].x, getPointsList()[0].y,
      getPointsList()[1].x - getPointsList()[0].x,
      getPointsList()[1].y - getPointsList()[0].y );
    g.setColor( getLineColor() );
    g.drawRect(
      getPointsList()[0].x, getPointsList()[0].y,
      getPointsList()[1].x - getPointsList()[0].x,
      getPointsList()[1].y - getPointsList()[0].y );

  }

}
