import java.util.*;
import java.time.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Y = sc.nextInt();
        int M = sc.nextInt();
        int D = sc.nextInt();

        ValidDateChecker vc = new ValidDateChecker(Y,M,D);
        if(!vc.isValid()){
            System.out.println(-1);
            return;
        }

        Season season = new Season();
        String s = season.getSeason(M);
        System.out.println(s);
    }

    public static class ValidDateChecker {
    private int year;
    private int month;
    private int day;

    public ValidDateChecker(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    boolean isValid(){
      
        try {
            LocalDate.of(year, month, day);
            return true;
        } catch(DateTimeException e){
            return false;
        }

    }
}

public static class Season {
    private String spring = "Spring";
    private String summer = "Summer";
    private String fall = "Fall";
    private String winter = "Winter";


    public String getSeason(int month){
        if(month >= 3 && month <= 5){
            return spring;
        }
          if(month >= 6 && month <= 8){
            return summer;
        }
          if(month >= 9 && month <= 11){
            return fall;
        }

        return winter;

    }
}

}