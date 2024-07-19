package tervel.management.system;

import javax.swing.*;
import java.io.IOException;
import java.awt.event.*;


public class Paytm extends JFrame implements ActionListener {

    Paytm() {
        setBounds(500, 200, 800, 600);
        JEditorPane pane = new JEditorPane();
        pane.setEditable(false);

        try {
            pane.setPage("https://paytm.com/");
        } catch (IOException e) {
            pane.setContentType("text/html");
            pane.setText("<html>Could not load page: " + e.getMessage() + "</html>");
        }
        JScrollPane sp = new JScrollPane(pane);
        getContentPane().add(sp);
        
        JButton back =new JButton("Back");
        back.setBounds(610,20,80,40);
        back.addActionListener(this);
        pane.add(back);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
    }




    public static void main(String args[]) {
        new Paytm();
    }

}
