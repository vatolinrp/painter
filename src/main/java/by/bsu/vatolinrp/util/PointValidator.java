package by.bsu.vatolinrp.util;

import by.bsu.vatolinrp.panels.ShapePanel;

import javax.swing.JOptionPane;

public class PointValidator
{
  public static boolean isEnoughPoints( ShapePanel shapePanel, int numberNeeded )
  {
    if ( ( shapePanel.getPoints() ).size() >= numberNeeded ) {
      return true;
    } else {
      JOptionPane.showMessageDialog( null, "need points: " + numberNeeded );
      return false;
    }
  }
}
