
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Conexion {
    
    Connection cnn;
    public Connection conexionbd(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            System.out.println("error en driver"+ex);
                   
        }
        try {
            cnn=DriverManager.getConnection("jdbc:mysql://localhost/dbtienda","root","Maicol971225");
            JOptionPane.showMessageDialog(null,"Conexion exitosa ");
        } catch (Exception ex) {
            System.out.println("Error en url"+ex);
        }
        return cnn;
    }
    public static void main(String[]args){
        Conexion con=new Conexion(); 
        con.conexionbd();
    }
}
