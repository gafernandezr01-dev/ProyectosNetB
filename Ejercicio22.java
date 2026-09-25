/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       int lado, perimetro, area, altura;
        
        System.out.print("Por favor, introduzca la medida de un lado: ");
        lado = teclado.nextInt();
        
        perimetro = lado + lado + lado;
        System.out.print("El perimetro de un triangulo es: " +perimetro);
        
        System.out.print("Por favor, introduzca la medida de un lado: ");
        altura=teclado.nextInt();
        area = (lado + altura)/2; 
        
        System.out.println("El area de un triangulo es: " + area);
    }
}
