import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int standardScore = 80;

        if(n >= standardScore){
            System.out.println("pass");
        }else{
            System.out.println(standardScore - n + " more score");
        }
    }
}