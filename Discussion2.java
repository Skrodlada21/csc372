import javax.swing.JFrame
/**
 * Sample Program for creating a window
 */
public class MyFrameViewer
{
    public static void main(String[] args)
{
    JFrame myframe - new JFrame()
    final int F_WIDTH = 250
    final int F_HEIGHT = 250
    myframe.setSize(F_WIDTH, F_HEIGHT);
    myframe.setTitle("My amazing frame");
    myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    myframe.setVisible(true);
}
}