package by.bsu.vatolinrp.panels;

import by.bsu.vatolinrp.shapes.dimension.Figure;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class ShapePanel extends JPanel
{
  private ArrayList<Figure> AL;
  private java.util.List<Point> points = new ArrayList<Point>();

  public ShapePanel( ArrayList<Figure> al )
  {
    super();
    AL = al;
    addMouseListener( new MouseAdapter() {
      public void mousePressed( MouseEvent event )
      {
        points.add( event.getPoint() );
        repaint();
      }
    } );
  }

  protected void paintComponent( Graphics g )
  {
    super.paintComponent( g );
    Graphics2D g2 = (Graphics2D)g;
    for( int i = 0; i < points.size(); ++i ) {
      Point p = points.get( i );
      g.drawOval( p.x, p.y, 3, 3 );
    }

    for( int i = 0; i < AL.size(); ++i ) {
      AL.get( i ).draw( g2 );
    }

  }

  public java.util.List<Point> getPoints()
  {
    return points;
  }

}
