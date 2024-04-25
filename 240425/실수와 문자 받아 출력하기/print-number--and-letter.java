import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char c = str.charAt(0);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.printf("%c\n%.2f\n%.2f", c, a, b);
    }
}