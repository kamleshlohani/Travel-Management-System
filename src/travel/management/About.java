
package travel.management;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class About extends JFrame implements ActionListener{
    
    About(){
        setBounds(600,200,500,550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        
        JLabel l1=new JLabel("About me ");
        l1.setBounds(200,10,100,40);
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Sans-serif",Font.PLAIN,18));
        add(l1);
        
         String s = " About Projects \n"
                + "\nThe objective of the Travel and Tourism Management System"
                + "project is to develop a system that automates the processes "
                + "stem using which one can perform all operations related to \"\n" +
"                + \"traveling.\\n\\n\"\n" +
"                + \"This application will help in accessing the information related \"\n" +
"                + \"to the travel to the particular destination with great ease. \"\n" +
"                + \"The users can track the information related to their tours with \"\n" +
"                + \"great ease through this application. The travel agency information \"\n" +
"                + \"can also be obtained through this application.\\n\\n\"\n" +
"                + \"Advantages of Project:\"\n" +
"                + \"\\nGives accurate information\"\n" +
"                + \"\\nSimplifies the manual work\"\n" +
"                + \"\\nIt minimizes the documentation related work\"\n" +
"                + \"\\nProvides up to date information\"\n" +
"                + \"\\nFriendly Environment by providing warning messages.\"\n" +
"                + \"\\ntravelers details can be provided\"\n" +
"                + \"\\nbooking confirmation notification\"and activities of a travel and the purpose is to design a "
                + "system using which one can perform all operations related to "
                + "traveling.\n\n"
                + "This application will help in accessing the information related "
                + "to the travel to the particular destination with great ease. "
                + "The users can track the information related to their tours with "
                + "great ease through this application. The travel agency information "
                + "can also be obtained through this application.\n\n"
                + "Advantages of Project:"
                + "\nGives accurate information"
                + "\nSimplifies the manual work"
                + "\nIt minimizes the documentation related work"
                + "\nProvides up to date information"
                + "\nFriendly Environment by providing warning messages."
                + "\ntravelers details can be provided"
                + "\nbooking confirmation notification"
                ;

        
        TextArea area=new TextArea(s,10,40,Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(20,100,450,300);
        add(area);
        
        JButton back=new JButton("Back");
        back.setBounds(200,420,100,25);
        back.addActionListener(this);
        add(back);
        add(back);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
    }
    
       public static void main(String[]args){
        new About();
    }
}
