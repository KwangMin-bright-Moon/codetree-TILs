import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > b){
            int temp = a * b;
            System.out.println(temp);
        }else{
            int temp = a % b;
            System.out.println(temp);
        }
    }
}