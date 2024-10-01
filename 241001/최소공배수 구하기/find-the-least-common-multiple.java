import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        findGcd(a,b);
    }

    private static int findGcp(int a, int b){
        int result = a % b;

        if (result == 0){
            return b;
        }

        return findGcp(b, result);
    }

    private static void findGcd(int a, int b){
        int gcp = findGcp(a, b);
        System.out.println((a * b) / gcp);
    }
}