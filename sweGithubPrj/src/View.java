
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public class View extends JFrame implements Presenter.View{

    JLabel label;

    public View(){
        init();
    }

    private void init(){
        label = new JLabel(" ");
        label.setHorizontalAlignment(JLabel.CENTER);
        JButton button = new JButton("klick");
      //  button.addActionListener((ActionListener) new Presenter(this));
        JFrame frame = new JFrame("MVC");
        frame.add(label, BorderLayout.NORTH);
        frame.add(button, BorderLayout.CENTER);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        label.setText("Hello World");
    }

    @Override
    public void setText(String s) {
        label.setText(s);
        
    }
}