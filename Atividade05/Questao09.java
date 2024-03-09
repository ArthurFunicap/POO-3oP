public class Questao09 {
    public static void main(String[] args) {
        int i = 1, produto = 1;

        while(i <= 5){
            produto *= i;
            i++;
        }
        System.out.printf("Produto: %d\n", produto);
    }
}
