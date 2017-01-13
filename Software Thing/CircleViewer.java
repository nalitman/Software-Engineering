
import javax.swing.JFrame;

public class CircleViewer
{
    final static int ANIMATION_TIME = 60000;
    public static void main(String[] args) throws InterruptedException
    {
        JFrame frame = new JFrame();
        frame.setSize(1366, 768);
        frame.setTitle("Display");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        CircleComponent circle = new CircleComponent(5,100,100);
        frame.add(circle);
        
        frame.setVisible(true);
        
        for (int seconds = 0; seconds < ANIMATION_TIME; seconds ++ )
        {
            circle.nextFrame(frame.getGraphics(), seconds);
            
            Thread.sleep(3000);
       }
    }
}
        
