
package travel.management;

import java.sql.*;



public class conn {
    
    Connection c;
    Statement s;
    conn(){
        //register the driver
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //creating a connection string
           
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/travelmanagement","root","12345");
            //creating statement
            
             s=c.createStatement();
             
             
             //executing myql query
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
