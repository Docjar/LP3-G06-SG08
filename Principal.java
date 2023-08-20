package ejemplo;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        System.out.println("Primer cambio es un Hola mundo");
        System.out.println("Segundo cambio es un Hello World");
        int vida, rp;
        boolean fl = false;
        vida = 0;
        Scanner sc = new Scanner(System.in);
        do {
            vida++;
            System.out.println("Vida:" + vida + "\t¿Cual es el número secreto? ");
            rp = sc.nextInt();
            if (rp == 1234)
                fl = true;
        } while (vida < 3 && !fl);

        if (fl) {
            System.out.println("¡Adivinaste!");

            System.out.println("¡Felicidades! Has ganado un premio.");
            System.out.println("Tu premio es un vale para una cena en un restaurante elegante.");
        } else {
            System.out.println("Ups, perdiste...");
        }
    }
}
