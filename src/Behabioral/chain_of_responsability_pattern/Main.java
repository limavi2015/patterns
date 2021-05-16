package Behabioral.chain_of_responsability_pattern;
/*

En lugar de tener un objeto que procese todas las tareas, tenemos varios objetos
para procesar cada tipo de tarea, asi la peticion va a pasar a traves de todos los
objeto hasta que encuentre uno que la procese.
* */
import java.util.Scanner;

public class Main {

    public static void main(String[] arg) {
        ATMDispenseChain atmDispenser = new ATMDispenseChain();

        int amount = 0;
        System.out.println("Enter amount to dispense");
        Scanner input = new Scanner(System.in);
        amount = input.nextInt();
        if (amount % 10 != 0) {
            System.out.println("Amount should be in multiple of 10s.");
        }

        // process the request
        atmDispenser.c1.dispense(new Currency(amount));
    }
}
