import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

public class CircleComponent extends JComponent
{
    int x,y,w,l;
    
    public CircleComponent(int x, int y, int d)
    {
        this.x = x;
        this.y = y;
        this.w = d;
        this.l = d;
    }
    public void paintComponent (Graphics g)
    {
        //Recover Graphics 2D
        Graphics2D g2 = (Graphics2D) g;
        
        //Draw a circle
        Ellipse2D.Double circle1 = new Ellipse2D.Double(5, 10, 100, 100);
        g2.draw(circle1);
    }
    
    public int getX()
    {
        return(this.x);
    }
    
    public void setX(int newX)
    {
        this.x = newX;
    }
    
    public int getY()
    {
        return(this.y);
    }
    
    public void getY(int newY)
    {
        this.y = newY;
    }
    
    public int getD()
    {
        return(this.w);
    }
    
    public void setD(int newD)
    {
        this.w = newD;
        this.l = newD;
    }
    
    
}
