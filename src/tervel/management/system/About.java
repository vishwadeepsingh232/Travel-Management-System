
package tervel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener{
    About(){
      setBounds(600,200,500,550)  ;
      setLayout(null);
      getContentPane().setBackground(Color.white);
      
      JLabel l1 = new JLabel("ABOUT");
      l1.setBounds(150,10,100,40);
      l1.setForeground(Color.red);
      l1.setFont(new Font("Tahoma",Font.PLAIN,20));
      add(l1);
      
      String s="In the \"Travel and Tourist\" section of an application, users can explore various destinations, plan their trips, and discover exciting activities "
              + "and attractions. This section serves as a gateway to adventure, offering users a wealth of information about different travel destinations, including"
              + " popular tourist spots, hidden gems, and off-the-beaten-path locations. Users can browse through curated travel guides, read reviews and recommendations "
              + "from fellow travelers, and access essential travel information such as transportation options, accommodation details, and local customs and traditions. "
              + "Whether users are looking for a relaxing beach getaway, an adrenaline-pumping outdoor adventure, or a cultural immersion experience, the"
              + " \"Travel and Tourist\" section provides them with the tools and resources they need to turn their travel dreams into reality. From booking "
              + "flights and hotels to discovering unique experiences and creating personalized itineraries, this section aims to inspire and empower users to"
              + " embark on unforgettable journeys around the world.";
      
      
      
      TextArea area = new TextArea(s,10,40, Scrollbar.VERTICAL);
      area.setEditable(false);
      area.setBounds(20,100,450,300);
              add(area);
              
               JButton back =new JButton("Back");
        back.setBounds(200,420,100,25);
        back.addActionListener(this);
        add(back);
              
              setVisible(true);
      
        
    }
    public void actionPerformed(ActionEvent e){
        setVisible(false);
    }
    
    
    
      public static void main(String args[])  {
         new About(); 
      }
}
    
