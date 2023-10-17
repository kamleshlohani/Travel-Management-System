//retreive button shi krna hai
package travel.management;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.*;
public class forget extends JFrame implements ActionListener{
    JTextField tfuser,tfques,tfname,tfans,tfpass;
    JButton search,Find,back;
    forget(){
        setBounds(350,200,850,380);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        //image
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/forgotpassword.jpg"));
        Image i2=i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(580,70,200,200);
        add(image);
        
        //panel
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBounds(30,30,500,280);
        add(p1);
        
        //username
        
        JLabel lbu=new JLabel("Username");
        lbu.setBounds(48,20,100,25);
        lbu.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(lbu);
        setVisible(true);
        
        tfuser=new JTextField();
        tfuser.setBounds(220,20,150,25);
        tfuser.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfuser);
        
        //search button
        
        search =new JButton("Search");
        search.setBackground(Color.GRAY);
        search.setForeground(Color.WHITE);
                search.setBorder(BorderFactory.createEmptyBorder());

        search.setBounds(380,20,100,25);
        search.addActionListener(this);
        p1.add(search);
        
        
        //name
        
       
        JLabel lbn=new JLabel("Name");
        lbn.setBounds(48,60,100,25);
        lbn.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(lbn);
        
        tfname=new JTextField();
        tfname.setBounds(220,60,150,25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname); 
        
        //security
        
        
        JLabel lbques=new JLabel("  Security Question");
        lbques.setBounds(40,100,150,25);
        lbques.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(lbques);
        
        
        tfques=new JTextField();
        tfques.setBounds(220,100,150,25);
        tfques.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfques);
           
        
        //security-answer
        
         JLabel lbans=new JLabel("Security Answer");
        lbans.setBounds(40,140,150,25);
        lbans.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(lbans);
        
        
        tfans=new JTextField();
        tfans.setBounds(220,140,150,25);
        tfans.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfans);
        
        //security abs-button
       
              Find =new JButton("Retrieve");
        Find.setBackground(Color.GRAY);
        Find.setForeground(Color.WHITE);
        Find.setBounds(380,140,100,25);
                Find.setBorder(BorderFactory.createEmptyBorder());
        Find.addActionListener(this);
        p1.add(Find);
             
        
        //password
        
        
         JLabel pass=new JLabel(" Password");
        pass.setBounds(45,180,150,25);
        pass.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(pass);
        
        
        tfpass=new JTextField();
        tfpass.setBounds(220,180,150,25);
        tfpass.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpass);
        
                
                //back-button
                
                
              back =new JButton("Back");
        back.setBackground(Color.GRAY);
     back.setForeground(Color.WHITE);
        back.setBounds(150,230,100,25);
                back.setBorder(BorderFactory.createEmptyBorder());

        p1.add(back);
        back.addActionListener(this);
        setVisible(true);

    
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==search){
            //ddl command using execute query as data is fetching from table 
            //dml cammand using update query as data is being updated to table
            try{
                String query="select * from account where username='"+tfuser.getText()+"'";
                conn c=new conn();
             ResultSet rs=   c.s.executeQuery(query);
             //getstring:method used to find value of the row from db
             //getText=texfield me se val;ue ko nikalna hai to use krta hai
             //setText=texfield me se val;ue ko set hai to use krta hai
             while(rs.next()){
                 tfname.setText(rs.getString("name"));
                 tfques.setText(rs.getString("security"));
             }
                
            }catch(Exception e){
                e.printStackTrace();
            }
    }else if(ae.getSource()==Find){
        
        try{
                String query=" select * from account where answer='"+tfans.getText()+"'AND username='"+tfuser.getText()+"'" ;

                
                conn c=new conn();
             ResultSet rs=   c.s.executeQuery(query);
             //getstring:method used to find value of the row from db
             //getText=texfield me se val;ue ko nikalna hai to use krta hai
             //setText=texfield me se val;ue ko set hai to use krta hai
             while(rs.next()){
                 tfpass.setText(rs.getString("password"));
             }
                
            }catch(Exception e){
                e.printStackTrace();
            }        
    }else{
        setVisible(false);
        new Login();
    }
    
    }  
    public static void main(String[]args){
        new forget();
    }
}
