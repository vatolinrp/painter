package by.bsu.vatolinrp;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

public class Ray extends Segment
{
    public Ray(Point firstPoint, Color lineColor, Point secondPoint)
    {
        super(firstPoint, lineColor, secondPoint);
    }

    public void draw(Graphics2D g)
    {
        int x1 = getFirstPoint().x;
        int x2 = getSecondPoint().x;
        int y1 = getFirstPoint().y;
        int y2 = getSecondPoint().y;

        int res_x1;
        int res_x2;
        int res_y1;
        int res_y2;

        if (x1 <= x2)
        {
            res_x1 = x1;
            res_y1 = y1;
            res_x2 = 601;
            if((x1-x2)!=0)
            {
                res_y2 = (x1 * y2 - x2 * y1 + res_x2
                        * (y1 - y2))
                        / (x1 - x2);
            }
            else
            {
                res_y2 = (x1 * y2 - x2 * y1 + res_x2
                        * (y1 - y2));
            }
            Point point1 = new Point(res_x1, res_y1);
            Point point2 = new Point(res_x2, res_y2);
            setFirstPoint(point1);
            setSecondPoint(point2);
        }
        else
        {
            res_x1 = x1;
            res_y1 = y1;
            res_x2 = 0;
            if((x1-x2)!=0)
            {
                res_y2 = (x1 * y2 - x2 * y1 + res_x2
                        * (y1 - y2))
                        / (x1 - x2);
            }
            else
            {
                res_y2 = (x1 * y2 - x2 * y1 + res_x2
                        * (y1 - y2));
            }
            Point point1 = new Point(res_x1, res_y1);
            Point point2 = new Point(res_x2, res_y2);
            setFirstPoint(point1);
            setSecondPoint(point2);
        }
        super.draw(g);
    }

}
