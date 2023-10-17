   
package travel.management;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;

public class AddCustomer extends JFrame implements ActionListener{
    JLabel lbus,lbn,lblname;
    JComboBox com;
    JTextField tfnum,tfcont,tfadd,tfeml,tfcon;
    JRadioButton rmale,rfemale;
    JButton add,back;
    AddCustomer(String username){
        setBounds(450,200,850,550);
        setLayout(null);
        getContentPane().setBackground(Color.YELLOW);
        
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
        
        //another way of sreating dropdown box:1 IN SIGNUP
        com =new JComboBox(new String[]{"Passport","Adhar card","Pan card","Ration card"});
        com.setBackground(Color.WHITE);
        com.setBounds(220,90,150,25);
        add(com);
        
        
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
        
        
        rmale=new JRadioButton("Male");
        rmale.setBounds(220,210,70,25);
        rmale.setBackground(Color.WHITE);
        add(rmale);
        
        
        rfemale=new JRadioButton("Female");
        rfemale.setBounds(300,210,70,25);
        rfemale.setBackground(Color.WHITE);
        add(rfemale);
        //1select to 2nd deselct
        ButtonGroup bg=new ButtonGroup();
        bg.add(rmale);
        bg.add(rfemale);
        
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
        add=new JButton("Add");
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
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/newcustomer.jpg "));
        Image i2=i1.getImage().getScaledInstance(400,500,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(400,40,450,420);
        add(image);
        
        try{
            conn c=new conn();
            ResultSet rs=c.s.executeQuery("select * from account where username='"+username+"'");
            while(rs.next()){
                lbus.setText(rs.getString("username"));
                lblname.setText(rs.getString("name"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        setVisible(true);
    }

   
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==add){
           String username=lbus.getText();
           String Id=(String) com.getSelectedItem();
           String number=tfnum.getText();
           String name=lblname.getText();
           String gender=null;
           if(rmale.isSelected()){
               gender="Male";
           }else{
               gender="Female";
           }
           
        String country=tfcont.getText();
        String address=tfadd.getText();
        String Email=tfeml.getText();
        String contactnumber=tfcon.getText();
        
        try{
            conn c=new conn();
            String query="insert into customs values('"+username+"','"+number+"','"+Id+"','"+gender+"','"+name+"','"+address+"','"+country+"','"+contactnumber+"','"+Email+"')";
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
        
        new AddCustomer("Finalproject@23");
    }
    
}
    
   

 