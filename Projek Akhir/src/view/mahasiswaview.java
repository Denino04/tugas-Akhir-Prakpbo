/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class mahasiswaview extends JFrame implements ActionListener{
    JLabel lNama = new JLabel("Nama");
    JLabel lNIM = new JLabel("NIM");
    JLabel lProdi = new JLabel("Prodi");
    JLabel lKelas = new JLabel("Kelas");
    JLabel lAsal = new JLabel("Asal Sekolah");

    public JTextField tfNama = new JTextField();
    public JTextField tfNIM = new JTextField();
    public JTextField tfProdi = new JTextField();
    public JTextField tfKelas = new JTextField();
    public JTextField tfAsal = new JTextField();

    public JButton btnTambah = new JButton("Tambah");
    public JButton btnUpdate = new JButton("Update");
    public JButton btnDelete = new JButton("Delete");
    public JButton btnReset = new JButton("Clear");

    public JTable tabel;
    DefaultTableModel dtm;
    JScrollPane scrollPane;
    public Object namaKolom[] = {"Nama", "NIM", "Prodi", "Kelas", "Asal Sekolah"};

    public mahasiswaview() {
        dtm = new DefaultTableModel(namaKolom, 0);
        tabel = new JTable(dtm);
        scrollPane = new JScrollPane(tabel);

        setTitle("Data Mahasiswa");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLayout(null);
        setSize(650,400);

        add(scrollPane);
        scrollPane.setBounds(150, 20, 480, 300);

        add(lNama);
        lNama.setBounds(10, 20, 90, 20);
        add(tfNama);
        tfNama.setBounds(10, 40, 120, 20);

        add(lNIM);
        lNIM.setBounds(10, 60, 90, 20);
        add(tfNIM);
        tfNIM.setBounds(10, 80, 120, 20);

        add(lProdi);
        lProdi.setBounds(10, 100, 90, 20);
        add(tfProdi);
        tfProdi.setBounds(10, 120, 120, 20);

        add(lKelas);
        lKelas.setBounds(10, 140, 90, 20);
        add(tfKelas);
        tfKelas.setBounds(10, 160, 120, 20);
        
        add(lAsal);
        lAsal.setBounds(10, 180, 90, 20);
        add(tfAsal);
        tfAsal.setBounds(10, 200, 120, 20);

        add(btnTambah);
        btnTambah.setBounds(10, 230, 120, 20);

        add(btnUpdate);
        btnUpdate.setBounds(10, 260, 120, 20);

        add(btnDelete);
        btnDelete.setBounds(10, 290, 120, 20);

        add(btnReset);
        btnReset.setBounds(10, 320, 120, 20);
        btnReset.addActionListener(this);
    }

     public void actionPerformed(ActionEvent e) {
     if(e.getSource() == btnReset){
            tfNama.setText("");
            tfNIM.setText("");
            tfProdi.setText("");
            tfKelas.setText("");
            tfAsal.setText("");

        }
     }



    public String getNama(){
        return tfNama.getText();
    }
    public String getNIM(){
        return tfNIM.getText();
    }
    public String getProdi(){
        return tfProdi.getText();
    }
    public String getKelas(){
        return tfKelas.getText();
    }
    public String getAsal(){
        return tfAsal.getText();
    }
}
