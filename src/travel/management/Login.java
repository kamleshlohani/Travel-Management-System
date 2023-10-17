
package travel.management;
//import java.awt.Color;
import javax.swing.*;
import java.awt.*;  
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.LineBorder;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    JButton login,Signup,pass;
    JTextField tfpassword,tfusername;
    Login(){
    setSize(900,400);
    setLocation(350,250);
    //not using swing layout :custom layout
    setLayout(null);
    
    getContentPane().setBackground(Color.WHITE);
    
    
    JPanel p1=new JPanel();
    p1.setBackground(new Color(131,193,233));
    
     //for using own layout
    p1.setLayout(null);
    p1.setBounds(0, 0, 400, 400);
    add(p1);
    
    
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
    Image i2=i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
    JLabel image=new JLabel(i3);
    image.setBounds(100,120,200,200);
    p1.add(image);
    setVisible(true);
    
    
    JPanel p2=new JPanel();
    p2.setLayout(null);
    p2.setBounds(400,30,450,300);
    add(p2);
    
    JLabel lblus=new JLabel("Username"
    );
    lblus.setBounds(60,20,100,25);
    lblus.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
    p2.add(lblus);
    
    //TEXT FIELD
    
    tfusername=new JTextField();
    tfusername.setBounds(60,60,300,30);
    tfusername.setBorder(BorderFactory.createEmptyBorder());
    p2.add(tfusername);
    
    
    //same copied from text field
    
    JLabel lpassword=new JLabel("Password"
    );
    lpassword.setBounds(60,110,100,25);
    lpassword.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
    p2.add(lpassword);
    
    //TEXT FIELD
     
    tfpassword=new JTextField();
    tfpassword.setBounds(60,150,300,30);
    tfpassword.setBorder(BorderFactory.createEmptyBorder());
    p2.add(tfpassword);
    
    //button
     login=new JButton("Login");
    login.setBounds(60,200,130,30);
    login.setBackground(new Color(133,193,233));
    login.setForeground(Color.WHITE);
    login.setBorder(new LineBorder(new Color(133,193,233)));
    login.addActionListener(this);
    p2.add(login);
    
    //button-2
    
     
     Signup=new JButton("Signup");
    Signup.setBounds(230,200,130,30);
    Signup.setBackground(new Color(133,193,233));
    Signup.setForeground(Color.WHITE);
    Signup.setBorder(new LineBorder(new Color(133,193,233)));
        Signup.addActionListener(this);

    p2.add(Signup);
    
    
    //button-3
    
     
     pass=new JButton("Forget Password");
    pass.setBounds(130,250,130,30);
    pass.setBackground(new Color(133,193,233));
    pass.setForeground(Color.WHITE);
    pass.setBorder(new LineBorder(new Color(133,193,233)));
        pass.addActionListener(this);

    p2.add(pass);
    
    JLabel text=new JLabel("For troubleshooting");
    text.setBounds(300,250,150,20);
    text.setForeground(Color.RED);
    p2.add(text);
    
    
//    setVisible(true);
    
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==login){
            try{
                String username=tfusername.getText();
                String password=tfpassword.getText();
                String query="select * from account where username='"+username+"' AND password='"+password+"'";
                
                
                conn c=new conn();
                ResultSet rs=c.s.executeQuery(query);
                if(rs.next()){  //either yes or no :value hogi ya nhi hogi :rs.next
                    setVisible(false);
                    new Loading(username);
                }else{
                      JOptionPane.showMessageDialog(null,"Incorrect username or password");
                }
            }catch(Exception e){
                
                e.printStackTrace();
            }
        }else if(ae.getSource()==Signup){
            setVisible(false);
            new Signup();
        }else{
            setVisible(false);
            new forget();
        }
    }
    public static void main(String[]args){
        new Login();
        new Dashboard(" ");
        
        
    }
}
