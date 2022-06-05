/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_4;

import java.util.Scanner;

/**
 *
 * @author DevBuster
 */
//En este ejercicio practicarás las estructuras de control, para ello deberás crear:
public class Ejercicio_4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite un numero: ");

        int numeroIf = input.nextInt();
        int numeroWhile = 0;

        /*Usando un if, crear una condición que compare si la variable numeroIf 
        es positivo, negativo, o 0.
        Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
         */
        if (numeroIf > 0) {
            System.out.println("El numero " + numeroIf + " es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El numero " + numeroIf + " es negaivo");
        } else if (numeroIf == 0) {
            System.out.println("El numero " + numeroIf + " es cero");
        }

        System.out.println("");

        /*
        Crea un bucle While, este bucle tendrá que tener como condición que la 
        variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
            - Incrementar el valor de la variable en uno cada vez que se ejecute.
            - Mostrarlo por pantalla cada vez que se ejecute.
         */
        System.out.println("BUCLE WHILE");
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        System.out.println("");

        /*
        Para el bucle Do While, deberás crear la misma estructura que en el While,
        pero solo se debe ejecutar una vez.
         */
        System.out.println("BUCLE DO WHILE");
        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        } while (numeroWhile < 3);

        System.out.println("");
        /*
        Para el bucle For, crea una variable numeroFor, esta variable tendrá como 
        valor 0 y su condición será que la variable sea igual o menor que 3, se irá 
        incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
         */
        System.out.println("BUCLE FOR");
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        System.out.println("");

        /*
        Por último, para el Switch, deberás crear la variable estacion, y distintos 
        case para las cuatro estaciones del año. Dependiendo del valor de la variable 
        estacion se deberá mandar un mensaje por consola informando de la estación en 
        la que está. También habrá que poner un default para cuando el valor de la 
        variable no sea una estación.
         */
        System.out.println("SWITCH");
        System.out.println("Digite un numero del 1 al 4 para mostrar el tipo de estacion");
        int estacion = input.nextInt();

        switch (estacion) {
            case 1:
                System.out.println("Primavera");
                break;
            case 2:
                System.out.println("Verano");
                break;
            case 3:
                System.out.println("Otono");
                break;
            case 4:
                System.out.println("Invierno");
                break;
            default:
                System.out.println("El numero que ingreso no es valido");
//                throw new AssertionError("El numero que ingreso no es valido");
        }
    }
}
