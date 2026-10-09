/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, cuadrado, cubo;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor introduzca un numero entero: ");
        num = entrada.nextInt();
        
        cuadrado = num * num;
        System.out.println("El cuadrado de: " + num + " es: "+ cuadrado);
        
        cubo = num * num *num;
        System.out.println("El cubo de: " + num + " es: "+ cubo);
    }
}
