/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author ASUS ROG
 */
public class mahasiswa {
    private String Nama;
    private String NIM;
    private String Prodi;
    private String Kelas;
    private String Asal;
    
    public mahasiswa (String Nama, String NIM, String Prodi, String Kelas, String Asal)
    {
        this.Nama = Nama;
        this.NIM = NIM;
        this.Prodi = Prodi;
        this.Kelas = Kelas;
        this.Asal = Asal;
    }
    
    public String getNama(){
        return Nama;
    }
    
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    
    public String getNIM(){
        return NIM;
    }
    
    public void setNIM(String NIM){
        this.NIM = NIM;
    }
    
    public String getProdi(){
        return Prodi;
    }
    
    public void setProdi(String Prodi){
        this.Prodi = Prodi;
    }
    
    public String getKelas(){
        return Kelas;
    }
    
    public void setKelas(String Kelas){
        this.Kelas = Kelas;
    }
    
    public String getAsal(){
        return Asal;
    }
    
    public void setAsal(String Asal){
        this.Asal = Asal;
    }
}
