/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int suma, producto, pnumero, snumero, tnumero;
        
        System.out.println("Por favor, introduzca el primer numero: ");
        pnumero = teclado.nextInt();
        
        System.out.println("Por favor, introduzca el segundo numero: ");
        snumero = teclado.nextInt();
        
        System.out.println("Por favor, introduzca el tercer numero: ");
        tnumero = teclado.nextInt();
        
        suma = pnumero + snumero + tnumero;
        producto = pnumero * snumero * tnumero;
        System.out.println("La suma de los numeros introducidos es de: " + suma);
        System.out.println("El producto de los numeros introducidos es: " + producto);
    }
}
