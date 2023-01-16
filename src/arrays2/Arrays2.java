/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author dam
 */
public class Arrays2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fecha;
        Scanner entrada= new Scanner(System.in);
        String[ ]resultado;
        System.out.println("Introduce una fecha");
        fecha= entrada.nextLine();
        resultado=fecha.split("/");
        System.out.println(Arrays.toString(resultado));
    }
    
}
