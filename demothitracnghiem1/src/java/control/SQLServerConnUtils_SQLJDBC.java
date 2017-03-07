package control;


//import com.microsoft.sqlserver.jdbc.SQLServerDriver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.security.util.Password;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hiep
 */
public class SQLServerConnUtils_SQLJDBC {
    public static  ResultSet thi=null;
     public static  ResultSet thi2=null;
     public static Connection conn=null;
     public static String username="";
     public static String Password="";
    public Connection getSQLServerConnUtils_SQLJDBC(String user,String pass) {
 
    
          String url ="jdbc:sqlserver://localhost:1433;databaseName=THITRACNGHIEM";
        username=user;
        Password=pass;
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                conn= DriverManager.getConnection(url,username,Password);
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(SQLServerConnUtils_SQLJDBC.class.getName()).log(Level.SEVERE, null, ex);
            }
          
      return conn;
    }
    public boolean registerExam(String sql){
            try {
                Statement statement =  (Statement) conn.createStatement();
                if(statement.executeUpdate(sql)>=1)
                    return true;
            } catch (SQLException ex) {
                return false;
                //Logger.getLogger(SQLServerConnUtils_SQLJDBC.class.getName()).log(Level.SEVERE, null, ex);
            }
            return false;
    }
    public boolean  ktsinhvien(String sql){
         try {
             Statement statement =  (Statement) conn.createStatement();
             ResultSet rs= statement.executeQuery(sql);
             if(rs.next())
                 return true;
         } catch (SQLException ex) {
             System.out.println("loi");
             Logger.getLogger(SQLServerConnUtils_SQLJDBC.class.getName()).log(Level.SEVERE, null, ex);
             return false;
         }
         return false;
    }
    public  ResultSet query(String sql){
          Statement statement;
         try {
             statement = (Statement) conn.createStatement();
              ResultSet rs= statement.executeQuery(sql);
              return rs;
         } catch (SQLException ex) {
             Logger.getLogger(SQLServerConnUtils_SQLJDBC.class.getName()).log(Level.SEVERE, null, ex);
         }
            return null;
    }
    public boolean  insert(String sql){
          try {
                Statement statement =  (Statement) conn.createStatement();
                if(statement.executeUpdate(sql)>=1)
                    return true;
            } catch (SQLException ex) {
                return false;
                //Logger.getLogger(SQLServerConnUtils_SQLJDBC.class.getName()).log(Level.SEVERE, null, ex);
            }
            return false;
    }
       public boolean  update(String sql){
          try {
                Statement statement =  (Statement) conn.createStatement();
                if(statement.executeUpdate(sql)>=1)
                    return true;
            } catch (SQLException ex) {
                return false;
                //Logger.getLogger(SQLServerConnUtils_SQLJDBC.class.getName()).log(Level.SEVERE, null, ex);
            }
            return false;
    }
}
