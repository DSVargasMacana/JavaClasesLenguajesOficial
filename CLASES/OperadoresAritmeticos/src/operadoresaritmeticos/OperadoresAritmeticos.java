/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritmeticos;

import java.util.Scanner;

/**
 *  
 *  
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double number1;
        double number2;
        double sum = 0;
        double rest = 0;
        double multiplication = 0;
        double division = 0;
        
        System.out.println("Bienvenido a los numero faciles");
    //Se le piden los numeros al usuario
        System.out.println("Ingrese el primer numero: ");
        number1 = leer.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        number2 = leer.nextDouble();
    // Se hacen las operaciones
        sum = number1 + number2;
        rest = number1 - number2;
        multiplication = number1 * number2;
        division = number1 / number2;
    //Se muestra el resultado de las operaciones
        System.out.println("El resultado de la suma es: " + sum);
        System.out.println("El resultado de la resta es: " + rest);
        System.out.println("El resultado de la multiplicacion es: " + multiplication);
        System.out.println("El resultado de la division es: " + division);
    }
    
}
