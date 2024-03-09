public class Questao15 {
    public static void main(String[] args) {
        int i = 1;

        System.out.println("Múltiplos de 3 de 1 a 50: ");
        while(i <= 50){
            if(i % 3 == 0)
                System.out.println(i);
            
            i++;
        }
    }
}
