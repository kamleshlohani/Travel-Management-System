
package travel.management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Delete extends JFrame implements ActionListener {
    String username;
    Delete(String username){
                this.username=username;

                JButton delete;

        setBounds(450,180,870,625);
        getContentPane().setBackground(new Color(255,207,71));
        setLayout(null);
        
        JLabel lbus=new JLabel("username");
        lbus.setBounds(30,50,150,25);
        add(lbus);
        
        JLabel lbu=new JLabel();
        lbu.setBounds(220,50,150,25);
        add(lbu); 
        
        //id
        
         JLabel lbid=new JLabel("Id");
        lbid.setBounds(30,110,150,25);
        add(lbid);
        
        JLabel lbsid=new JLabel();
        lbsid.setBounds(220,110,150,25);
        add(lbsid); 
        
        //num
         JLabel lbunum=new JLabel("number");
        lbunum.setBounds(30,170,150,25);
        add(lbunum);
        
        JLabel lbsnum=new JLabel();
        lbsnum.setBounds(220,170,150,25);
        add(lbsnum); 
        
        
        //name
         JLabel lbname=new JLabel("name");
        lbname.setBounds(30,230,150,25);
        add(lbname);
        
        JLabel lbsname=new JLabel();
        lbsname.setBounds(220,230,150,25);
        add(lbsname); 
        
        
        //gender
         JLabel lbgen=new JLabel("gender");
        lbgen.setBounds(30,290,150,25);
        add(lbgen);
        
        JLabel lbsgen=new JLabel();
        lbsgen.setBounds(220,290,150,25);
        add(lbsgen); 
        
        
        //next-column starts
        //country
         JLabel lbc=new JLabel("country");
        lbc.setBounds(500,50,150,25);
        add(lbc);
        
        JLabel lbsc=new JLabel();
        lbsc.setBounds(690,50,150,25);
        add(lbsc); 
        
          //address
         JLabel lbadd=new JLabel("address");
        lbadd.setBounds(500,110,150,25);
        add(lbadd);
        
        JLabel lbsadd=new JLabel();
        lbsadd.setBounds(690,110,150,25);
        add(lbsadd); 
        
          //phone
         JLabel lbph=new JLabel("contactnumber");
        lbph.setBounds(500,170,150,25);
        add(lbph);
        
        JLabel lbsph=new JLabel();
        lbsph.setBounds(690,170,150,25);
        add(lbsph); 
        
          //E-mail
         JLabel lbem=new JLabel("Email ");
        lbem.setBounds(500,230,150,25);
        add(lbem);
        
        JLabel lbsem=new JLabel();
        lbsem.setBounds(690,230,150,25);
        add(lbsem); 
        
        //button-back
        
        delete=new JButton("Delete");
        delete.setBackground(Color.WHITE);
        delete.setForeground(Color.BLACK);
        delete.setBounds(350,350,100,25);
        delete.addActionListener(this);
        add(delete);
        
        
        //Image+1
                ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
                Image i2=i1.getImage().getScaledInstance(600,200,Image.SCALE_DEFAULT);
                ImageIcon i3=new ImageIcon(i2);
                JLabel img=new JLabel(i3);
                img.setBounds(0,400,600,200);
                add(img);
        
             ImageIcon i5=new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
                Image i6=i5.getImage().getScaledInstance(600,200,Image.SCALE_DEFAULT);
                ImageIcon i7=new ImageIcon(i6);
                JLabel img2=new JLabel(i7);
                img2.setBounds(600,400,600,200);
                add(img2);

               //DATA -FETCHING STARTS
               
               
            try{
                conn c=new conn();
                String query="select * from customs where username='"+username+"'";
                ResultSet rs=c.s.executeQuery(query);
                
                while(rs.next()){
                    lbu.setText(rs.getString("username"));
                    lbsid.setText(rs.getString("Id"));
                    lbsnum.setText(rs.getString("number"));
                    lbsname.setText(rs.getString("name"));
                    lbus.setText(rs.getString("username"));
                    lbsgen.setText(rs.getString("gender"));
                    lbsadd.setText(rs.getString("address"));
                    lbsph.setText(rs.getString("contactnumber"));
                    lbsem.setText(rs.getString("Email"));
                    lbsc.setText(rs.getString("country"));
 
                       
                    
                }
            }catch(Exception e){
                e.printStackTrace();
            }


        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        try{
            conn c=new conn();
            c.s.executeUpdate("delete from account where username='"+username+"'");
            c.s.executeUpdate("delete from customs where username='"+username+"'");
            c.s.executeUpdate("delete from package where username='"+username+"'");
            c.s.executeUpdate("delete from hotel where username='"+username+"'");
            c.s.executeUpdate("delete from books where username='"+username+"'");

            JOptionPane.showMessageDialog(null, "Data Deleted Successfully");
            System.exit(0);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void main(String[]args){
        new Delete("Kamal");
    }
    
}
