/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import com.sun.source.tree.CatchTree;
import java.sql.*;
import javax.swing.JOptionPane;
import database.connector;
import java.util.ArrayList;
import main.admin;
/**
 *
 * @author ASUS ROG
 */
public class adminmodel {
    connector con = new connector();
    
    public ArrayList<admin> getAdmin(){
        System.out.println("getAdmin()");
        String query = "Select * from Admin";
        PreparedStatement pstm;
        
        try{
            con.statement = con.koneksi.createStatement();
            pstm = con.koneksi.prepareStatement(query);
            ResultSet rs = pstm.executeQuery();
            ArrayList<admin> list = new ArrayList<>();
            admin admin;
            while (rs.next()){
                admin = new admin(
                rs.getString("Nama"),
                rs.getString("NIP"),
                rs.getString("Pin"),
                rs.getString("Prodi")
                );
                list.add(admin);
            } return list;
        } catch (SQLException e){
            System.out.println(e.getMessage());
        } return null;
    }
    
    public boolean isContainAdmin(){
        System.out.println("isContainAdmin()");
        try{
            String query = "Select count(*) as num from admin";
            PreparedStatement pstm = con.koneksi.prepareStatement(query);
            con.statement = con.koneksi.createStatement();
            ResultSet rs = pstm.executeQuery(query);
            rs.next();
            if(rs.getInt("num")>0) return true;
        } catch(SQLException e){
            System.err.println(e.getMessage());
        }return false;
    }

}
