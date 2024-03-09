public class Questao05 {
    public static void main(String[] args) {
        
        int i = 1;

        while(i <= 100){
            if(i % 3 == 0 && i % 5 == 0)
                System.out.printf("%d: FizzBuzz\n", i);
            else if(i % 3 == 0)
                System.out.printf("%d: Fizz\n", i);
            else if(i % 5 == 0)
                System.out.printf("%d: Buzz\n", i);
            
            i++;
        }

    }
}
