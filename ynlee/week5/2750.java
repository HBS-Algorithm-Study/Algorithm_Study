import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Integer[] numbers = new Integer[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers, (a, b) -> a - b);
        Arrays.stream(numbers).forEach(System.out::println);
        //     Arrays.stream(numbers).sorted().forEach(System.out::println);
    }
}

