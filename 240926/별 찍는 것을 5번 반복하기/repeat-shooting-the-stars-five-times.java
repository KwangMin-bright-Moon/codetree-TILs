public class Main {
    public static void main(String[] args) {
        print10Star(5);
    }

    public static void print10Star(int loop){
        for(int i = 0; i < loop; i++){
            System.out.print("**********");
            System.out.println();
        }
    }
}