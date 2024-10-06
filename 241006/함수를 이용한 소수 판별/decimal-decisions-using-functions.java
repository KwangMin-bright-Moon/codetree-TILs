import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 0;

        for(int i = a; i <= b; i++){
            System.out.println("i = " + i);
            System.out.println("isPrime(i) = " + isPrime(i) );
            if(isPrime(i)){
                sum+= i;
            }
        }

        System.out.println(sum);
        
    }

    private static boolean isPrime(int num){
        if(num == 1){
            return false;
        }
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}