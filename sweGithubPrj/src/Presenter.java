

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Presenter implements ActionListener{

    private View view;
    private Model model;

    public Presenter(){
        this.model = new Model();
        this.view = new View();
        view.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        view.setText(model.getText().toString());
        
    }
}