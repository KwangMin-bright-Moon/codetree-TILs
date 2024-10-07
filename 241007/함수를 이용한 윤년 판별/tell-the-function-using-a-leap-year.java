import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        
        // 윤년인지 확인한다.
        boolean result = isYear(y);

        // 결과를 출력한다.
        System.out.println(result);
    }

    private static boolean isYear(int y){
        if(y >= 100 && y % 100 == 0 && y % 400 != 0){
            return false;
        }

        return y % 4 == 0;
    }
}