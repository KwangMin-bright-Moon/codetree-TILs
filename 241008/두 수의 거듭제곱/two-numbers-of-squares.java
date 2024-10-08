import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int a = sc.nextInt();
       int b = sc.nextInt();

        System.out.println(cal(a,b));
    }

    private static int cal(int a, int b){
        int temp = a;
        for(int i = 0; i < b-1; i++){
            a *=temp;
        }
        return a;
    }
}