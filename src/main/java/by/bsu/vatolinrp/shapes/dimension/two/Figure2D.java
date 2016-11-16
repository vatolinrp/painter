package by.bsu.vatolinrp.shapes.dimension.two;

import by.bsu.vatolinrp.shapes.dimension.Figure;

import java.awt.Color;

public abstract class Figure2D extends Figure
{

  protected Color fillColor;

  public Color getFillColor()
  {
    return fillColor;
  }

  public void setFillColor( Color fillColor )
  {
    this.fillColor = fillColor;
  }

}
