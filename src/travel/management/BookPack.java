
package travel.management;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.border.LineBorder;
public class BookPack extends JFrame implements ActionListener{
    Choice cpack;
    JTextField tfper;
    String username;
    JLabel lbu,lbsid,lbsph,lbsamt,lbsnum;
    JButton Check,Book,Back;
    BookPack(String username){
      this.username=username;
        setBounds(350,200,1100,500);
        setLayout(null);
        getContentPane().setBackground(Color.YELLOW);
        
     JLabel text=new JLabel("BOOK PACKAGE");
     text.setBounds(100,10,200,30);
     text.setFont(new Font("Tahoma",Font.BOLD,20));
     add(text);
     
     
     
        JLabel lbus=new JLabel("username");
        lbus.setBounds(40,70,100,20);
        lbus.setFont(new Font("CALIBRI",Font.BOLD,18));

        add(lbus);
        
         lbu=new JLabel();
        lbu.setBounds(250,70,100,22);
        add(lbu); 
        
        //id
        
         JLabel lbsel=new JLabel("Select Package");
        lbsel.setBounds(40,110,150,20);
        lbsel.setFont(new Font("CALIBRI",Font.BOLD,18));
        add(lbsel);
        
        cpack=new Choice();
        cpack.add("Gold Package");
        cpack.add("Silver Package");
        cpack.add("Bronze Package");
        cpack.setBounds(250,110,200,20);
        add(cpack);
        
        //num
         JLabel lbuper=new JLabel("Total persons");
        lbuper.setBounds(40,150,150,25);
        lbuper.setFont(new Font("CALIBRI",Font.BOLD,18));
        add(lbuper);
        
        tfper=new JTextField("1");
        tfper.setBounds(250,150,200,25);
        add(tfper);
        
        
        //name
         JLabel lbid=new JLabel("ID");
        lbid.setBounds(40,190,150,20);
        lbid.setFont(new Font("CALIBRI",Font.BOLD,18));
        add(lbid);
        
         lbsid=new JLabel();
        lbsid.setBounds(250,190,200,25);
        add(lbsid); 
        
        
        //number
         JLabel lbnum=new JLabel("Number");
        lbnum.setBounds(40,230,150,25);
        lbnum.setFont(new Font("CALIBRI",Font.BOLD,18));
        add(lbnum);
        
         lbsnum=new JLabel();
        lbsnum.setBounds(250,230,150,25);
        add(lbsnum); 
        
        
        //next-column starts
        //country
         JLabel lbph=new JLabel("Phone");
        lbph.setBounds(40,270,150,20);
        lbph.setFont(new Font("CALIBRI",Font.BOLD,18));
        add(lbph);
        
         lbsph=new JLabel();
        lbsph.setBounds(250,270,200,25);
        add(lbsph); 
        
          //address
         JLabel lbamt=new JLabel("Total Amount ");
        lbamt.setBounds(40,310,150,25);
        lbamt.setFont(new Font("CALIBRI",Font.BOLD,18));
        add(lbamt);
        
         lbsamt=new JLabel();
        lbsamt.setBounds(250,310,150,25);
        add(lbsamt); 
        
          
              
            try{
                conn c=new conn();
                String query="select * from customs where username='"+username+"'";
                ResultSet rs=c.s.executeQuery(query);
                
                while(rs.next()){
                    lbu.setText(rs.getString("username"));
                    lbsid.setText(rs.getString("Id"));
                    lbsnum.setText(rs.getString("number"));
                   lbsph.setText(rs.getString("contactnumber"));
                   
                       
                    
                }
            }catch(Exception e){
                e.printStackTrace();
            }
            
            
            //making button
            
             Check=new JButton("Check Amount");
    Check.setBounds(60,380,120,25);
    Check.setBackground(new Color(133,193,233));
    Check.setForeground(Color.WHITE);
    Check.setBorder(new LineBorder(new Color(133,193,233)));
    Check.addActionListener(this);

    add(Check);
    

    Book=new JButton("Book Amount");
    Book.setBounds(200,380,120,25);
    Book.setBackground(new Color(133,193,233));
    Book.setForeground(Color.WHITE);
    Book.setBorder(new LineBorder(new Color(133,193,233)));
    Book.addActionListener(this);

    add(Book);
    
    
    Back=new JButton("Close");
    Back.setBounds(340,380,120,25);
    Back.setBackground(new Color(133,193,233));
    Back.setForeground(Color.WHITE);
    Back.setBorder(new LineBorder(new Color(133,193,233)));
    Back.addActionListener(this);

    add(Back);
    
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/bookpackage.jpg"));
        Image i2=i1.getImage().getScaledInstance(500,300,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(550,50,500,300);
        add(image);
    
         
        setVisible(true);   
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==Check){
            String Packg=cpack.getSelectedItem();
            int c=0;
            
            if(Packg.equals("Gold Package")){
                c+=12000;
            }else if(Packg.equals("Gold Package")){
                c+=25000;
            }else{
                c+=32000;
            }
            
            int persons=Integer.parseInt(tfper.getText());
            c*=persons;
            lbsamt.setText(c+" "+"Rupees only.");
            
            //conditons for book
        }else if(ae.getSource()==Book){
            
            try{
                conn c=new conn();
                c.s.executeUpdate("insert into package values('"+lbu.getText()+"','"+cpack.getSelectedItem()+"','"+tfper.getText()+"','"+lbsid.getText()+"','"+lbsnum.getText()+"','"+lbsph.getText()+"','"+lbsamt.getText()+"')");
                
                JOptionPane.showMessageDialog(null,"Congratulations!!. Your Package is booked.");
                setVisible(false);
            }catch(Exception e){
            e.printStackTrace();
               }
            
        }else{
            setVisible(false);
        }
    }
        
    
    public static void main(String[]args){
        new BookPack("Kamal");
    }
}
