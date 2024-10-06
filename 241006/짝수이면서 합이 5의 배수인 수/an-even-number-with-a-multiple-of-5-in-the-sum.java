import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        checkNumber(num);
    }

    private static boolean checkNumber(int num){
        if(num % 2 != 0){
            System.out.println("No");
            return false;
        }

        int ten = num / 10;
        int one = num % 10;
        int sum = ten + one;

        if(sum % 5 !=0){
            System.out.println("No");
            return false;
        }

        System.out.println("Yes");
        return true;
    }
}