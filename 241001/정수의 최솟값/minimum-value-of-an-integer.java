import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = minNum(a, b, c);
        System.out.println(result);

    }

    private static int minNum(int a, int b, int c){
        return Math.min(Math.min(a, b), c);
    }
}