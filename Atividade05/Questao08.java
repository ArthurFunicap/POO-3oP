public class Questao08 {
    public static void main(String[] args) {
        int i = 1, soma = 0;

        while(i <= 100){
            soma += i;

            i++;
        }
        System.out.printf("Soma: %d\n", soma);
    }
}
