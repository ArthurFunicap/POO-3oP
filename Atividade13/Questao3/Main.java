package Questao3;

public class Main {
    double divisao(double num1, double num2){
        try {
            return num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("Divisão por zero");
        }
    }
}
