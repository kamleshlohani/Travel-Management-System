
package travel.management;

import javax.swing.*;

import java.awt.*;


public  class Splash extends JFrame implements Runnable{
    Thread thread;
     
    //making frame
    Splash(){
        
//        setSize(1300,700);
//        setLocation(200,100);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
        Image i=i1.getImage().getScaledInstance(1200,600,Image.SCALE_DEFAULT);
        JLabel img=new JLabel(i1);
        add(img);

        thread =new Thread(this);
        thread.start();//use to run method;
        
    }
    public void run() {
        
        try{
            Thread.sleep(7000);
            new Login();
            setVisible(false);
            
        }catch(Exception e){
            
        }
    }
    public static void main(String[]args){
       Splash frame= new Splash();
       int x=1;
       
       for(int i=1;i<=500;x+=7,i+=6){
        frame.setLocation(750-(x+i)/2,400-(i/2));
        frame.setSize(x+i,i);
        try{
            Thread.sleep(90);
        }catch(Exception e){
            
        }
        
        
    }
    }

    
    
}
