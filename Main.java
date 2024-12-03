import java.awt.*;
import java.awt.event.*;

class Regform extends Frame {

    Regform() {

        setSize(500,500);
        setTitle("Registration Form");

        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        Label l1 = new Label ("Registration Form", Label.CENTER);
        l1.setBounds(150, 50, 200, 30);

        add(l1);

        Label l2 = new Label ("Username");
        
        TextField t1 = new TextField(20);

        add(l2);
        add(t1);

        Label l3 = new Label ("Email");
        TextField t3 = new TextField(20);
        add(l3);
        add(t3);

        Button submitButton = new Button("Submit");
        add(submitButton);

        addWindowListener(new WindowAdapter() {

            public void windowClosing (WindowEvent we) {
                System.exit(0);
            }
        });

        setVisible(true);
    }
   
 public static void main(String[] args) {
        new Regform();
    }
}