/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio24 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        float nota, media;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Indtroduzca la nota de programacion: ");
        nota = entrada.nextFloat();
        
        System.out.println("Indtroduzca la nota de lenguaje de marcas: ");
         nota = nota + entrada.nextFloat();
        
        System.out.println("Indtroduzca la nota de base de datos: ");
         nota = nota + entrada.nextFloat();
        
        System.out.println("Indtroduzca la nota de entornos de desarrollo: ");
         nota = nota + entrada.nextFloat();
        
        System.out.println("Indtroduzca la nota de sistemas informaticos: ");
         nota = nota + entrada.nextFloat();
        
        System.out.println("Indtroduzca la nota de formacion y orientacion laboral: ");
         nota = nota + entrada.nextFloat();
        
        System.out.println("Indtroduzca la nota de base de datos: ");
        nota = nota + entrada.nextFloat();
        
        media = nota / 6;
        
        System.out.println("La medida de las 6 asignaturas es: " + media);
    }
    
}
