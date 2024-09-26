import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int col = sc.nextInt();
        int row = sc.nextInt();

        printRect(col, row);
    }

    public static void printRect(int row, int col){
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(1);
            }
            System.out.println();
        }
    }
}