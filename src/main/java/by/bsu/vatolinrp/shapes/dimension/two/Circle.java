package by.bsu.vatolinrp.shapes.dimension.two;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

public class Circle extends Ellipse
{
  public Circle( Point firstPoint, Color lineColor, Color fillColor, Point[] pointsList )
  {
    super( firstPoint, lineColor, fillColor, pointsList );
  }

  public void draw( Graphics2D g )
  {
    g.setStroke( new BasicStroke( 3 ) );

    int x = Math.abs( getPointsList()[1].x - getPointsList()[0].x );
    int y = Math.abs( getPointsList()[1].y - getPointsList()[0].y );
    int best;

    if ( x > y ) {
      best = y;
    } else {
      best = x;
    }

    g.setColor( getFillColor() );
    g.fillOval( getPointsList()[0].x, getPointsList()[0].y, best, best );
    g.setColor( getLineColor() );
    g.drawOval( getPointsList()[0].x, getPointsList()[0].y, best, best );
  }
}
