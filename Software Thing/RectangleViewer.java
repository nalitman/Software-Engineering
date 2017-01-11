import javax.swing.JFrame;

public class RectangleViewer
{
    final static int ANIMATION_TIME = 60;
    
   public static void main(String[] args) throws InterruptedException
   {
      JFrame frame = new JFrame();

      frame.setSize(300, 400);
      frame.setTitle("Two rectangles");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      RectangleComponent component = new RectangleComponent();
      frame.add(component);
      
      frame.setVisible(true);
      
      RectangleComponent component2 = new RectangleComponent(50, 50, 50, 30);
      frame.add(component2);
      
      frame.setVisible(true);
      
      FaceComponent face = new FaceComponent();
      frame.add(face);
      
      frame.setVisible(true);
      
      
      
      // animate the cityscape
       for (int seconds = 0; seconds < ANIMATION_TIME; seconds ++ )
        {
            component.nextFrame();
            Thread.sleep(1000);
       }
       
   }
}
