
package travel.management;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class Signup extends JFrame implements ActionListener {
    JButton create,back;
    JTextField tfname,tf1name,tfpass,tfans;
    Choice security;
    Signup(){
        setBounds(350,200,900,360);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
         JPanel p1=new JPanel();
         p1.setBackground(new Color(133,193,233));
         p1.setBounds(0,0,500,400);
         p1.setLayout(null);
         add(p1);
         
         //USER NAME
         
         JLabel lbuse=new JLabel("Username");
         lbuse.setFont(new Font("San-serif",Font.BOLD,14));
         lbuse.setBounds(50, 20, 125, 25);
         p1.add(lbuse);
         
          tfname=new JTextField();
         tfname.setBounds(190,20,180,25);
         tfname.setBorder(BorderFactory.createEmptyBorder());
         p1.add(tfname);
         
         //NAME
      
         JLabel lname=new JLabel("Name");
         lname.setFont(new Font("San-serif",Font.BOLD,14));
         lname.setBounds(50, 60, 180, 25);
         p1.add(lname);
         
          tf1name=new JTextField();
         tf1name.setBounds(190,60,180,25);
         tf1name.setBorder(BorderFactory.createEmptyBorder());
         p1.add(tf1name);
         
         //PASSWORD
         
         
          JLabel lb1pass=new JLabel("Password");
         lb1pass.setFont(new Font("San-serif",Font.BOLD,14));
         lb1pass.setBounds(50, 100, 125, 25);
         p1.add(lb1pass);
         
          tfpass=new JTextField();
         tfpass.setBounds(190,100,180,25);
         tfpass.setBorder(BorderFactory.createEmptyBorder());
         p1.add(tfpass);
         
         //SECURITY
         
       JLabel lb1security=new JLabel("Security Question");
         lb1security.setFont(new Font("San-serif",Font.BOLD,14));
         lb1security.setBounds(50, 140, 125, 25);
         p1.add(lb1security);
         
         security=new Choice();
         security.add("Favourite character from the KGF2");
         security.add("Favourite character from Baahubali");
         security.add("Favourite character from the RRR");
         security.setBounds(190,140,180,25);
         
         p1.add(security);
         
         
         //ANSWER-SECURITY
         
         
         JLabel lb1answer=new JLabel("Answer");
         lb1answer.setFont(new Font("San-serif",Font.BOLD,14));
         lb1answer.setBounds(50, 180, 125, 25);
         p1.add(lb1answer);
         
          tfans=new JTextField();
         tfans.setBounds(190,180,180,25);
         tfans.setBorder(BorderFactory.createEmptyBorder());
         p1.add(tfans);
         
         //BUTTON-1(CREATE)
         
          create=new JButton("Create");
         create.setForeground(new Color(133,193,233));
         create.setBackground(Color.WHITE);
         create.setFont(new Font("San Serif",Font.BOLD,14));
         create.setBounds(80,250,100,30);
         create.addActionListener(this);
         p1.add(create);
         
         //BUTTON-2(BACK)
         
         
              back=new JButton("Back");
         back.setForeground(new Color(133,193,233));
         back.setBackground(Color.WHITE);
         back.setFont(new Font("San Serif",Font.BOLD,14));
         back.setBounds(250,250,100,30);
         back.addActionListener(this);
         p1.add(back);
         
         
         //image
         ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
    Image i2=i1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
    JLabel image=new JLabel(i3);
    image.setBounds(580,50,250,250);
    add(image);
    
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent es){
        if(es.getSource()==create){
            String username=tfname.getText();
            String name=tf1name.getText();
            String password=tfpass.getText();
            String question=security.getSelectedItem();
            String answer=tfans.getText();
        
         String query="Insert into account values('"+username+"','"+name+"','"+password+"','"+question+"','"+answer+"')";
         try{
                 conn c=new conn();
         c.s.executeUpdate(query);
         JOptionPane.showMessageDialog(null,"Account created successfully");
         setVisible(false);
         new Login();
         }catch(Exception e){
             e.printStackTrace();
         }
     
        }else if(es.getSource()==back){
            setVisible(false);
            new Login();
        }
            
    }
    
    public static void main(String[] args){
        new Signup();
    }
}

