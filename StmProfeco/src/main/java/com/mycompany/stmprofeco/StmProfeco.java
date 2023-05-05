/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stmprofeco;

import Interfaz.FrmLogin;
import Interfaz.FrmMain;
import javax.swing.JFrame;

/**
 *
 * @author ITSON NAVOJOA
 */
public class StmProfeco {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        FrmLogin FM = new FrmLogin();
        //FM.setSize(500, 500); // Establecer el tamaño de la ventana
        FM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Establecer el comportamiento al cerrar la ventana
        FM.setVisible(true);
    }
}
