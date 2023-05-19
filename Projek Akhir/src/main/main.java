/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import database.connector;
import controller.admincontroller;
import controller.mahasiswacontroller;
import model.adminmodel;
import model.mahasiswamodel;
import view.adminview;
import view.mahasiswaview;

/**
 *
 * @author ASUS ROG
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          adminview view = new adminview();
          adminmodel model = new adminmodel();
          admincontroller con = new admincontroller(view, model);
        
    }
    
}
