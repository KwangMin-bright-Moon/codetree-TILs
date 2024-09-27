import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        printSubsequenceNum(N);
    }


    public static void printSubsequenceNum(int num){
        int printNum = 1;
        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                if(printNum > 9){
                    printNum = 1;
                }
                System.out.print(printNum + " ");
                printNum++;
            }
            System.out.println();
        }
    }
}