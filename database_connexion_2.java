package Systeme;

//cette classe permet de faire la connection avec la base de donnée


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;




public class database_connexion_2 {
    
    final static String JDBC_DRIVER="com.mysql.jdbc.Driver";
    final static String DB_URL="jdbc:mysql://localhost:3306/universite";
    
    final static String USER="root";
    final static String PASS="";
    
    
    public static Connection connection(){
        try{
            Class.forName(JDBC_DRIVER);
            
            Connection conn=DriverManager.getConnection(DB_URL,USER,PASS);
            
            return conn;
        }catch(Exception e){JOptionPane.showMessageDialog(null,e);
        return null;
        }
    }
}
