import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = 0;

        for(int i = a; i < b + 1; i++){
            if(isComleteNum(i)){
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    private static boolean isComleteNum(int num){
           if(num % 2 == 0){
                return false;
            }

            if(num % 10 == 5){
                return false;
            }

            if(num % 3 == 0 && num % 9 != 0){
                return false;
            }

        return true;
    }
}