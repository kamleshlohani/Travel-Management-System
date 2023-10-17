
package travel.management;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Payment extends JFrame implements ActionListener {
    JButton pay,back;
    Payment(){
        setBounds(500,200,800,600);
        setLayout(null);
        
        
        //photo
          ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/paytm.jpeg"));
          Image i2=i1.getImage().getScaledInstance(800,600,Image.SCALE_DEFAULT);
          ImageIcon i3=new ImageIcon(i2);
          JLabel img=new JLabel(i3);
          img.setBounds(0,0,800,600);
          add(img);
          
          //button-1
          pay=new JButton("Pay");
          pay.setBounds(420,0,80,40);
          pay.addActionListener(this);

          img.add(pay);
                
           //button-2     
           back=new JButton("Back");
           back.setBounds(520,0,80,40);
           back.addActionListener(this);
           img.add(back); 
                
           setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==pay){
          setVisible(false);
          new Paytmo();
        }else{
            setVisible(false);
        }
    }
public static void main(String[]args){
    new Payment();
}    
}
