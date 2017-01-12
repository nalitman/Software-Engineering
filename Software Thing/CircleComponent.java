import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;
import java.util.*;

public class CircleComponent extends JComponent
{
    int x,y,w,l;
    Graphics2D page2;
    Color col;
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
        int num, Cx, Cy, Cd;
        
        //Draw a circle
        Ellipse2D.Double circle1 = new Ellipse2D.Double(5, 10, 100, 100);
        g2.draw(circle1);
        
        Random gen = new Random();
        
        num = gen.nextInt(100) + 10;
        
        for(int k = 0; k <= num; k++)
        {
            Cx = gen.nextInt(800) + 1;
            Cy = gen.nextInt(800) + 1;
            Cd = gen.nextInt(25) + 5;
            Ellipse2D.Double circleX = new Ellipse2D.Double(Cx, Cy, Cd, Cd);
            
            g2.draw(circleX);
        }
    }
    
    public void nextFrame(Graphics page, int time)
    {
        page2 = (Graphics2D) page;
        
        if(time % 3 == 0)
            col = Color.BLUE;
        else if(time % 2 == 0)
            col = Color.RED;
        else
            col = Color.GREEN;
            
        page.setColor(col);
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
