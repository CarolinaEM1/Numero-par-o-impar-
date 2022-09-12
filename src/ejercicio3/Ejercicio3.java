/*
 Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o inpar
 */
package ejercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author Carolina EM
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        
        while (numero != 0){
            if (numero %2 == 0){
                System.out.println("El número "+numero+" es PAR");
            }
            else {
                System.out.println("El numero "+numero+" es IMPAR");
            }
            numero=Integer.parseInt(JOptionPane.showInputDialog("Digite otro número"));
            
        }
    }
    
}
