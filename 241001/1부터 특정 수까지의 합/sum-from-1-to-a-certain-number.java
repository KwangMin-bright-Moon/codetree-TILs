import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int result = calculate(num);
        System.out.println(result);
    }

    private static int calculate(int num){
        int sum = 0;
        for(int i = 1; i <= num; i++){
            sum += i;
        }

        return sum / 10;

    }
}