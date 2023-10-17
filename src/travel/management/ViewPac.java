
package travel.management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class ViewPac extends JFrame implements ActionListener {
    ViewPac(String username){
                JButton back;

        setBounds(450,200,900,450);
        getContentPane().setBackground(new Color(255,207,71));
        setLayout(null);
        
        JLabel text=new JLabel("View Package Details");
        text.setFont(new Font("Sans-serif",Font.BOLD,20));
        text.setBounds(60,0,300,20);
        add(text);
        
        
        JLabel lbus=new JLabel("username");
        lbus.setBounds(30,50,150,25);
        add(lbus);
        
        JLabel lbu=new JLabel();
        lbu.setBounds(220,50,150,25);
        add(lbu); 
        
        //package
        
         JLabel lbpac=new JLabel("Package");
        lbpac.setBounds(30,90,150,25);
        add(lbpac);
        
        JLabel lbspac=new JLabel();
        lbspac.setBounds(220,90,150,25);
        add(lbspac); 
        
        //persons
         JLabel lbper=new JLabel("Number of persons");
        lbper.setBounds(30,130,150,25);
        add(lbper);
        
        JLabel lbsper=new JLabel();
        lbsper.setBounds(220,130,150,25);
        add(lbsper); 
        
        
        //id
         JLabel lbid=new JLabel("Id");
        lbid.setBounds(30,170,150,25);
        add(lbid);
        
        JLabel lbsid=new JLabel();
        lbsid.setBounds(220,170,150,25);
        add(lbsid); 
        
        
        //number
         JLabel lbnum=new JLabel("Number");
        lbnum.setBounds(30,210,150,25);
        add(lbnum);
        
        JLabel lbsnum=new JLabel();
        lbsnum.setBounds(220,210,150,25);
        add(lbsnum); 
        
        

        //phone number
         JLabel lbph=new JLabel("Phone number");
        lbph.setBounds(30,250,150,25);
        add(lbph);
        
        JLabel lbsph=new JLabel();
        lbsph.setBounds(220,250,150,25);
        add(lbsph); 
        
          //amount
         JLabel lbamt=new JLabel("Amount");
        lbamt.setBounds(30,290,150,25);
        add(lbamt);
        
        JLabel lbsamt=new JLabel();
        lbsamt.setBounds(220,290,150,25);
        add(lbsamt); 
        
          
        //button-back
        
        back=new JButton("Back");
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        back.setBounds(130,360,100,25);
        back.addActionListener(this);
        add(back);
        
        
        //Image+1
                ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
                Image i2=i1.getImage().getScaledInstance(500,400,Image.SCALE_DEFAULT);
                ImageIcon i3=new ImageIcon(i2);
                JLabel img=new JLabel(i3);
                img.setBounds(450,20,500,400);
                add(img);

               //DATA -FETCHING STARTS
               
               
            try{
                conn c=new conn();
                String query="select * from package where username='"+username+"'";
                ResultSet rs=c.s.executeQuery(query);
                
                while(rs.next()){
                    lbu.setText(rs.getString("username"));
                    lbspac.setText(rs.getString("package"));
                    lbsper.setText(rs.getString("persons"));
                    lbsid.setText(rs.getString("id"));
                    lbsnum.setText(rs.getString("number"));
                    lbsph.setText(rs.getString("phone"));
                    lbsamt.setText(rs.getString("amount"));
                    
                    
                   
 
                       
                    
                }
            }catch(Exception e){
                
            }


        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
    }
    
    public static void main(String[]args){
        new ViewPac("Kamal");
    }
    
}
