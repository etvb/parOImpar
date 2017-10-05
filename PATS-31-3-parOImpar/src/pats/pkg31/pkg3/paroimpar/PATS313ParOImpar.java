/*
 * Ejercicio3: Leer números hasta que se intriduzca un 0. Para cada uno indicar 
 *si es par o impar.
 */
package pats.pkg31.pkg3.paroimpar;

import javax.swing.JOptionPane;

/**
 *
 * @author edgardo
 */
public class PATS313ParOImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int valor, resultado;
        
        valor = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un valor"));
        
        while(valor != 0){
            resultado = valor % 2;
            if(resultado == 0 ){
                JOptionPane.showMessageDialog(null, "Es PAR");
            }else{
                JOptionPane.showMessageDialog(null, "Es IMPAR");
            }
                valor = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un valor"));
        }
    }
    
}
