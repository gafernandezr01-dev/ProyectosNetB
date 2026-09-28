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
        double suma, producto, pnumero, snumero, tnumero; //declarar variables
        
        System.out.println("Por favor, introduzca el primer numero: "); //introducir primer numero
        pnumero = teclado.nextDouble();
        
        System.out.println("Por favor, introduzca el segundo numero: ");//introducir segundo numero
        snumero = teclado.nextDouble();
        
        System.out.println("Por favor, introduzca el tercer numero: ");//introducir tercer numero
        tnumero = teclado.nextDouble();
        
        suma = pnumero + snumero + tnumero; //se suma todos los números
        producto = pnumero * snumero * tnumero; //se multiplica los productos
        System.out.println("La suma de los numeros introducidos es de: " + suma);
        System.out.println("El producto de los numeros introducidos es: " + producto);
    }
}