import java.util.*;

class bj11050{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        System.out.println(factorial(N)/(factorial(N-K)*factorial(K)));
    }

    public static int factorial(int x) {
        if(x == 0) return 1;
        return x * factorial(x-1);
    }
}