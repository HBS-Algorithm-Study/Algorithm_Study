import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        char[] a = input.toCharArray();

        Arrays.sort(a);
        // Arrays.sort(a, Collections.reverseOrder());
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i]);
        }

        sc.close();
    }
}
