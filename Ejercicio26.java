/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int  numero=0, numero1=0, numero2=0, numero3=0, numero4=0;//introducimos las variables
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca un numero de 4 cifras: ");
        numero = entrada.nextInt(); //el usuario va a introducir un numero de 4 cifras
        numero1=numero/1000;
        numero2=(numero%1000)/100;
        numero3=((numero%1000)%100)/10;
        numero4=((numero%1000)%100)%10;
        
        System.out.println("La primera cifra es: "+ numero1);
        System.out.println("La primera cifra es: "+ numero2);
        System.out.println("La primera cifra es: "+ numero3);
        System.out.println("La primera cifra es: "+ numero4);
    }
}
