/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author alumno
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cartera, billetes10, billetes50;
        cartera=130;
        billetes10=(cartera%50)/10;
        billetes50=cartera/50;
        
        System.out.println(cartera+" euros hacen un total de: "+ billetes50 +" billetes de 50 euros y "+ billetes10 +" billetes de 10 euros");
    }
    
}
