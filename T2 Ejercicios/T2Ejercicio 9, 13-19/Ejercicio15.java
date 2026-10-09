/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author alumno
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tiempo;
        tiempo=10000;
        int hora= tiempo/3600; //dividimos por 3600 segundos que equivalen a 1h
        int minutos= (tiempo%3600)/60;
        int segundos=tiempo%60; 
                
        System.out.println("10.000 segundos hacen un total de: " + hora + " horas, " + minutos + " minutos y " + segundos + " segundos.");
    }
    
}
