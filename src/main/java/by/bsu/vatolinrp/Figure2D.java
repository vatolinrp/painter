package by.bsu.vatolinrp;

import java.awt.Color;
import java.awt.Point;

public abstract class Figure2D extends Figure
{

    private Color fillColor;

    public Figure2D(Point firstPoint, Color lineColor, Color fillColor)
    {
        super(firstPoint, lineColor);
        this.fillColor = fillColor;

    }

    public Color getFillColor()
    {
        return fillColor;
    }

    public void setFillColor(Color fillColor)
    {
        this.fillColor = fillColor;
    }

}
