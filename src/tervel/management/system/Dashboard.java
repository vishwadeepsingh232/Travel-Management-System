
package tervel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.font.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener {
    String username;
    JButton   viewPersonalDetails, addPersonalDetails,updatePersonalDetails ,checkpackage,bookpackage,viewpackage, viewhotels,destination ,bookhotel,viewbookhotel,payment
            ,calculator, notepad,about,deletePersonalDetails;
    Dashboard(String username) {
        this.username = username;
        // setBounds(0,0,1600,1000);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0, 0, 102));
        p1.setBounds(0, 0, 2000, 65);
        add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5, 0, 70, 70);
        p1.add(icon);

        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(80, 10, 300, 40);
        heading.setForeground(Color.white);
        heading.setFont(new Font("Tahome", Font.BOLD, 30));
        p1.add(heading);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0, 0, 102));
        p2.setBounds(0, 65, 300, 1000);
        add(p2);

        //
         addPersonalDetails = new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0, 0, 300, 50);
        addPersonalDetails.setBackground(new Color(0, 0, 102));
        addPersonalDetails.setForeground(Color.white);
        addPersonalDetails.setFont(new Font("Tahoma", Font.BOLD, 20));
        addPersonalDetails.setMargin(new Insets(0, 0, 0, 60));
         addPersonalDetails.addActionListener(this);

        p2.add(addPersonalDetails);

        updatePersonalDetails = new JButton("Update Personal Details");
        updatePersonalDetails.setBounds(0, 50, 300, 50);
        updatePersonalDetails.setBackground(new Color(0, 0, 102));
        updatePersonalDetails.setForeground(Color.white);
        updatePersonalDetails.setFont(new Font("Tahoma", Font.BOLD, 20));
        updatePersonalDetails.setMargin(new Insets(0, 0, 0, 30));
        updatePersonalDetails.addActionListener(this);

        p2.add(updatePersonalDetails);

        viewPersonalDetails = new JButton("View Details");
        viewPersonalDetails.setBounds(0, 100, 300, 50);
        viewPersonalDetails.setBackground(new Color(0, 0, 102));
        viewPersonalDetails.setForeground(Color.white);
        viewPersonalDetails.setFont(new Font("Tahoma", Font.BOLD, 20));
        viewPersonalDetails.setMargin(new Insets(0, 0, 0, 40));
          viewPersonalDetails.addActionListener(this);

        p2.add(viewPersonalDetails);

         deletePersonalDetails = new JButton("Delete Personal Details");
        deletePersonalDetails.setBounds(0, 200, 300, 50);
        deletePersonalDetails.setBackground(new Color(0, 0, 102));
        deletePersonalDetails.setForeground(Color.white);
        deletePersonalDetails.setFont(new Font("Tahoma", Font.BOLD, 20));
        deletePersonalDetails.setMargin(new Insets(0, 0, 0, 40));
        deletePersonalDetails.addActionListener(this);
        p2.add(deletePersonalDetails);

         checkpackage = new JButton("Check Package");
        checkpackage.setBounds(0, 150, 300, 50);
        checkpackage.setBackground(new Color(0, 0, 102));
        checkpackage.setForeground(Color.white);
        checkpackage.setFont(new Font("Tahoma", Font.BOLD, 20));
        checkpackage.setMargin(new Insets(0, 0, 0, 40));
        checkpackage.addActionListener(this);
        p2.add(checkpackage);

       bookpackage = new JButton("Book Package");
        bookpackage.setBounds(0, 250, 300, 50);
        bookpackage.setBackground(new Color(0, 0, 102));
        bookpackage.setForeground(Color.white);
        bookpackage.setFont(new Font("Tahoma", Font.BOLD, 20));
        bookpackage.setMargin(new Insets(0, 0, 0, 40));
         bookpackage.addActionListener(this);
        p2.add(bookpackage);

         viewpackage = new JButton("View Package Details");
        viewpackage.setBounds(0, 300, 300, 50);
        viewpackage.setBackground(new Color(0, 0, 102));
        viewpackage.setForeground(Color.white);
        viewpackage.setFont(new Font("Tahoma", Font.BOLD, 20));
        viewpackage.setMargin(new Insets(0, 0, 0, 40));
        viewpackage.addActionListener(this);
        p2.add(viewpackage);

         viewhotels = new JButton("View Hotels");
        viewhotels.setBounds(0, 350, 300, 50);
        viewhotels.setBackground(new Color(0, 0, 102));
        viewhotels.setForeground(Color.white);
        viewhotels.setFont(new Font("Tahoma", Font.BOLD, 20));
        viewhotels.setMargin(new Insets(0, 0, 0, 40));
        viewhotels.addActionListener(this);
        p2.add(viewhotels);

         bookhotel = new JButton("Book Hotels");
        bookhotel.setBounds(0, 400, 300, 50);
        bookhotel.setBackground(new Color(0, 0, 102));
        bookhotel.setForeground(Color.white);
        bookhotel.setFont(new Font("Tahoma", Font.BOLD, 20));
        bookhotel.setMargin(new Insets(0, 0, 0, 40));
        bookhotel.addActionListener(this);
        p2.add(bookhotel);

         viewbookhotel = new JButton("View Booked Hotels");
        viewbookhotel.setBounds(0, 450, 300, 50);
        viewbookhotel.setBackground(new Color(0, 0, 102));
        viewbookhotel.setForeground(Color.white);
        viewbookhotel.setFont(new Font("Tahoma", Font.BOLD, 20));
        viewbookhotel.setMargin(new Insets(0, 0, 0, 40));
        viewbookhotel.addActionListener(this);
        p2.add(viewbookhotel);


         destination = new JButton("Destination");
        destination.setBounds(0, 500, 300, 50);
        destination.setBackground(new Color(0, 0, 102));
        destination.setForeground(Color.white);
        destination.setFont(new Font("Tahoma", Font.BOLD, 20));
        destination.setMargin(new Insets(0, 0, 0, 40));
        destination.addActionListener(this);
        p2.add(destination);

       payment = new JButton("Payment");
        payment.setBounds(0, 550, 300, 50);
        payment.setBackground(new Color(0, 0, 102));
        payment.setForeground(Color.white);
        payment.setFont(new Font("Tahoma", Font.BOLD, 20));
        payment.setMargin(new Insets(0, 0, 0, 40));
        payment.addActionListener(this);
        p2.add(payment);

         calculator = new JButton("Calculator");
        calculator.setBounds(0, 600, 300, 50);
        calculator.setBackground(new Color(0, 0, 102));
        calculator.setForeground(Color.white);
        calculator.setFont(new Font("Tahoma", Font.BOLD, 20));
        calculator.setMargin(new Insets(0, 0, 0, 40));
        calculator.addActionListener(this);
        p2.add(calculator);

         notepad = new JButton("Notepad");
        notepad.setBounds(0, 650, 300, 50);
        notepad.setBackground(new Color(0, 0, 102));
        notepad.setForeground(Color.white);
        notepad.setFont(new Font("Tahoma", Font.BOLD, 20));
        notepad.setMargin(new Insets(0, 0, 0, 40));
         notepad.addActionListener(this);
        p2.add(notepad);

         about = new JButton("About");
        about.setBounds(0, 700, 300, 50);
        about.setBackground(new Color(0, 0, 102));
        about.setForeground(Color.white);
        about.setFont(new Font("Tahoma", Font.BOLD, 20));
        about.setMargin(new Insets(0, 0, 0, 40));
        about.addActionListener(this);
        p2.add(about);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0,0,2200,1100);
        add(image);

        JLabel text = new JLabel("Travel and Tourism Management System");
        text.setBounds(400,70,1200,70);
        text.setForeground(Color.white);
        text.setFont(new Font("Releway", Font.PLAIN,55));
        image.add(text);


        setVisible(true);
    }

    public void actionPerformed (ActionEvent ae){
        if(ae.getSource()==  addPersonalDetails){
            new AddCustomer(username);
            
        }else if (ae.getSource()== viewPersonalDetails){
            new ViewCustomer(username);
        }else if(ae.getSource()==  updatePersonalDetails){
            new UpdateCustomer(username);
        }else if (ae.getSource()== checkpackage){
            new CheckPackage();
        }else if(ae.getSource()==bookpackage){
            new BookPackage(username);
        }else if(ae.getSource()==viewpackage){
            new ViewPackage(username);
        }else if(ae.getSource()==viewhotels){
           new CheckHotels();
        }
        else if(ae.getSource()==destination){
            new Destinations();
        }else if(ae.getSource() == bookhotel){
            new BookHotel(username);
        }else if(ae.getSource()== viewbookhotel){
            new ViewBookedHotel(username);
        }else if(ae.getSource()==payment){
            new Payment();
        }else if(ae.getSource()== calculator){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource()==notepad){
             try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource()==about){
            new About();
        }else if(ae.getSource()==deletePersonalDetails){
            new DeleteDetails(username);
        }
    }
        
    public static void main(String args[]) {
        new Dashboard("");
    }
}
