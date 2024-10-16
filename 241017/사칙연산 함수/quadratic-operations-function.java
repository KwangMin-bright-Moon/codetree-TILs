import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operator op = new Operator();

        int num1 = sc.nextInt();
        String operator = sc.next();
        int num2 = sc.nextInt();

        boolean isCalculable = op.isCalculable(operator);
        if(isCalculable == false){
            System.out.println("False");
            return;
        }

        int result = op.calculate(num1, num2, operator);
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }

    private static class Operator {
        List<String> opterators = Arrays.asList("+", "-", "*", "/");

        private boolean isCalculable(String operator){
            return opterators.contains(operator);
        }

        private int calculate(int num1, int num2, String operator){
                if(operator.equals("+")){
                    return num1 + num2;
                }
                if(operator.equals("-")){
                    return num1 - num2;
                }
                if(operator.equals("*")){
                    return num1 * num2;
                }
                if(operator.equals("/")){
                    return num1 / num2;
                }

                return 0;

        }
    }
}