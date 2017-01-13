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
           int colIndex;
        //Draw a circle
        Ellipse2D.Double circle1 = new Ellipse2D.Double(5, 10, 100, 100);
        g2.draw(circle1);
        
        Random gen = new Random();
        
        num = gen.nextInt(400) + 100;
        
        for(int k = 0; k <= num; k++)
        {
            Cx = gen.nextInt(1366) + 1;
            Cy = gen.nextInt(768) + 1;
            Cd = gen.nextInt(250) + 5;
         
        
        colIndex = gen.nextInt(5) +1;
        if(colIndex == 5)
        col = Color.BLUE;
        
        else if(colIndex == 4)
        col = Color.YELLOW;
        
        else if(colIndex == 3)
        col = Color.MAGENTA;
        
        else if(colIndex == 2)
        col = Color.GREEN;
        
        else
        col = Color.RED;
            Ellipse2D.Double circleX = new Ellipse2D.Double(Cx, Cy, Cd, Cd);
            g2.setColor(col);
            g2.draw(circleX);
        }
    }
    
    public void nextFrame(Graphics page, int time)
    {
        page2 = (Graphics2D) page;
        
        Random gen = new Random();
        
        
            
        page.setColor(col);
        repaint();
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
