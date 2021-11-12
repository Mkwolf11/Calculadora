/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadora;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

/**
 *
 * @author mcabe
 */
public class Calculadora extends Frame implements ActionListener {
    // string con los numeros que despues mostrare en un panel
    public String [] Numeros = {"7","8","9","4","5","6","1","2","3",".","0","Ce"};
    // String con las operaciones que despues mostrare en un panel
    public String [] Operaciones = {"     +     ", "     -     ","     *     "     ,     "     /     ","     =     "}; 

    
    int resultado = 0;
    int acumulador = 0;
    TextField texto;
    
    public Calculadora(){
       
        
        //panel de texto
        Panel ptexto = new Panel();
        texto = new TextField(200);
        ptexto.setLayout (new GridLayout (1,0));
        ptexto.add(new Label());
        setSize(400,200);

        //panel operaciones
        Panel pnlOperaciones= new Panel();
        pnlOperaciones.setLayout (new GridLayout (0,1));
         for (int k=0;k<Operaciones.length;k++) {
            Button btnOperacion = new Button(Operaciones[k]);
            btnOperacion.addActionListener(this);        
            pnlOperaciones.add(btnOperacion);
        }
   
        
        //panel pnlNumeros
        Panel pnlNumeros = new Panel();
        pnlNumeros.setLayout (new GridLayout (4,3));
        for (int k=0;k<Numeros.length;k++) {
            Button btnNumero = new Button(Numeros[k]);
            btnNumero.addActionListener(this);        
            pnlNumeros.add(btnNumero);
        }  
        
        
        //panel principal
        Panel principal = new Panel();
        principal.setLayout (new BorderLayout());
        principal.add(pnlNumeros,BorderLayout.CENTER);
        principal.add(texto,BorderLayout.NORTH);
        principal.add(pnlOperaciones,BorderLayout.EAST);
        setSize(400,500);
        setTitle("Ventana Calculadora Marcos.cabfro");
        this.add(principal);
        setVisible(true);
        setLocationRelativeTo(null);

    }
    
    public static void main (String [] args){
        Calculadora c = new Calculadora();
        c.setVisible(true);
    } 

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
