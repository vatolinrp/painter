package by.bsu.vatolinrp;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.*;

public class MainFrame extends JFrame
{

    private ArrayList<Figure> list = new ArrayList<Figure>();
    private Figure current;

    private JMenuItem openItem;
    private JMenuItem saveItem;
    private JMenuItem exitItem;

    private JMenuItem helpItem;

    private JMenuItem EditItem;
    private JMenuItem ColorItem;
    private JMenuItem ColorItem1;

    private JMenuItem segment;
    private JMenuItem beam;
    private JMenuItem line;

    private JMenuItem poligon;
    private JMenuItem regular;
    private JMenuItem rect;
    private JMenuItem rhomb;
    private JMenuItem oval;

    private JMenuItem square;
    private JMenuItem triangle;

    private JMenuItem Clear;
    private JFileChooser fc;
    // __________________________________________________
    private Color selectedColor = Color.BLUE;
    private Color selectedColor1 = Color.GREEN;

    ShapePanel tp;
    static int q = 0;

    MainFrame()
    {
        super();

        createMenu();

        addFiguresPanel();

        addKeyListener(new KeyHandler());

        setSize(600, 500);
        setResizable(false);
    }

    private void addFiguresPanel()
    {
        Container content = getContentPane();

        tp = new ShapePanel(list);
        content.add(tp);
    }

    private void createMenu()
    {

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        createMenuBar(menuBar);
        addListeners();
    }

    private void createMenuBar(JMenuBar menuBar)
    {
        JMenu fileMenu = new JMenu("File");
        JMenu EditMenu = new JMenu("Edit");
        JMenu PaintMenu1D = new JMenu("Paint1D");
        JMenu PaintMenu2D = new JMenu("Paint2D");
        JMenu regular = new JMenu("RegularFigure");
        JMenu helpMenu = new JMenu("Help");

        menuBar.add(fileMenu);

        menuBar.add(EditMenu);
        menuBar.add(PaintMenu1D);
        menuBar.add(PaintMenu2D);

        menuBar.add(helpMenu);

        createItems();
        // fileMenu.add(openItem);
        // fileMenu.add(saveItem);
        // fileMenu.addSeparator();
        fileMenu.add(exitItem);

        helpMenu.add(helpItem);

        EditMenu.add(EditItem);
        EditMenu.add(ColorItem);
        EditMenu.add(ColorItem1);
        EditMenu.add(Clear);

        PaintMenu1D.add(segment);
        PaintMenu1D.add(beam);
        PaintMenu1D.add(line);

        PaintMenu2D.add(poligon);
        PaintMenu2D.add(regular);
        PaintMenu2D.add(rect);
        PaintMenu2D.add(rhomb);
        PaintMenu2D.add(oval);

        regular.add(triangle);
        regular.add(square);

    }

    private void addListeners()
    {

        DemoAction lDemoAction = new DemoAction();
        openItem.addActionListener(lDemoAction);
        saveItem.addActionListener(lDemoAction);
        exitItem.addActionListener(lDemoAction);

        helpItem.addActionListener(lDemoAction);

        EditItem.addActionListener(lDemoAction);
        ColorItem.addActionListener(lDemoAction);
        ColorItem1.addActionListener(lDemoAction);
        Clear.addActionListener(lDemoAction);

        segment.addActionListener(lDemoAction);
        beam.addActionListener(lDemoAction);
        line.addActionListener(lDemoAction);

        poligon.addActionListener(lDemoAction);
        regular.addActionListener(lDemoAction);
        rect.addActionListener(lDemoAction);
        rhomb.addActionListener(lDemoAction);
        oval.addActionListener(lDemoAction);

        triangle.addActionListener(lDemoAction);
        square.addActionListener(lDemoAction);

    }

    private void createItems()
    {

        openItem = new JMenuItem("Open...");
        saveItem = new JMenuItem("Save as...");
        exitItem = new JMenuItem("Exit");

        helpItem = new JMenuItem("About");

        EditItem = new JMenuItem("Move Figure");
        ColorItem = new JMenuItem("Color of borders");
        ColorItem1 = new JMenuItem("Color of fill");
        Clear = new JMenuItem("Clear All");

        segment = new JMenuItem("Segment");
        beam = new JMenuItem("Beam");
        line = new JMenuItem("Line");

        poligon = new JMenuItem("Poligon");
        regular = new JMenuItem("Regular Figure");
        rect = new JMenuItem("Rectangle");
        rhomb = new JMenuItem("Rhombus");
        oval = new JMenuItem("Oval");

        square = new JMenuItem("Square");
        triangle = new JMenuItem("Triangle");

    }

    public static void main(String[] args)
    {

        MainFrame mf = new MainFrame();
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mf.show();

    }

    class DemoAction implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            Object object = event.getSource();
            if (object == exitItem)
                exitItem_Action(event);
            // else if (object == openItem)
            // openItem_Action(event);

