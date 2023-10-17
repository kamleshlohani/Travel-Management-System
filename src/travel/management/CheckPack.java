
package travel.management;

import javax.swing.*;
import java.awt.*;
public class CheckPack extends JFrame{
    CheckPack(){
        setBounds(450,200,900,600);
        
      String[] package1 = {"GOLD PACKAGE","6 days and 7 Nights", "Airport Assistance at Aiport", "Half Day City Tour", "Welcome drinks on Arrival", "Daily Buffet", "Full Day 3 Island Cruise", "English Speaking Guide", "BOOK NOW", "Summer Special", "Rs 12000 only","package1.jpg"};
      String[] package2 = {"SILVER PACKAGE","4 days and 3 Nights", "Toll Free and Entrance Free Tickets", "Meet and Greet at Aiport", "Welcome drinks on Arrival", "Night Safari", "Full Day 3 Island Cruise", "Cruise with Dinner", "BOOK NOW", "Winter Special", "Rs 25000 only","package2.jpg"};
      String[] package3 = {"BRONZE PACKAGE","6 days and 5 Nights", "Return Airfare", "Free Clubbing, Horse Riding & other Games", "Welcome drinks on Arrival", "Daily Buffet", "Stay in 5 Star Hotel", "BBQ Dinner", "BOOK NOW", "Winter Special", "Rs 32000 only","package3.jpg"};


        JTabbedPane tab=new JTabbedPane();
        
        JPanel p1=createPackage(package1);
        tab.addTab("Package 1",null,p1);
    
    
    JPanel p2=createPackage(package2);
    tab.addTab("Package 2",null,p2);
    
    JPanel p3=createPackage(package3);
    tab.addTab("Package 3",null,p3);
    add(tab);
    
  
        setVisible(true);
    }
    
    
        
    public JPanel createPackage(String []pack){
         JPanel p1=new JPanel();
          
        p1.setLayout(null);
        p1.setBackground(Color.pink);

        //GOLD pacakge
        JLabel m1=new JLabel(pack[0]);
        m1.setBounds(50,5,300,30);
        m1.setForeground(Color.YELLOW);
        m1.setFont(new Font("Tahoma",Font.BOLD,30));
        p1.add(m1);
        
        
        JLabel m2=new JLabel(pack[1]);
        m2.setBounds(30,60,300,30);
        m2.setForeground(Color.WHITE);
        m2.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(m2);
        
         JLabel m3=new JLabel(pack[2]);
        m3.setBounds(30,110,300,30);
        m3.setForeground(Color.WHITE);
        m3.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(m3);
      
        
         JLabel m4=new JLabel(pack[3]);
        m4.setBounds(30,160,300,30);
        m4.setForeground(Color.WHITE);
        m4.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(m4);
        
         JLabel m5=new JLabel(pack[4]);
        m5.setBounds(30,210,300,30);
        m5.setForeground(Color.WHITE);
        m5.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(m5);
        
         JLabel m6=new JLabel(pack[5]);
        m6.setBounds(30,260,400,30);
        m6.setForeground(Color.WHITE);
        m6.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(m6);
        
        
         JLabel m7=new JLabel(pack[6]);
        m7.setBounds(30,310,400,30);
        m7.setForeground(Color.WHITE);
        m7.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(m7);
//        tab.addTab("Package-1",null,p1);
//        add(tab);
        
         JLabel m8=new JLabel(pack[7]);
        m8.setBounds(30,370,400,30);
        m8.setForeground(Color.WHITE);
        m8.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(m8);
        
         JLabel m9=new JLabel(pack[8]);
        m9.setBounds(100,430,300,30);
        m9.setForeground(Color.BLACK);
        m9.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(m9);
        
         JLabel m10=new JLabel(pack[9]);
        m10.setBounds(100,480,300,30);
        m10.setForeground(Color.BLACK);
        m10.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(m10);
        
         JLabel m11=new JLabel(pack[10]);
        m11.setBounds(500,480,300,30);
        m11.setForeground(Color.WHITE);
        m11.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(m11); 
        
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/"+pack[11]));
        Image i2=i1.getImage().getScaledInstance(500,300,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(350,20,500,300);
        p1.add(image);
        return p1;
    }
    
    public static void main(String[]args){
        new CheckPack();
    }
}
