   
package travel.management;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;

public class Updatecustomer extends JFrame implements ActionListener{
    JLabel lbus,lbn,lblname;
    JComboBox com;
    JTextField tfnum,tfcont,tfadd,tfeml,tfcon,tfids,tfgens;
//    JRadioButton rmale,rfemale;
    JButton add,back;
    Updatecustomer( String username){
        setBounds(500,200,850,550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        
 
        //update customer details(TEXT)
        JLabel text=new JLabel("Update Customer Details");
        text.setBounds(50,0,300,25);
        text.setFont(new Font("Tahoma",Font.BOLD,20));
        add(text);
        //LABEL
        JLabel lbu=new JLabel("Username");
        lbu.setBounds(30,50,150,25);
        add(lbu);
        
        //label -will fetch answer from db
        lbus=new JLabel();
        lbus.setBounds(220,50,150,25);
        add(lbus);
        
         JLabel lbid=new JLabel("Id");
        lbid.setBounds(30,90,150,25);
        add(lbid);
        
       tfids=new JTextField();
        tfids.setBounds(220,90,150,25);
        add(tfids);

        
        
        //number
        
        JLabel lbnum=new JLabel("Number");
        lbnum.setBounds(30,130,150,25);
        add(lbnum);
        
        tfnum=new JTextField();
        tfnum.setBounds(220,130,150,25);
        add(tfnum);
    
        //label-name
        JLabel lbn=new JLabel("Name");
        lbn.setBounds(30,170,150,25);
        add(lbn);
        
       
        lblname=new JLabel();
        lblname.setBounds(220,170,150,25);
        add(lblname);
        
        
        //label-gender
        JLabel lblgender=new JLabel("Gender");
        lblgender.setBounds(30,210,150,25);
        add(lblgender);
        
        
        tfgens=new JTextField();
        tfgens.setBounds(220,210,150,25);
        add(tfgens);

        
         //country
        
        JLabel lbcont=new JLabel("Country");
        lbcont.setBounds(30,250,150,25);
        add(lbcont);
        
        tfcont=new JTextField();
        tfcont.setBounds(220,250,150,25);
        add(tfcont);
        
        
         //address
        
        JLabel lbladdrs=new JLabel("Address");
        lbladdrs.setBounds(30,290,150,25);
        add(lbladdrs);
        
        tfadd=new JTextField();
        tfadd.setBounds(220,290,150,25);
        add(tfadd);
        
          //email
        
        JLabel lblemail=new JLabel("Email");
        lblemail.setBounds(30,330,150,25);
        add(lblemail);
        
        tfeml=new JTextField();
        tfeml.setBounds(220,330,150,25);
        add(tfeml);
        
          //contact number
        
        JLabel lblcon=new JLabel("Contact number");
        lblcon.setBounds(30,370,150,25);
        add(lblcon);
        
        tfcon=new JTextField();
        tfcon.setBounds(220,370,150,25);
        add(tfcon);
        
        //button-1
        add=new JButton("Update");
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.setBounds(70,430,100,25);
        add.addActionListener(this);
        add(add);
        
        
        //button-2
        
        back=new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(220,430,100,25);
        back.addActionListener(this);
        add(back);
        
        
        //Imaage1
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/update.png "));
        Image i2=i1.getImage().getScaledInstance(400,300,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(400,100,450,300);
        add(image);
        
        try{
            conn c=new conn();
            ResultSet rs=c.s.executeQuery("select * from customs where username='"+username+"'");
            while(rs.next()){
                
                //data-fetching from db
                lbus.setText(rs.getString("username"));
                lblname.setText(rs.getString("name"));
                tfids.setText(rs.getString("Id"));
                 tfnum.setText(rs.getString("number"));
                  tfgens.setText(rs.getString("gender"));
                   tfcont.setText(rs.getString("country"));
                    tfadd.setText(rs.getString("address"));
                     tfcon.setText(rs.getString("contactnumber"));
                      tfeml.setText(rs.getString("Email"));
                   
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        setVisible(true);
    }

   
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==add){
           String username=lbus.getText();
           String Id= tfids.getText();
           String number=tfnum.getText();
           String name=lblname.getText();
           String gender=tfgens.getText();
           String country=tfcont.getText();
           String address=tfadd.getText();
           String Email=tfeml.getText();
           String contactnumber=tfcon.getText();
        
        try{
            conn c=new conn();
            String query="update  customs  set username='"+username+"',number='"+number+"',Id='"+Id+"',gender='"+gender+"',name='"+name+"',address='"+address+"',country='"+country+"',contactnumber='"+contactnumber+"',Email='"+Email+"'";
            c.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Your details have been successfully updated");
            setVisible(false);
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Details of customer have been uploaded successsfully");
            setVisible(false); 
        }

        }else{
            setVisible(false);
        }
    }
     public static void main(String[]args){
        
        new Updatecustomer("Kamal");
    }
    
}
    
   

 
