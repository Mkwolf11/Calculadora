package com.mycompany.calculadora;

import java.awt.*;
import java.awt.event.*;
import static java.lang.Integer.parseInt;

/**
 *
 * @author mcabe
 */
public class Calculadora extends Frame implements ActionListener {
    // string con los numeros que despues mostrare en un panel
    public String [] Numeros = {"7","8","9","4","5","6","1","2","3","0","CE"};
    // String con las operaciones que despues mostrare en un panel
    public String [] Operaciones = {"     +     ", "     -     ","     *     "     ,     "     /     ","     =     "}; 

    // valores que usaremos a la hora de funcionar la calculadora
    String valorP;// valores de +,-,*,/ y CE
    TextField texto;
    Integer num1;// primer numero a trabajar
    Integer num2;//segundo numero a trabajar
    Integer resultado;
    
    public Calculadora(){
        //texto      
        texto = new TextField(20);
        texto.setBackground(Color.magenta);
        texto.setFont(new Font("",Font.ROMAN_BASELINE, 50));
        texto.setEnabled(false);//Con esto impido la entrada de texto por teclado
              
        //panel operaciones
        Panel pnlOperaciones= new Panel();
        pnlOperaciones.setLayout (new GridLayout (0,1));
         for (int k=0;k<Operaciones.length;k++) {//crea los botones de operaciones
            Button btnOperacion = new Button(Operaciones[k]);
            btnOperacion.addActionListener(this);
            btnOperacion.setBackground(Color.cyan);
            pnlOperaciones.add(btnOperacion);
            
        }
              
        //panel pnlNumeros
        Panel pnlNumeros = new Panel();
        pnlNumeros.setLayout (new GridLayout (4,3));
        for (int k=0;k<Numeros.length;k++) {//Crea los botones de numeros
            Button btnNumero = new Button(Numeros[k]);
            btnNumero.addActionListener(this);
            btnNumero.setBackground(Color.GRAY);
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
        setLocationRelativeTo(null);//hago que la ventana se muestre en el medio de la pantalla       
    }

    public void actionPerformed (ActionEvent ex) { 
        String info = ((Button)ex.getSource()).getLabel(); // Pillo la info de los botones 
	ComprovadorValores(info);//y paso a comprobar
    }
    
    //con este metodo compruevo si el valorP que me han pasado es un numero o un valorP para operar en plan +,-...
    public void ComprovadorValores (String valor) {
        if (ComprobarNumero(valor)) {//numero
            Numeros(valor);   
        } else { //operacion
            Operaciones(valor); 
        }    
    }
    
    //Con este metodo es por asi decirlo con el que creo numeros, hasta que introduzco un valorP de operacion
    public void Numeros(String numero) {                  
        texto.setText(texto.getText()+numero);   
    }   
          
    //este metodo mira a ver si hemos pasado un numero
    public boolean ComprobarNumero (String orden) { 
        try {
            Integer.parseInt(orden); 
            return true;
        } catch (NumberFormatException exx) {
            return false;
        }
    }
    
    // en este metodo segun los valores que demos a la operacion llama a los metodos de cada una de ellas
    public void Operaciones (String valor) {
        if (valor.equals("     +     ")) {//suma      
            num1 = parseInt((String)texto.getText());//lo que hay escrito en el textfield lo guardo en num1
            valorP = "     +     ";//establezco valorP para despues si doy al boton igual que haga las cuentas
            texto.setText("");// y limpio lo que hay en el textfield porq ya lo tengo guardado
            // es lo mismo en los demas valores menos en el igual
        } else if (valor.equals("     -     ")) {
            num1 = parseInt((String)texto.getText());
            valorP = "     -     ";
            texto.setText("");
        } else if (valor.equals("     *     ")) {
            num1 = parseInt((String)texto.getText());
            valorP = "     *     ";
            texto.setText(""); 
        } else if (valor.equals("     /     ")) {
            num1 = parseInt((String)texto.getText());
            valorP = "     /     ";
            texto.setText("");
        } else if (valor.equals("     =     ")) {
            // Iniciamos num2 y pasamos a string los valores del integer
            num2 = parseInt((String)texto.getText());
            // Establezco un if que segun el valorp hace distintas operaciones
            if(this.valorP == "     +     "){
                resultado = num1 + num2;
                texto.setText(Integer.toString(resultado));
                resultado = null;
            }else if(this.valorP == "     -     "){
                resultado = num1 - num2;                
                texto.setText(Integer.toString(resultado));
                resultado = null;
            }else if(this.valorP == "     *     "){
                resultado = num1 * num2;
                texto.setText(Integer.toString(resultado));
                resultado = null;
            }else if(this.valorP == "     /     "){
                resultado = num1 / num2;                
                texto.setText(Integer.toString(resultado));
                resultado = null;
            }
        } else if (valor.equals("CE")) {
            num1 = null;
            num2 = null;
            texto.setText("");
        } 
    }
           
    public static void main (String [] args){
        Calculadora c = new Calculadora();
        c.setVisible(true);
    } 
}
