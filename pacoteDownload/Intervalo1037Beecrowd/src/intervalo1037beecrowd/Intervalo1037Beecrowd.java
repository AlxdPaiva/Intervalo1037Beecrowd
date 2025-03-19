/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package intervalo1037beecrowd;
import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class Intervalo1037Beecrowd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        double N = teclado.nextDouble();
        
        if (N >= 0 && N <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (N > 25 && N <= 50) {
            System.out.println("Intervalo (25,50]");
        } else if (N > 50 && N <= 75) {
            System.out.println("Intervalo (50,75]");
        } else if (N > 75 && N <= 100) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }
    }
    
}
