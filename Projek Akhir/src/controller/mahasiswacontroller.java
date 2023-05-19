/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import main.mahasiswa;
import model.mahasiswamodel;
import view.mahasiswaview;

/**
 *
 * @author ASUS ROG
 */
public class mahasiswacontroller {
    private ArrayList<mahasiswa> list;
    private String Nama;
    private String NIM;
    private String Prodi;
    private String Kelas;
    private String Asal;
    
    public mahasiswacontroller (mahasiswaview view, mahasiswamodel model){
        if(model.isContainmahasiswa()){
            list = model.getMahasiswa();
            String [][] data = convertData(list);
            view.tabel.setModel((new JTable(data, view.namaKolom)).getModel());
        }else{
            JOptionPane.showMessageDialog(null, "Mahasiswa Belum Terdaftar");
        }
        view.btnTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String Nama = view.getNama();
               String NIM = view.getNIM();
               String Prodi = view.getProdi();
               String Kelas = view.getKelas();
               String Asal = view.getAsal();
               mahasiswa mahasiswa = new mahasiswa(Nama, NIM, Prodi, Kelas, Asal);
               model.insertmahasiswa(mahasiswa);
               list = model.getMahasiswa();
               System.out.println(list.get(0).getNIM());
               String [][] data = convertData(list);
               view.tabel.setModel((new JTable(data, view.namaKolom)).getModel());
               view.tfNama.setText("");
                view.tfNIM.setText("");
                view.tfProdi.setText("");
                view.tfKelas.setText("");
                view.tfAsal.setText("");
            }
        });
        
         view.btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               System.out.println("btnUpdate");
               Nama = view.getNama();
               NIM = view.getNIM();
               Prodi = view.getProdi();
               Kelas = view.getKelas();
               Asal = view.getAsal();
               mahasiswa mahasiswa = new mahasiswa(Nama, NIM, Prodi, Kelas, Asal);
               model.updatemahasiswa(mahasiswa);
               list = model.getMahasiswa();
               String [][] data = convertData(list);
               view.tabel.setModel((new JTable(data, view.namaKolom)).getModel());
               view.tfNama.setText("");
                view.tfNIM.setText("");
                view.tfProdi.setText("");
                view.tfKelas.setText("");
                view.tfAsal.setText("");
            }
        });
         
         view.btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String NIM = view.getNIM();
                model.deletemahasiswa(NIM);
                list = model.getMahasiswa();
                String[][] data = convertData(list);
                view.tabel.setModel((new JTable(data, view.namaKolom)).getModel());
                view.tfNama.setText("");
                view.tfNIM.setText("");
                view.tfProdi.setText("");
                view.tfKelas.setText("");
                view.tfAsal.setText("");
            }
        });
         
         view.tabel.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
                int baris = view.tabel.getSelectedRow();
                int kolom = view.tabel.getSelectedColumn();
                Nama = view.tabel.getValueAt(baris, 0).toString(); 
                NIM = view.tabel.getValueAt(baris, 1).toString();
                Prodi = view.tabel.getValueAt(baris, 2).toString();
                Kelas = view.tabel.getValueAt(baris, 3).toString();
                Asal = view.tabel.getValueAt(baris, 4).toString();
                
                view.tfNama.setText(Nama);
                view.tfNIM.setText(NIM);
                view.tfProdi.setText(Prodi);
                view.tfKelas.setText(Kelas);
                view.tfAsal.setText(Asal);
            }
            
        });
        
        view.btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.tfNama.setText("");
                view.tfNIM.setText("");
                view.tfProdi.setText("");
                view.tfKelas.setText("");
                view.tfAsal.setText("");
            }
        }); 
    }

    private String[][] convertData(ArrayList<mahasiswa> list) {    
        String[][] data = new String[list.size()][5];
        
        for(int i=0; i<list.size();i++)
        {
            data[i][0] = list.get(i).getNama();
            data[i][1] = list.get(i).getNIM();
            data[i][2] = list.get(i).getProdi();
            data[i][3] = list.get(i).getKelas();
            data[i][4] = list.get(i).getAsal();            
        }
        return data;
    }
}
