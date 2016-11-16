package by.bsu.vatolinrp;

import by.bsu.vatolinrp.listeners.ExitListener;
import by.bsu.vatolinrp.panels.ShapePanel;
import by.bsu.vatolinrp.shapes.dimension.Figure;
import by.bsu.vatolinrp.shapes.dimension.one.Line;
import by.bsu.vatolinrp.shapes.dimension.one.Ray;
import by.bsu.vatolinrp.shapes.dimension.one.Segment;
import by.bsu.vatolinrp.shapes.dimension.two.Circle;
import by.bsu.vatolinrp.shapes.dimension.two.Ellipse;
import by.bsu.vatolinrp.shapes.dimension.two.IsoscelesTriangle;
import by.bsu.vatolinrp.shapes.dimension.two.Parallelogram;
import by.bsu.vatolinrp.shapes.dimension.two.RegularFigure;
import by.bsu.vatolinrp.shapes.dimension.two.Rhombus;
import by.bsu.vatolinrp.util.PointValidator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class MainFrame
  extends JFrame
{

  private ArrayList<Figure> list = new ArrayList<Figure>();
  private Figure current;

  private JMenuItem exitItem;

  private JMenuItem move;
  private JMenuItem lineColorItem;
  private JMenuItem fillColorItem;

  private JMenuItem segment;
  private JMenuItem ray;
  private JMenuItem line;

  private JMenuItem poligon;
  private JMenuItem rect;
  private JMenuItem rhomb;
  private JMenuItem parallelogram;
  private JMenuItem isoscelesTriangle;
  private JMenuItem ellipse;
  private JMenuItem circle;

  private JMenuItem regular;

  private JMenuItem Clear;

  private Color lineColor = Color.BLUE;
  private Color fillColor = Color.GREEN;

  private JTextField textField;

  private ShapePanel shapePanel;

  public MainFrame()
  {
    super();
    setLayout( new GridLayout( 1, 2 ) );
    JMenuBar menuBar = new JMenuBar();
    setJMenuBar( menuBar );
    JMenu fileMenu = new JMenu( "File" );
    JMenu editMenu = new JMenu( "Edit" );
    JMenu paintMenu1D = new JMenu( "Paint1D" );
    JMenu paintMenu2D = new JMenu( "Paint2D" );

    menuBar.add( fileMenu );

    menuBar.add( editMenu );
    menuBar.add( paintMenu1D );
    menuBar.add( paintMenu2D );

    textField = new JTextField( 5 );
    exitItem = new JMenuItem( "Exit" );

    move = new JMenuItem( "Move Figure" );
    lineColorItem = new JMenuItem( "Color of borders" );
    fillColorItem = new JMenuItem( "Color of fill" );
    Clear = new JMenuItem( "Clear All" );

    segment = new JMenuItem( "Segment" );
    ray = new JMenuItem( "Ray" );
    line = new JMenuItem( "Line" );

    poligon = new JMenuItem( "Polygon" );
    rect = new JMenuItem( "Rectangle" );
    rhomb = new JMenuItem( "Rhombus" );
    parallelogram = new JMenuItem( "Parallelogram" );
    ellipse = new JMenuItem( "Ellipse" );
    circle = new JMenuItem( "Circle" );

    regular = new JMenuItem( "regular" );
    isoscelesTriangle = new JMenuItem( "Triangle with equal sides" );


    fileMenu.add( exitItem );

    editMenu.add( move );
    editMenu.add( lineColorItem );
    editMenu.add( fillColorItem );
    editMenu.add( Clear );

    paintMenu1D.add( segment );
    paintMenu1D.add( ray );
    paintMenu1D.add( line );

    paintMenu2D.add( poligon );
    paintMenu2D.add( rect );
    paintMenu2D.add( rhomb );
    paintMenu2D.add( parallelogram );
    paintMenu2D.add( isoscelesTriangle );
    paintMenu2D.add( ellipse );
    paintMenu2D.add( circle );
    paintMenu2D.add( regular );
    exitItem.addActionListener( new ExitListener() );
    shapePanel = new ShapePanel( list );

    move.addActionListener( new ActionListener() {
      public void actionPerformed( ActionEvent e )
      {
        if ( PointValidator.isEnoughPoints( shapePanel, 1 ) ) {
          current.move( shapePanel.getPoints().get( 0 ) );
        }
        shapePanel.repaint();
        shapePanel.getPoints().clear();
      }
    } );
    lineColorItem.addActionListener( new ActionListener() {
      public void actionPerformed( ActionEvent e )
      {
        lineColor = JColorChooser
          .showDialog( shapePanel, "Choose color", Color.green );
      }
    } );
    fillColorItem.addActionListener( new ActionListener() {
      public void actionPerformed( ActionEvent e )
      {
        fillColor = JColorChooser
          .showDialog( shapePanel, "Choose color", Color.green );
      }
    } );
    Clear.addActionListener( new ActionListener() {
      public void actionPerformed( ActionEvent e )
      {
        list.clear();
        shapePanel.repaint();
      }
    } );

    segment.addActionListener( new ActionListener() {
      public void actionPerformed( ActionEvent e )
      {
        if ( PointValidator.isEnoughPoints( shapePanel, 2 ) ) {
          Figure c = new Segment(
            shapePanel.getPoints().get( 0 ), lineColor,
            shapePanel.getPoints().get( 1 ) );
          current = c;
          list.add( c );
          shapePanel.repaint();
          shapePanel.getPoints().clear();
        }
      }
    } );
    ray.addActionListener( new ActionListener() {
      public void actionPerformed( ActionEvent e )
      {
        if ( PointValidator.isEnoughPoints( shapePanel, 2 ) ) {
          Figure c = new Ray(
            shapePanel.getPoints().get( 0 ), lineColor,
            shapePanel.getPoints().get( 1 ) );
          current = c;
          list.add( c );
          shapePanel.repaint();
          shapePanel.getPoints().clear();
        }
      }
    } );
    line.addActionListener( new ActionListener() {
      public void actionPerformed( ActionEvent e )
      {
        if ( PointValidator.isEnoughPoints( shapePanel, 2 ) ) {
          Figure c = new Line(
            shapePanel.getPoints().get( 0 ), lineColor,
            shapePanel.getPoints().get( 1 ) );
          current = c;
          list.add( c );
          shapePanel.repaint();
          shapePanel.getPoints().clear();
        }
      }
    } );

    poligon.addActionListener( new ActionListener() {
      public void actionPerformed( ActionEvent e )
      {
        if ( PointValidator.isEnoughPoints( shapePanel, 3 ) ) {
          Figure c = new by.bsu.vatolinrp.shapes.dimension.two.Polygon(
            shapePanel.getPoints().get( 0 ), lineColor, fillColor, shapePanel
              .getPoints().toArray( new Point[shapePanel.getPoints().size()] ) );
          current = c;
          list.add( c );
          shapePanel.repaint();
          shapePanel.getPoints().clear();
        }
      }
    } );
    rect.addActionListener( new ActionListener() {
      public void actionPerformed( ActionEvent e )
      {
        if ( PointValidator.isEnoughPoints( shapePanel, 2 ) ) {
          Figure c = new by.bsu.vatolinrp.shapes.dimension.two.Rectangle(
            shapePanel.getPoints().get( 0 ), lineColor, fillColor, shapePanel
              .getPoints().toArray( new Point[shapePanel.getPoints().size()] ) );
          current = c;
          list.add( c );
          shapePanel.repaint();
          shapePanel.getPoints().clear();
        }
      }
    } );
    rhomb.addActionListener( new ActionListener() {
      public void actionPerformed( ActionEvent e )
      {
        if ( PointValidator.isEnoughPoints( shapePanel, 2 ) ) {
          Figure c = new Rhombus(
            shapePanel.getPoints().get( 0 ), lineColor, fillColor, shapePanel
              .getPoints().toArray( new Point[shapePanel.getPoints().size()] ) );
          current = c;
          list.add( c );
          shapePanel.repaint();
          shapePanel.getPoints().clear();
        }
      }
    } );
    parallelogram.addActionListener( new ActionListener() {
      public void actionPerformed( ActionEvent e )
      {
        if ( PointValidator.isEnoughPoints( shapePanel, 2 ) ) {
          Figure c = new Parallelogram(
            shapePanel.getPoints().get( 0 ), lineColor, fillColor, shapePanel
              .getPoints().toArray( new Point[shapePanel.getPoints().size()] ) );
          current = c;
          list.add( c );
          shapePanel.repaint();
          shapePanel.getPoints().clear();
        }
      }
    } );
    isoscelesTriangle.addActionListener( new ActionListener() {
      public void actionPerformed( ActionEvent e )
      {
        if ( PointValidator.isEnoughPoints( shapePanel, 2 ) ) {
          Figure c = new IsoscelesTriangle(
            shapePanel.getPoints().get( 0 ), lineColor, fillColor, shapePanel
              .getPoints().toArray( new Point[shapePanel.getPoints().size()] ) );
          current = c;
          list.add( c );
          shapePanel.repaint();
          shapePanel.getPoints().clear();
        }
      }
    } );
    ellipse.addActionListener( new ActionListener() {
      public void actionPerformed( ActionEvent e )
      {
        if ( PointValidator.isEnoughPoints( shapePanel, 2 ) ) {
          Figure c = new Ellipse(
            shapePanel.getPoints().get( 0 ), lineColor, fillColor, shapePanel
              .getPoints().toArray( new Point[shapePanel.getPoints().size()] ) );
          current = c;
          list.add( c );
          shapePanel.repaint();
          shapePanel.getPoints().clear();
        }
      }
    } );
    circle.addActionListener( new ActionListener() {
      public void actionPerformed( ActionEvent e )
      {
        if ( PointValidator.isEnoughPoints( shapePanel, 2 ) ) {
          Figure c = new Circle(
            shapePanel.getPoints().get( 0 ), lineColor, fillColor, shapePanel
              .getPoints().toArray( new Point[shapePanel.getPoints().size()] ) );
          current = c;
          list.add( c );
          shapePanel.repaint();
          shapePanel.getPoints().clear();
        }
      }
    } );

    regular.addActionListener( new ActionListener() {
      public void actionPerformed( ActionEvent e )
      {
        if ( PointValidator.isEnoughPoints( shapePanel, 2 ) ) {
          int num = new Integer( textField.getText() );
          Figure c = new RegularFigure(
            shapePanel.getPoints().get( 0 ), lineColor, fillColor, shapePanel
              .getPoints().toArray( new Point[shapePanel.getPoints().size()] ),
            num );
          current = c;
          list.add( c );
        }
        shapePanel.repaint();
        shapePanel.getPoints().clear();
      }
    } );


    add( shapePanel );
    add( textField );


    setSize( 600, 500 );
    setResizable( false );
  }

  public static void main( String[] args )
  {

    MainFrame mf = new MainFrame();
    mf.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    mf.show();

  }
}
