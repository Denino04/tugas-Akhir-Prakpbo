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
/**
 *
 * @author ASUS ROG
 */
public class adminview extends JFrame implements ActionListener{
    JLabel lNama = new JLabel("Nama");
    JLabel lNIP = new JLabel("NIP");
    JLabel lPin = new JLabel("PIN");
    
    public JTextField tfNama = new JTextField();
    public JTextField tfNIP = new JTextField();
    public JTextField tfPin = new JTextField();
    
    public JButton btnLogin = new JButton("Login");
    
    public adminview(){
        setTitle("Data Mahasiswa");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLayout(null);
        setSize(400,250);
        
        add(lNama);
        lNama.setBounds(183, 20, 100, 20);
        add(tfNama);
        tfNama.setBounds(25, 40, 350, 20);
        
        add(lNIP);
        lNIP.setBounds(189, 60, 100, 20);
        add(tfNIP);
        tfNIP.setBounds(25, 80, 350, 20);
        
        add(lPin);
        lPin.setBounds(189, 100, 100, 20);
        add(tfPin);
        tfPin.setBounds(25, 120, 350, 20);
        
        add(btnLogin);
        btnLogin.setBounds(25,170, 350, 20);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public String getNama(){
        return tfNama.getText();
    }
    public String getNIP(){
        return tfNIP.getText();
    }
    public String getPin(){
        return tfPin.getText();
    }
    
    
}
