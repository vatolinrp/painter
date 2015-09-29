package by.bsu.vatolinrp;

import java.awt.Color;
import java.awt.Point;

public abstract class Figure2D extends Figure
{

    protected Color fillColor;

    public Color getFillColor()
    {
        return fillColor;
    }

    public void setFillColor(Color fillColor)
    {
        this.fillColor = fillColor;
    }

}
