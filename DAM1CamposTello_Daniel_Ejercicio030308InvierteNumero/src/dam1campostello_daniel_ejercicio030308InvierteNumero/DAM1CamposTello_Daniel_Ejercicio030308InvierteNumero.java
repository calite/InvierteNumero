/*
Pedir un número y mostrarlo como otro 
número con los dígitos invertidos usando un bucle while.
Ejemplo, si tecleas 1234, se mostraría 4321.
 */
package dam1campostello_daniel_ejercicio030308InvierteNumero;

import java.util.*;

public class DAM1CamposTello_Daniel_Ejercicio030308InvierteNumero {

    public static void main(String[] args) {

        Scanner recoge = new Scanner(System.in);

        int invertido = 0;

        int resto;

        System.out.println("Vamos a invertir un numero.");
        System.out.print("Introduce un numero entero: ");

        int numero = recoge.nextInt();

        do
        {
            //obtenemos el ultimo numero dividiendo 
            //entre 10 para obtener el resto
            resto = numero % 10;
            //una vez obtenido el ultimo numero lo desplazamos a la izq.
            //y lo guardamos en la nueva variable.
            invertido = invertido * 10 + resto;
            //el siguiente operador equivale a decir que numero = numero/10
            numero /= 10;
            
        } while (numero > 0);

        System.out.println("El numero invertido es: " + invertido);
        
    }

}
