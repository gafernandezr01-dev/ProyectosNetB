/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios13;

/**
 *
 * @author alumno
 */
public class Ejercicios13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num1=1;
       int num2=2;
       System.out.println("La variable num1 contiene el valor " + num1 + " y la variable num2 contiene el valor " + num2 + ".");
       int cambio=num1;
       num1=num2;
       num2=cambio;
       System.out.println("Ahora, la variable num1 contiene el valor " + num1 + " y la variable num2 contiene el valor " + num2 + ".");
    }
}