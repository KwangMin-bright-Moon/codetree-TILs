import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = 0;

        for(int i = a; i < b + 1; i++){
            if(isPrime(i) && isSumEven(i)){
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    private static boolean isPrime(int num){
        if(num == 1){
            return false;
        }

        if(num == 2){
            return true;
        }

        if(num % 2 == 0){
            return false;
        }

        for(int i = 3; i < Math.sqrt(num); i += 2){
            if(num % i == 0){
                return false;
            }
        }

        return true;
    }


    private static boolean isSumEven(int num){
        int sum = 0;
        int temp = num;
        while(temp > 10){
             sum += temp % 10;
            temp = temp / 10;
           
        }
        sum += temp;
        return sum % 2 == 0;
    }
}