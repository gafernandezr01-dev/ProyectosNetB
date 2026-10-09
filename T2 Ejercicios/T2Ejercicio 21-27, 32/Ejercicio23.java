/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23;
import java.util.Scanner; 
/**
 *
 * @author alumno
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Enciende la herramienta para leer el teclado
        Scanner teclado = new Scanner(System.in);
        
        // Declaramos las variables necesarias
        int precio, unidades, total;
        
        // Pedimos y leemos el precio del ordenador
        System.out.print("Por favor, introduzca el precio del modelo de ordenador que desea comprar: ");
        precio = teclado.nextInt();
        
        // Pedimos y leemos las unidades que quiere comprar
        System.out.print("¿Cuantas unidades quiere llevarse? ");
        unidades = teclado.nextInt();
        
        // Calculamos el precio total multiplicando el precio por las unidades
        total = precio * unidades;
        
        // Mostramos el resultado final en pantalla con el formato exacto requerido
        System.out.println("El precio total de su compra es de: " + total + " Euros");
    }
    
}
