package POOP5;

import java.util.Random;

/**
 * @author HGarcia Joel
 */

/**
 * Clase main
 */
public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();

        Circulo c = new Circulo(4324.12f);
        System.out.println(c.calcularPerimetro());
        System.out.println(c.calcularArea());

        c.setRadio(33.34f);
        System.out.println(c.calcularPerimetro());
        System.out.println(c.calcularArea());

        c.setRadio(-33.34f);
        System.out.println(c.calcularPerimetro());
        System.out.println(c.calcularArea());
    }
}