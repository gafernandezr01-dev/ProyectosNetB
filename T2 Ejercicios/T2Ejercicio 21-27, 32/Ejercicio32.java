/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio32;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Por favor, indique una cantidad de dinero: ");
        int dinero = teclado.nextInt();

        // Calculamos los billetes de 50 y nos quedamos con lo que sobra
        int b50 = dinero / 50;
        dinero = dinero % 50;

        // Calculamos los billetes de 20 y nos quedamos con lo que sobra
        int b20 = dinero / 20;
        dinero = dinero % 20;

        // Calculamos los billetes de 10 y nos quedamos con lo que sobra
        int b10 = dinero / 10;
        dinero = dinero % 10;

        // Calculamos los billetes de 5 y nos quedamos con lo que sobra
        int b5 = dinero / 5;
        dinero = dinero % 5;

        // Calculamos las monedas de 2 y lo que quede final serán las de 1
        int m2 = dinero / 2;
        int m1 = dinero % 2;

        // muestra el resultado en la pantalla
        System.out.print("Se descomponen en: " + b50 + " billetes de 50, ");
        System.out.print(b20 + " billetes de 20, " + b10 + " billetes de 10, ");
        System.out.print(b5 + " billetes de 5, " + m2 + " monedas de 2 euros ");
        System.out.println("y " + m1 + " monedas de 1 euro.");
    }
    
}
