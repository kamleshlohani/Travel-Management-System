
package travel.management;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.border.LineBorder;
public class BookHotel extends JFrame implements ActionListener{
    Choice chot,cac,cfood;
    JTextField tfper,tfday,tfac;
    String username;
    JLabel lbu,lbsid,lbsph,lbsamt,lbsnum;
    JButton Check,Book,Back;
    
    
    BookHotel(String username){
      this.username=username;
        setBounds(350,200,1100,600);
        setLayout(null);
        getContentPane().setBackground(Color.yellow);
        
     JLabel text=new JLabel("BOOK Hotel");
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
        
         JLabel lbsel=new JLabel("Select Hotel");
        lbsel.setBounds(40,110,150,20);
        lbsel.setFont(new Font("CALIBRI",Font.BOLD,18));
        add(lbsel);
        
        chot=new Choice();
        
        chot.setBounds(250,110,200,20);
        add(chot);
        
        try{
            conn c=new conn();
            ResultSet rs=c.s.executeQuery("select * from hotel");
            while(rs.next()){
                chot.add(rs.getString("username"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    
        //num
         JLabel lbuper=new JLabel("Total persons");
        lbuper.setBounds(40,150,150,25);
        lbuper.setFont(new Font("CALIBRI",Font.BOLD,18));
        add(lbuper);
        
        tfper=new JTextField("1");
        tfper.setBounds(250,150,200,25);
        add(tfper);
        
        //no of days
        
         JLabel lbday=new JLabel("Numbers of days");
        lbday.setBounds(40,190,150,25);
        lbday.setFont(new Font("CALIBRI",Font.BOLD,18));
        add(lbday);
        
        
        tfday=new JTextField("1");
        tfday.setBounds(250,190,200,25);
        add(tfday);
        
        //AC/NON -AC
        
         JLabel lbac=new JLabel("Select your preference");
        lbac.setBounds(40,230,190,25);
        lbac.setFont(new Font("CALIBRI",Font.BOLD,18));
        add(lbac);
        
        cac=new Choice();
        cac.add("AC");
        cac.add("Non-AC");
        cac.setBounds(250,230,200,20);
        add(cac);
        
        //food included or not
         JLabel lbfood=new JLabel("Food Included");
        lbfood.setBounds(40,270,150,25);
        lbfood.setFont(new Font("CALIBRI",Font.BOLD,18));
        add(lbfood);
        
        cfood=new Choice();
        cfood.add("Yes");
        cfood.add("No");
        cfood.setBounds(250,270,200,20);
        add(cfood);
        
        //name
         JLabel lbid=new JLabel("Id");
        lbid.setBounds(40,310,150,20);
        lbid.setFont(new Font("CALIBRI",Font.BOLD,18));
        add(lbid);
        
         lbsid=new JLabel();
        lbsid.setBounds(250,310,200,25);
        add(lbsid); 
        
        
        //number
         JLabel lbnum=new JLabel("Number");
        lbnum.setBounds(40,350,150,25);
        lbnum.setFont(new Font("CALIBRI",Font.BOLD,18));
        add(lbnum);
        
         lbsnum=new JLabel();
        lbsnum.setBounds(250,350,150,25);
        add(lbsnum); 
        
        
        //next-column starts
        //country
         JLabel lbph=new JLabel("Phone");
        lbph.setBounds(40,390,150,20);
        lbph.setFont(new Font("CALIBRI",Font.BOLD,18));
        add(lbph);
        
         lbsph=new JLabel();
        lbsph.setBounds(250,390,200,25);
        add(lbsph); 
        
          //address
         JLabel lbamt=new JLabel("Total Amount ");
        lbamt.setBounds(40,430,150,25);
        lbamt.setFont(new Font("CALIBRI",Font.BOLD,18));
        add(lbamt);
        
         lbsamt=new JLabel();
        lbsamt.setBounds(250,430,150,25);
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
                   
                   //debug
//                   lbsamt.setText(rs.getString("amount"));
                   
                       
                    
                }
            }catch(Exception e){
                e.printStackTrace();
            }
            
            
            //making button
            
             Check=new JButton("Check Amount");
    Check.setBounds(60,490,120,25);
    Check.setBackground(new Color(133,193,233));
    Check.setForeground(Color.WHITE);
    Check.setBorder(new LineBorder(new Color(133,193,233)));
    Check.addActionListener(this);

    add(Check);
    

    Book=new JButton("Book Hotel");
    Book.setBounds(200,490,120,25);
    Book.setBackground(new Color(133,193,233));
    Book.setForeground(Color.WHITE);
    Book.setBorder(new LineBorder(new Color(133,193,233)));
    Book.addActionListener(this);

    add(Book);
    
    
    Back=new JButton("Close");
    Back.setBounds(340,490,120,25);
    Back.setBackground(new Color(133,193,233));
    Back.setForeground(Color.WHITE);
    Back.setBorder(new LineBorder(new Color(133,193,233)));
    Back.addActionListener(this);

    add(Back);
    //yha tk kr diya hai-11:49
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
        Image i2=i1.getImage().getScaledInstance(600,300,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(500,50,600,300);
        add(image);
    
         
        setVisible(true);   
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==Check){
            try{
            conn c=new conn();
            ResultSet rs=c.s.executeQuery("select * from hotel where username='"+chot.getSelectedItem()+"'");
            
            while(rs.next()){
                int cost=Integer.parseInt(rs.getString("costperperson"));
                int foods=Integer.parseInt(rs.getString("food"));
                int ac=Integer.parseInt(rs.getString("acroom"));
                
                int person=Integer.parseInt(tfper.getText());
                int days=Integer.parseInt(tfday.getText());
                
                String pref=cac.getSelectedItem();
                String foodpref=cfood.getSelectedItem();
                
                if(person *days>0){
                    int t=0;
                    t+=pref.equals("AC")?ac:0;
                    t+=foodpref.equals("Yes")?foods:0;
                    t+=cost;
                    t=t*person*days;
                    lbsamt.setText(String.valueOf(t));
                }else{
                    JOptionPane.showMessageDialog(null,"You have given input which is not valid,try again!!!");
                    
                }


            }
            
            
            }catch(Exception e){
                e.printStackTrace();
            }
            
            //conditons for book
        }else if(ae.getSource()==Book){
            
            try{
                conn c=new conn();
                c.s.executeUpdate("insert into books values('"+lbu.getText()+"','"+chot.getSelectedItem()+"','"+tfper.getText()+"','"+tfday.getText()+"','"+cac.getSelectedItem()+"','"+cfood.getSelectedItem()+"','"+lbsid.getText()+"','"+lbsnum.getText()+"','"+lbsph.getText()+"','"+lbsamt.getText()+"')");
                
                
                JOptionPane.showMessageDialog(null,"Congratulations!!.  Hotel is booked Succeessfully.");
                setVisible(false);
            }catch(Exception e){
            e.printStackTrace();
               }
            
        }else{
            setVisible(false);
        }
    }
        
    
    public static void main(String[]args){
        new BookHotel("Finalproject@23");
    }
}
