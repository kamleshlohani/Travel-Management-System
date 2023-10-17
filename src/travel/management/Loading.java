 
package travel.management;
import java.awt.*;
import javax.swing.*;

public class Loading extends JFrame implements Runnable{
     Thread t;
     JProgressBar bar;
     String username;
    
     public void run(){
         try{
             for(int i=1;i<=101;i++){
                 int max=bar.getMaximum();//100  
                 int val=bar.getValue();
               if(val<max){
                   //101<100
                   bar.setValue(bar.getValue()+1);
               }else{
                   setVisible(false);
                   new Dashboard(username);
                        }  
               Thread.sleep(50);
                }
             } catch(Exception e){
                     e.printStackTrace();
                     
         }
     }
    Loading(String username){
        this.username=username;
        t=new Thread(this);
            
        //layout
        setBounds(500,200,650,400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        //text
        JLabel text=new JLabel("Travel and Tourism Application");
        text.setBounds(80,20,600,40);
        text.setForeground(Color.DARK_GRAY);
        text.setFont(new Font("Calibri",Font.BOLD,35));
        add(text);
        
        //progressbar
        bar=new JProgressBar();
        bar.setBounds(150,100,300,35);
        bar.setStringPainted(true);
        add(bar);
        
        //text-2
         JLabel load=new JLabel("Loading,will back to you.");
        load.setBounds(230,130,150,30);
        load.setForeground(Color.BLUE);
        load.setFont(new Font("Calibri body",Font.BOLD,12));
        add(load);
        
        //text-3
        JLabel user=new JLabel("Welcome"+" "+username+ " To our application");
        user.setBounds(20,310,400,40);
        user.setForeground(Color.magenta);
        user.setFont(new Font("Calibri body",Font.BOLD,16));
        add(user);
        
        t.start();
        setVisible(true);
    }
    public static void main(String[]args){
        new Loading("");
    }
}
