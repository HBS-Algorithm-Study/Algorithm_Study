import java.lang.*;
import java.util.*;

public class bj1541 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        String[] minus = s.split("-");
        
        int result = allCal(minus[0]);
        
        for (int i = 1; i < minus.length; i++) {
            result -= allCal(minus[i]);
        }

        System.out.println(result);
    }

    private static int allCal(String s) {
        String[] plus = s.split("\\+");
        int sum = 0;
        for (String num : plus) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}