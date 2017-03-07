/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hiep
 */
public class nhap {
    public static ResultSet a=null;
    public static void main(String[] args) {
       SQLServerConnUtils_SQLJDBC cndb=new SQLServerConnUtils_SQLJDBC();
        if(cndb.getSQLServerConnUtils_SQLJDBC("gv1","123")!=null)
            System.out.print("dungggggggggg");
        else{
            System.out.print("saiiiiiiiiiiiiii");
        }
        String sql="select * from giangvien";
       // try {
            //PreparedStatement stm=cn.prepareStatement(sql);
           // nhap.a=stm.executeQuery();
            //ResultSet b=a;
            //while(b.next()){
              //  System.out.println(b.getString(1));
           // }
       // } //catch (SQLException ex) {
           // Logger.getLogger(nhap.class.getName()).log(Level.SEVERE, null, ex);
        //}
    }
}
