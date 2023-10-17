
package travel.management;
import javax.swing.*;  //jframe
import java.awt.*; //color
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Dashboard extends JFrame implements ActionListener{
    String username;
    JButton view,per,updt,check,book,vie ,hot,dest,bok,buk,pay,cal,note,abot,del;
    Dashboard(String username){
        this.username=username;
        
//        setBounds(0,0,1600,1000);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        //Jpanel
        
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(6,57,112));
        p1.setBounds(0,0,1600,65);
        add(p1);
        
         //Image
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2=i1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel icon=new JLabel(i3);
        icon.setBounds(5,0,70,70);
        p1.add(  icon);
        
        
        //Text-JLabel
        
        JLabel head=new JLabel("Travel Management");
        head.setBounds(80,10,300,40);
        head.setForeground(Color.WHITE);
        head.setFont(new Font("Tahoma",Font.BOLD,25));
        p1.add(head);
        
        //Jpanel-2
        
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBackground( Color.darkGray);
        p2.setBounds(0,65,300,900);
        add(p2);
        
        //button-1
         per=new JButton("Add Personal Details");
        per.setBounds(0,0,300,50);
        per.setBackground(new Color(6,57,112));
        per.setForeground(Color.WHITE);
        per.setFont(new Font ("Tahoma",Font.PLAIN,20));
        per.setMargin(new Insets(0,0,0,60));
        per.addActionListener(this);
        p2.add(per);
        
        //button-2
       
         updt=new JButton("Update Personal Details");
        updt.setBounds(0,50,300,50);
        updt.setBackground(new Color(6,57,112));
        updt.setForeground(Color.WHITE);
        updt.setFont(new Font ("Tahoma",Font.PLAIN,20));
        updt.addActionListener( this);
        updt.setMargin(new Insets(0,0,0,30));
        p2.add(updt);
        
                //button-3
       
         view=new JButton("View Personal Details");
        view.setBounds(0,100,300,50);
        view.setBackground(new Color(6,57,112));
        view.setForeground(Color.WHITE);
        view.setFont(new Font ("Tahoma",Font.PLAIN,20));
        view.setMargin(new Insets(0,0,0,47));
        view.addActionListener( this);
        p2.add(view);
        
        
        
                //button-4
       
         del=new JButton("Delete Personal Details");
        del.setBounds(0,150,300,50);
        del.setBackground(new Color(6,57,112));
        del.setForeground(Color.WHITE);
        del.setFont(new Font ("Tahoma",Font.PLAIN,20));
        del.setMargin(new Insets(0,0,0,35));
        del.addActionListener( this);
        p2.add(del);
        
        //button-5
       
         check=new JButton("Check Pacakages");
        check.setBounds(0,200,300,50);
        check.setBackground(new Color(6,57,112));
        check.setForeground(Color.WHITE);
        check.setFont(new Font ("Tahoma",Font.PLAIN,20));
        check.setMargin(new Insets(0,0,0,92));
        check.addActionListener(this);
        p2.add(check);
        
        //button-6
       
         book=new JButton("Book Pacakages");
        book.setBounds(0,250,300,50);
        book.setBackground(new Color(6,57,112));
        book.setForeground(Color.WHITE);
        book.setFont(new Font ("Tahoma",Font.PLAIN,20));
        book.setMargin(new Insets(0,0,0,94));
        book.addActionListener(this);
        p2.add(book);
        
        
        //button-7
       
         vie=new JButton("View Pacakages");
        vie.setBounds(0,300,300,50);
        vie.setBackground(new Color(6,57,112));
        vie.setForeground(Color.WHITE);
        vie.addActionListener(this);
        vie.setFont(new Font ("Tahoma",Font.PLAIN,20));
        vie.setMargin(new Insets(0,0,0,94));
        p2.add(vie);
        
        
        //button-8
       
         hot=new JButton("View Hotels");
        hot.setBounds(0,350,300,50);
        hot.setBackground(new Color(6,57,112));
        hot.setForeground(Color.WHITE);
        hot.addActionListener(this);
        hot.setFont(new Font ("Tahoma",Font.PLAIN,20));
        hot.setMargin(new Insets(0,0,0,123));
        p2.add(hot);
        
        //button-9
       
         bok=new JButton("Book Hotels");
        bok.setBounds(0,400,300,50);
        bok.setBackground(new Color(6,57,112));
        bok.setForeground(Color.WHITE);
        bok.setFont(new Font ("Tahoma",Font.PLAIN,20));
        bok.addActionListener(this);
        bok.setMargin(new Insets(0,0,0,120));
        p2.add(bok);
        
         //button-10
       
         buk=new JButton(" View Book Hotels");
        buk.setBounds(0,450,300,50);
        buk.setBackground(new Color(6,57,112));
        buk.setForeground(Color.WHITE);
        buk.addActionListener(this);

        buk.setFont(new Font ("Tahoma",Font.PLAIN,20));
        buk.setMargin(new Insets(0,0,0,80));
        p2.add(buk);

        //button-11
       
         dest=new JButton(" Destinations");
        dest.setBounds(0,500,300,50);
        dest.setBackground(new Color(6,57,112));
        dest.setForeground(Color.WHITE);
        dest.setFont(new Font ("Tahoma",Font.PLAIN,20));
        dest.setMargin(new Insets(0,0,0,125));
        dest.addActionListener( this);
        p2.add(dest);
        
        //button-12
       
         pay=new JButton("Payments");
        pay.setBounds(0,550,300,50);
        pay.setBackground(new Color(6,57,112));
        pay.setForeground(Color.WHITE);
        pay.setFont(new Font ("Tahoma",Font.PLAIN,20));
        pay.addActionListener( this);

        pay.setMargin(new Insets(0,0,0,145));
        p2.add(pay);
        
        //button-13
       
         cal=new JButton("Calculator");
        cal.setBounds(0,600,300,50);
        cal.setBackground(new Color(6,57,112));
        cal.setForeground(Color.WHITE);
        cal.addActionListener( this);

        cal.setFont(new Font ("Tahoma",Font.PLAIN,20));
       cal.setMargin(new Insets(0,0,0,140));
        p2.add(cal);
        
        
        //button-14
       
         note=new JButton("Notepad");
        note.setBounds(0,650,300,50);
        note.setBackground(new Color(6,57,112));
        note.setForeground(Color.WHITE);
                note.addActionListener( this);

        note.setFont(new Font ("Tahoma",Font.PLAIN,20));
        note.setMargin(new Insets(0,0,0,155));
        p2.add(note);
        
        
        //button-13
       
        abot=new JButton("About");
        abot.setBounds(0,690,300,50);
        abot.addActionListener( this);

        abot.setBackground(new Color(6,57,112));
        abot.setForeground(Color.WHITE);
        abot.setFont(new Font ("Tahoma",Font.PLAIN,20));
       abot.setMargin(new Insets(0,0,0,175));
        p2.add(abot);
        
        
           //Image-2
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icons/homepage.jpg"));
        Image i5=i4.getImage().getScaledInstance(1650,1000,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel image=new JLabel(i6);
        image.setBounds(0,0,1650,1000);
        add(image);
       // text
       
       JLabel text=new JLabel("Travel and Tourism  ");
       text.setBounds(570,200,1200,70);
       text.setForeground(Color.WHITE);
       text.setFont(new Font("Tahoma",Font.BOLD,65));
       image.add(text);
        setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==per){
            new AddCustomer(username);
        }else if(ae.getSource()==view){
            new Viewcustomer(username);
        }else if(ae.getSource()==updt){
            new Updatecustomer(username);
        }else if(ae.getSource()==check){
            new CheckPack();
        }else if(ae.getSource()==book){
            new BookPack(username);
        }else if(ae.getSource()==vie){
            new ViewPac(username);
        }else if(ae.getSource()==hot){
            new CheckHotel();
        }else if(ae.getSource()==dest){
            new Destination();
        }else if(ae.getSource()==bok){
            new BookHotel(username);
        }else if(ae.getSource()==buk){
            new ViewHotel(username);
        }else if(ae.getSource()==pay){
            new Payment();
        }else if(ae.getSource()==cal){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource()==note){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource()==abot){
            new About();
        }else if(ae.getSource()==del){
            new Delete(username);
        }
    } 
    public static void main(String[] args){
        new Dashboard("");
    }
}
