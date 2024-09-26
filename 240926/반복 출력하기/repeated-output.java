import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        printLine(line);
    }

    public static void printLine(int line){
        for(int i = 0; i < line; i++){
            System.out.println("12345^&*()_");
        }
    }
}