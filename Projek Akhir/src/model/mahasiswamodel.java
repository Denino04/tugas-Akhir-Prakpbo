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
import main.mahasiswa;

/**
 *
 * @author ASUS ROG
 */
public class mahasiswamodel {
    connector con = new connector();
    
    public void insertmahasiswa (mahasiswa mahasiswa){
        String query = "insert into mahasiswa(Nama, Nim, Prodi, Kelas, Asal) values (?,?,?,?,?)";
        PreparedStatement pstm;
        
        try {
            con.statement = con.koneksi.createStatement();
            pstm = con.koneksi.prepareStatement(query);
            pstm.setString(1, mahasiswa.getNama());
            pstm.setString(2, mahasiswa.getNIM());
            pstm.setString(3, mahasiswa.getProdi());
            pstm.setString(4, mahasiswa.getKelas());
            pstm.setString(5, mahasiswa.getAsal());
            pstm.executeUpdate();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void deletemahasiswa (String NIM){
        String query = "delete from mahasiswa where NIM = ?";
        PreparedStatement pstm;
        
        try{
            pstm = con.koneksi.prepareStatement(query);
            pstm.setString(1, NIM);
            pstm.executeUpdate();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void updatemahasiswa (mahasiswa mahasiswa){
        String query = "Update mahasiswa SET Nama=?, Prodi=?, Kelas=?, Asal=? WHERE NIM=?";
        PreparedStatement pstm;
        
        try{
            con.statement = con.koneksi.createStatement();
            pstm = con.koneksi.prepareStatement(query);
            pstm.setString(1, mahasiswa.getNama());
            pstm.setString(2, mahasiswa.getProdi());
            pstm.setString(3, mahasiswa.getKelas());
            pstm.setString(4, mahasiswa.getAsal());
            pstm.setString(5, mahasiswa.getNIM());
            pstm.executeUpdate();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    public ArrayList<mahasiswa> getMahasiswa(){
        System.out.println("getMahasiswa()");
        String query = "Select * from mahasiswa";
        PreparedStatement pstm;
        
        try{
            con.statement = con.koneksi.createStatement();
            pstm = con.koneksi.prepareStatement(query);
            ResultSet rs = pstm.executeQuery();
            ArrayList<mahasiswa> list = new ArrayList<>();
            mahasiswa mahasiswa;
            while (rs.next()){
                mahasiswa = new mahasiswa(
                rs.getString("Nama"),
                rs.getString("NIM"),
                rs.getString("Prodi"),
                rs.getString("Kelas"),
                rs.getString("Asal")
                );
                list.add(mahasiswa);
            } return list;
        } catch (SQLException e){
            System.out.println(e.getMessage());
        } return null;
    }
    
    public boolean isContainmahasiswa(){
        System.out.println("isContainMahasiswa()");
        try{
            String query = "Select count(*) as num from mahasiswa";
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
