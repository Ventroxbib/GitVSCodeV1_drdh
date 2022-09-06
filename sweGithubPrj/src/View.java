import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class View extends JFrame {

    private JButton helloWorld;

    public void View(){
        JFrame meinJFrame = new JFrame();
        meinJFrame.setTitle("Hello World");
        JPanel panel = new JPanel();
        JButton button = new JButton("Hello World");

        panel.add(button);

        meinJFrame.add(panel);

        meinJFrame.pack();

        meinJFrame.setVisible(true);
    }
}
