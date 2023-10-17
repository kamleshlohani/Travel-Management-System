
package travel.management;
import java.util.*;
import javax.swing.*;
import java.awt.*;


public class Destination extends JFrame implements Runnable{
    Thread t1;
    JLabel m1,m2,m3,m4,m5,m6,m7,m8,m9,m10;
     JLabel[]label=new JLabel[]{m1,m2,m3,m4,m5,m6,m7,m8,m9,m10};
     JLabel cap;
     
    @Override
     public void run(){
         String[] text=new String[]{"Taj Hotel","Hyat Hotel","Ressiance hotel","Paradise hotel","Happy Morning Hotel","Babian Hotel","Bandhan Hotel","Royal Hotel","Lohani Hotel","Shree Ram Hotel"};
         
         try{
             
             for(int i=0;i<9;i++){
                 label[i].setVisible(true);
//                 cap.setText(text[i]);
                 Thread.sleep(3000);
                 label[i].setVisible(false);
             }
         }catch(Exception e){
             e.printStackTrace();
         }
     }
    Destination(){
        
        setBounds(500,200,800,600);
        
        cap=new JLabel();
        cap.setBounds(50,500,1000,70);
        cap.setFont(new Font("Tahoma",Font.BOLD,40));
        cap.setForeground(Color.white);
        add(cap);
        
        ImageIcon i1=null,i2=null,i3=null,i4=null,i5=null,i6=null,i7=null,i8=null,i9=null,i10=null;
        ImageIcon[] img=new ImageIcon[]{i1,i2,i3,i4,i5,i6,i7,i8,i9,i10};
        
        Image j1=null,j2=null,j3=null,j4=null,j5=null,j6=null,j7=null,j8=null,j9=null,j10=null;
        Image[] Jimg=new Image[]{j1,j2,j3,j4,j5,j6,j7,j8,j9,j10};
        
        ImageIcon k1=null,k2=null,k3=null,k4=null,k5=null,k6=null,k7=null,k8=null,k9=null,k10=null;
        ImageIcon[] Kimg=new ImageIcon[]{k1,k2,k3,k4,k5,k6,k7,k8,k9,k10};
         
       for(int i=0;i<9;i++){
           
     
    img[i] =new ImageIcon(ClassLoader.getSystemResource("icons/dest"+(i+1)+".jpg"));
    Jimg[i]= img[i].getImage().getScaledInstance(800,600,Image.SCALE_DEFAULT);
    Kimg[i]= new ImageIcon(Jimg[i]);
    label[i]=new JLabel(Kimg[i]);
    label[i].setBounds(0,0,800,600);
    add(label[i]);
       }
       
       t1=new Thread(this);
       t1.start();
       
       
   setVisible(true);
    
    //adding 10 images directly:it can be done by copied by 10 times or either making it DYNAMICALLY IN NATURE
    

}
    
    public static void main(String[]args){
        new Destination();
    }
} 
