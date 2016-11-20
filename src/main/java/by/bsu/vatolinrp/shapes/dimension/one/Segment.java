package by.bsu.vatolinrp.shapes.dimension.one;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

public class Segment extends Figure1D
{

  public Segment( Point firstPoint, Color lineColor, Point secondPoint )
  {
    this.firstPoint = firstPoint;
    this.lineColor = lineColor;
    this.secondPoint = secondPoint;
  }

  public void draw( Graphics2D g )
  {
    g.setStroke( new BasicStroke( 3 ) );
    g.setColor( lineColor );
    g.drawLine( firstPoint.x, firstPoint.y, secondPoint.x, secondPoint.y );
  }

  public void move( Point point )
  {
    Point p = getFirstPoint();
    setFirstPoint( point );
    setSecondPoint( new Point( secondPoint.x - p.x + firstPoint.x, secondPoint.y - p.y + firstPoint.y ) );
  }

}
