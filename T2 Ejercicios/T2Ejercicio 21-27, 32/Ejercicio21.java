/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
                Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor, introduzca un numero de segundos:");
        long segUser = teclado.nextLong();
        
        long dias = segUser / 86400;
        long horas = (segUser % 86400) / 3600;
        long minutos = (segUser % 3600) / 60;
        long segundos = segUser % 60;
        
        System.out.println(segUser + " segundos hacen un total de : " + dias + " días, " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos.");
    }
    
}
