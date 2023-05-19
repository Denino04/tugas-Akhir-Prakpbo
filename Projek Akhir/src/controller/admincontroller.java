/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
import java.util.ArrayList;
import main.admin;
import main.mahasiswa;
import model.adminmodel;
import model.mahasiswamodel;
import view.adminview;
import view.mahasiswaview;
/**
 *
 * @author ASUS ROG
 */
public class admincontroller {
    private ArrayList<admin> list;
    private String Nama;
    private String NIP;
    private String Pin;
    private String Prodi;
    
        public admincontroller (adminview view, adminmodel model){
            if(model.isContainAdmin()){
                list = model.getAdmin();
                String [][] data = convertData(list);
            }else{
                JOptionPane.showMessageDialog(null, "Admin Belum Terdaftar");
            }
            
            view.btnLogin.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e){
                    String Nama = view.getNama();
                    String NIP = view.getNIP();
                    String Pin = view.getPin();
                    String [][] data = convertData(list);
                    int log=0;
                    for(int i=0; i<list.size();i++){
                        if(data[i][0].equals(Nama) && data[i][1].equals(NIP) && data[i][2].equals(Pin)){
                            log = 1;
                        }
                    }
                    if(log == 1){
                        view.dispose();
                        mahasiswaview view = new mahasiswaview();
                        mahasiswamodel model = new mahasiswamodel();
                        mahasiswacontroller con = new mahasiswacontroller(view, model);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Data Admin Salah");

                    }
                }
            
            });
        }
        
        private String[][] convertData(ArrayList<admin> list) {    
        String[][] data = new String[list.size()][4];
        
        for(int i=0; i<list.size();i++)
        {
            data[i][0] = list.get(i).getNama();
            data[i][1] = list.get(i).getNIP();
            data[i][2] = list.get(i).getPin();
            data[i][3] = list.get(i).getProdi();           
        }
        return data;
    }
}