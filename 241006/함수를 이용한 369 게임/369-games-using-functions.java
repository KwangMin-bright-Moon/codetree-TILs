import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

       int ctn = 0;
       for(int i = a; i <= b; i++){
        if(isMagicNum(i)){
            ctn++;
        }
       }

       System.out.println(ctn);
    }


    private static boolean is369(int num){
        String numStr = String.valueOf(num);

        return numStr.contains("3") ||  numStr.contains("6") || numStr.contains("9");
    }

    private static boolean isMagicNum(int num){
        if(num % 3 == 0 || is369(num)){
            return true;
        }else{
            return false;
        }
    }
}