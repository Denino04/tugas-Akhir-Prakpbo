/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author ASUS ROG
 */
public class admin {
    private String Nama;
    private String NIP;
    private String Pin;
    private String Prodi;
    
    public admin(String Nama, String NIP, String Pin, String Prodi){
        this.Nama = Nama;
        this.NIP = NIP;
        this.Pin = Pin;
        this.Prodi = Prodi;
    }
        
    public String getNama(){
        return Nama;
    }
    
    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public String getNIP(){
        return NIP;
    }
    
    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    public String getPin(){
        return Pin;
    }
    
    public void setPin(String Pin){
        this.Pin = Pin;
    }

    public String getProdi(){
        return Prodi;
    }
    
    public void setProdi(String Prodi){
        this.Prodi = Prodi;
    }

}
