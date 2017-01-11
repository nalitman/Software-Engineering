
import javax.swing.JFrame;

public class CircleViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(300, 500);
        frame.setTitle("Display");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        CircleComponent circle = new CircleComponent();
        frame.add(circle);
        
        frame.setVisible(true);
        
    }
}
        
