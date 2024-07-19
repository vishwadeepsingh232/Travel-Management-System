
package tervel.management.system;
import java.util.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
public class Loading extends JFrame implements Runnable{
    Thread t;
    JProgressBar bar;
    String username;
    
    public void run(){
        try{
            for(int i = 1; i<=101; i++){
             int max = bar.getMaximum();
             int value = bar.getValue();
             if(value<max){
                 bar.setValue(bar.getValue() +1);
                 
             }else{
                 setVisible(false);
                 new Dashboard(username);
             }
             Thread.sleep(50);
            }
        }catch(Exception e){
           e.printStackTrace();
        }
    }
   Loading( String username){
       this.username = username;
       t = new Thread(this);
       setBounds(500,200,650,400);
       getContentPane().setBackground(Color.white);
       
       setLayout(null);
       JLabel text = new JLabel("Travel and Tourism Appplication ");
       text.setBounds(50,20,600,40);
       text.setForeground(Color.blue);
       text. setFont(new Font("Releway",Font.BOLD,35));
       add(text);
       
      bar = new JProgressBar();
       bar.setBounds(150,100,300,35);
       bar.setStringPainted(true);
       add(bar);
       
       
       
        JLabel loading = new JLabel("Loading please...");
       loading.setBounds(230,130,150,30);
       loading.setForeground(Color.red);
       loading. setFont(new Font("Releway",Font.BOLD,16));
       add(loading);
       
       
        JLabel lblusername = new JLabel("Welcom "+username);
       lblusername.setBounds(20,310,400,40);
       lblusername.setForeground(Color.blue);
       lblusername.setFont(new Font("Releway",Font.BOLD,16));
       add(lblusername);
       
       t.start();
           
       
       setVisible(true);
   }
    
    public static void main(String args[]){
        new Loading("");
    }
}