            else if (object == helpItem)
                helpItem_Action(event);
            else if (object == EditItem)
                EditItem_Action(event);
            else if (object == ColorItem)
                ColorItem_Action(event);
            else if (object == ColorItem1)
                ColorItem1_Action(event);
            else if (object == segment)
                segmentItem_Action(event);
            else if (object == beam)
                beamItem_Action(event);
            else if (object == line)
                lineItem_Action(event);
            else if (object == poligon)
                poligonItem_Action(event);
            else if (object == oval)
                ovalItem_Action(event);
            else if (object == rect)
                rectItem_Action(event);
            else if (object == rhomb)
                rhombItem_Action(event);
            else if (object == square)
                squareItem_Action(event);
            else if (object == triangle)
                triangleItem_Action(event);
            else if (object == Clear)
                ClearItem_Action(event);

        }

    }

    private void clearLists()
    {

        list.clear();
    }

    private int prepareFileChooserForLoad()
    {
        fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int returnVal = fc.showSaveDialog(this);
        return returnVal;
    }

    private void ColorItem_Action(ActionEvent event)
    {
        selectedColor = JColorChooser.showDialog(this, "Choose color", Color.blue);

        System.out.println(selectedColor);
    }

    private void ColorItem1_Action(ActionEvent event)
    {
        selectedColor1 = JColorChooser.showDialog(this, "Choose color", Color.green);

        System.out.println(selectedColor);
    }

    private void exitItem_Action(ActionEvent event)
    {
        System.exit(0);
    }

    private void helpItem_Action(ActionEvent event)
    {
        JOptionPane.showMessageDialog(null, "Luka Chepukhin,2014");
    }

    private void EditItem_Action(ActionEvent event)
    {
        ArrayList<Point> points = tp.getPoints();
        if (points.size() >= 2)
        {
            current.move(points.get(0));
            this.repaint();
            points.clear();

        }
        else
        {
            JOptionPane.showMessageDialog(null, "Недостаточно точек");
        }
    }

    private void segmentItem_Action(ActionEvent event)
    {

        ArrayList<Point> points = tp.getPoints();

        if (points.size() >= 2)
        {
            Figure c = new Segment(points.get(0), selectedColor, points.get(1));
            current = c;
            list.add(c);
            this.repaint();
            points.clear();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Недостаточно точек");
        }

    }

    private void beamItem_Action(ActionEvent event)
    {

        ArrayList<Point> points = tp.getPoints();
        if (points.size() >= 2)
        {
            Figure c = new Beam(points.get(0), selectedColor, points.get(1));
            current = c;
            list.add(c);
            this.repaint();
            points.clear();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Недостаточно точек");
        }

    }

    private void lineItem_Action(ActionEvent event)
    {

        ArrayList<Point> points = tp.getPoints();
        if (points.size() >= 2)
        {
            Figure c = new Line(points.get(0), selectedColor, points.get(1));
            current = c;
            list.add(c);
            this.repaint();
            points.clear();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Недостаточно точек");
        }

    }

    private void poligonItem_Action(ActionEvent event)
    {

        ArrayList<Point> points = tp.getPoints();
        if (points.size() >= 2)
        {
            Figure c = new Poligon(points.get(0), selectedColor, selectedColor1,
                    points.toArray(new Point[points.size()]));
            current = c;
            list.add(c);
            this.repaint();
            points.clear();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Недостаточно точек");
        }

    }

    private void rectItem_Action(ActionEvent event)
    {

        ArrayList<Point> points = tp.getPoints();
        if (points.size() >= 2)
        {
            Figure c = new Rectangle(points.get(0), selectedColor, selectedColor1, points.toArray(new Point[points
                    .size()]));
            current = c;
            list.add(c);
            this.repaint();
            points.clear();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Недостаточно точек");
        }

    }

    private void ovalItem_Action(ActionEvent event)
    {

        ArrayList<Point> points = tp.getPoints();
        if (points.size() >= 2)
        {
            Figure c = new Oval(points.get(0), selectedColor, selectedColor1, points.toArray(new Point[points.size()]));
            current = c;
            list.add(c);
            this.repaint();
            points.clear();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Недостаточно точек");
        }

    }

    private void rhombItem_Action(ActionEvent event)
    {

        ArrayList<Point> points = tp.getPoints();
        if (points.size() >= 2)
        {
            Figure c = new Rhombus(points.get(0), selectedColor, selectedColor1,
                    points.toArray(new Point[points.size()]));
            current = c;
            list.add(c);
            this.repaint();
            points.clear();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Недостаточно точек");
        }

    }

    private void squareItem_Action(ActionEvent event)
    {

        ArrayList<Point> points = tp.getPoints();
        if (points.size() >= 2)
        {
            Figure c = new Square(points.get(1), selectedColor, selectedColor1, points.get(0));
            current = c;
            list.add(c);
            this.repaint();
            points.clear();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Недостаточно точек");
        }

    }

    private void triangleItem_Action(ActionEvent event)
    {

        ArrayList<Point> points = tp.getPoints();
        if (points.size() >= 2)
        {
            Figure c = new Triangle(points.get(1), selectedColor, selectedColor1, points.get(0));
            current = c;
            list.add(c);
            this.repaint();
            points.clear();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Недостаточно точек");
        }

    }

    private void ClearItem_Action(ActionEvent event)
    {
        clearLists();
        this.repaint();

    }

    class KeyHandler implements KeyListener
    {

        public void keyPressed(KeyEvent event)
        {
            int keyCode = event.getKeyCode();
            if (keyCode == KeyEvent.VK_ALT)
            {
                if (q == list.size())
                {
                    q = 0;
                }
                current = list.get(q);
                q++;
            }

        }

        public void keyReleased(KeyEvent evevnt)
        {

        }

        public void keyTyped(KeyEvent evevnt)
        {

        }

    }

}

class ShapePanel extends JPanel
{
    private ArrayList<Figure> AL;
    private ArrayList<Point> points = new ArrayList<Point>();

    public ShapePanel(ArrayList<Figure> al)
    {
        super();
        AL = al;
        addMouseListener(new MouseAdapter()
        {
            public void mousePressed(MouseEvent event)
            {
                points.add(event.getPoint());
                repaint();

            }

        });

    }

    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for (int i = 0; i < points.size(); ++i)
        {
            Point p = points.get(i);
            g.drawOval(p.x, p.y, 3, 3);
        }

        for (int i = 0; i < AL.size(); ++i)
        {
            AL.get(i).paint(g2);
        }

    }

    public ArrayList<Point> getPoints()
    {
        return points;
    }

}
