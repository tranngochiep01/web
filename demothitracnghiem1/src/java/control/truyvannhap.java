/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Hiep
 */
public class truyvannhap {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
          //String url = "jdbc:sqlserver://localhost:1433;databaseName=THITRACNGHIEM";
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        SQLServerConnUtils_SQLJDBC kndb=new SQLServerConnUtils_SQLJDBC();
            String username="sv";
            String pass="123456";
            String masv="sv1";
            String mamh="TA1";
            String trinhdo="A";
            int thoigian=5;
            int lan=1;
            int id=0;
            int idthi=1068;
            Connection conn = kndb.getSQLServerConnUtils_SQLJDBC(username, pass);
            
            String sql="select * from Dkthitam where masv=? and mamh=? and lan=?";
            PreparedStatement stm=conn.prepareStatement(sql);
            stm.setString(1,masv);
            stm.setString(2,mamh);
            stm.setInt(3,lan);
            ResultSet rs=stm.executeQuery();
            if(!rs.next()){
                String sql1="insert into Dkthitam values(?,?,?,?,?)";
                stm=conn.prepareStatement(sql1);
                stm.setString(1,mamh);
                stm.setString(2,masv);
                stm.setString(3,trinhdo);
                stm.setInt(4,thoigian);
                stm.setInt(5,lan);
                stm.executeUpdate();
                String sql2="select max(id) as id from Dkthitam ";
                 stm=conn.prepareStatement(sql2);
                 rs=stm.executeQuery();
                 while(rs.next()){
                     id=rs.getInt("id");
                 }
               String sql3 = "select * from cauhoi where macauhoi in (select macauhoi from ctdethi where idthi=" + idthi + ") ORDER BY newid()";
               stm=conn.prepareStatement(sql3);
               rs=stm.executeQuery();
               while(rs.next()){
                   /*String sql4="insert into thitam values(?,?,'e')";
                   stm=conn.prepareStatement(sql4);
                   stm.setInt(1,id);
                   stm.setString(2,rs.getString("macauhoi"));
                   stm.executeUpdate();*/
                   System.out.print(rs.getString("macauhoi"));
               }
            }
           /* String sql5="select id,thoigian from dkthitam where masv=? and mamh=? and lan=?";
                 stm=conn.prepareStatement(sql5);
                 stm.setString(1,masv);
                 stm.setString(2,mamh);
                 stm.setInt(3,lan);
                 rs=stm.executeQuery();
                 while(rs.next()){
                     id=rs.getInt("id");
                     thoigian=rs.getInt("thoigian");
                     
                 }*/
    }
}
