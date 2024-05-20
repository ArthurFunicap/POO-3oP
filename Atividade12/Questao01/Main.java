package Questao01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Circulo> Circulos = new ArrayList<Circulo>();

        Circulo c1 = new Circulo(2.5);
        Circulo c2 = new Circulo(20);
        Circulo c3 = new Circulo(20.04);
        Circulo c4 = new Circulo(0.3);
        Circulo c5 = new Circulo(25);

        Circulos.add(c1);
        Circulos.add(c2);
        Circulos.add(c3);
        Circulos.add(c4);
        Circulos.add(c5);

        System.out.println("Valores da área de cada círculo: ");
        for (Circulo c : Circulos) {
            System.out.printf("%.2f\n", c.calcularAreaCirculo());
        }
    }
}
