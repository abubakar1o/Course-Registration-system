/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author H.M.Tayyab
 */
public class database {
        
 Connection conn;
 PreparedStatement pst;
 ResultSet rs;
 

    public void connectdb(){
     try{
        this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_course_registration", "root", "");
     Statement stmt = conn.createStatement();
    }catch(Exception e){JOptionPane.showInputDialog("Erorr in database connection:\n"+e);}}

    
    
}
