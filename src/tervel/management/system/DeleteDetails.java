
package tervel.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class DeleteDetails extends JFrame implements ActionListener{
  JButton back;
String username;
  DeleteDetails(String username) {
      this.username=username;
    setBounds(450, 180, 870, 625);
    getContentPane().setBackground(Color.white);
    setLayout(null);

    JLabel lblusername = new JLabel("username");
    lblusername.setBounds(30, 50, 150, 25);
    add(lblusername);

    JLabel labelusername = new JLabel();
    labelusername.setBounds(220, 50, 150, 25);
    add(labelusername);

    JLabel Iblid = new JLabel("Id");
    Iblid.setBounds(30, 110, 150, 25);
    add(Iblid);

    JLabel labelid = new JLabel();
    labelid.setBounds(220, 110, 150, 25);
    add(labelid);

    JLabel Iblnumber = new JLabel("Number");
    Iblnumber.setBounds(30, 170, 150, 25);
    add(Iblnumber);

    JLabel labelnumber = new JLabel();
    labelnumber.setBounds(220, 170, 150, 25);
    add(labelnumber);

    JLabel Iblname = new JLabel("Name");
    Iblname.setBounds(30, 230, 150, 25);
    add(Iblname);

    JLabel labelname = new JLabel();
    labelname.setBounds(220, 230, 150, 25);
    add(labelname);

    JLabel Iblgender = new JLabel("Gender");
    Iblgender.setBounds(30, 290, 150, 25);
    add(Iblgender);

    JLabel labelgender = new JLabel();
    labelgender.setBounds(220, 290, 150, 25);
    add(labelgender);

    JLabel Iblcountry = new JLabel("Country");
    Iblcountry.setBounds(500, 50, 150, 25);
    add(Iblcountry);

    JLabel labelcountry = new JLabel();
    labelcountry.setBounds(690, 50, 150, 25);
    add(labelcountry);

    JLabel Ibladdress = new JLabel("Address");
    Ibladdress.setBounds(500, 110, 150, 25);
    add(Ibladdress);

    JLabel labeladdress = new JLabel();
    labeladdress.setBounds(690, 110, 150, 25);
    add(labeladdress);

    JLabel Iblphone = new JLabel("Phone");
    Iblphone.setBounds(500, 170, 150, 25);
    add(Iblphone);

    JLabel labelphone = new JLabel();
    labelphone.setBounds(690, 170, 150, 25);
    add(labelphone);

    JLabel Iblemail = new JLabel("Email");
    Iblemail.setBounds(500, 230, 150, 25);
    add(Iblemail);

    JLabel labelemail = new JLabel();
    labelemail.setBounds(690, 230, 150, 25);
    add(labelemail);

    back = new JButton("Delete");
    back.setBackground(Color.black);
    back.setBounds(350, 350, 100, 25);
    back.setForeground(Color.white);
    back.addActionListener(this);
    add(back);

   ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
   Image i2 = i1.getImage().getScaledInstance(600, 200, Image.SCALE_DEFAULT);
   ImageIcon i3 = new ImageIcon(i2);
   JLabel image = new JLabel(i3);
   image.setBounds(20,400,600,200);
   add(image);
   
      ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
   Image i5 = i4.getImage().getScaledInstance(600, 200, Image.SCALE_DEFAULT);
   ImageIcon i6 = new ImageIcon(i5);
   JLabel image2 = new JLabel(i6);
   image2.setBounds(600,400,600,200);
   add(image2);
   
   try{
       Conn conn = new Conn();
       String query = "select * from  customer where username = '"+username+"'";
       
     ResultSet rs =   conn.s.executeQuery(query);
       while(rs.next()){
            labelusername.setText(rs.getString("username"));
             labelid.setText(rs.getString("Id"));
             labelnumber.setText(rs.getString("Number"));
             labelname.setText(rs.getString("Name"));
             labelgender.setText(rs.getString("Gender"));
             labelcountry.setText(rs.getString("Country"));
             labeladdress.setText(rs.getString("Address"));
             labelphone.setText(rs.getString("Phone"));
             labelemail.setText(rs.getString("Email"));
        
       }
   }catch(Exception e){
    //   e.getStackTrace();
   }

    setVisible(true);

  }
  
 public void actionPerformed(ActionEvent ae){
     try{
         Conn c = new Conn();
          c.s.executeUpdate("DELETE FROM account WHERE username='" + username + "'");
                c.s.executeUpdate("DELETE FROM customer WHERE username='" + username + "'");
                c.s.executeUpdate("DELETE FROM bookpackage WHERE username='" + username + "'");
                c.s.executeUpdate("DELETE FROM bookhotel WHERE username='" + username + "'");
               
               JOptionPane.showMessageDialog(null, "Data Delete Sucessfuly");
               System.exit(0);
     }catch(Exception e){
         e.printStackTrace();
     }
 }

  public static void main(String[] args) {
    new DeleteDetails("Roshani");
  }
}
