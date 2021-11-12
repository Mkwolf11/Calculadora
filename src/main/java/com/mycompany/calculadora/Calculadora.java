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
import java.awt.event.WindowEvent;

/**
 *
 * @author mcabe
 */
public class Calculadora extends Frame {
    
    int resultado = 0;
    int acumulador = 0;
    public Calculadora(){
        
        //panel de texto
        Panel texto= new Panel();
        texto.setLayout (new GridLayout (1,0));
        texto.add(new Label());

        //panel operaciones
        Panel operaciones= new Panel();
        operaciones.setLayout (new GridLayout (0,1));
        operaciones.add(new Button("+"));
        operaciones.add(new Button("-"));
        operaciones.add(new Button("*"));
        operaciones.add(new Button("/"));
        operaciones.add(new Button("="));
   
        
        //panel numeros
        Panel numeros = new Panel();
        numeros.setLayout (new GridLayout (4,3));

        numeros.add(new Button("7"));
        numeros.add(new Button("8"));
        numeros.add(new Button("9"));
        numeros.add(new Button("4"));
        numeros.add(new Button("5"));
        numeros.add(new Button("6"));
        numeros.add (new Button("1"));
        numeros.add(new Button("2"));
        numeros.add(new Button("3"));
        numeros.add(new Button("0"));
        numeros.add(new Button("CE"));
        
        
        //panel principal
        Panel principal = new Panel();
        principal.setLayout (new BorderLayout());
        principal.add(numeros,BorderLayout.CENTER);
        principal.add(texto,BorderLayout.NORTH);
        principal.add(operaciones,BorderLayout.EAST);
        setSize(400,500);
        setTitle("Ventana");
        this.add(principal);
        setVisible(true);

    }
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
    
    public static void main (String [] args){
        Calculadora c = new Calculadora();
        c.setVisible(true);
    } 
}
