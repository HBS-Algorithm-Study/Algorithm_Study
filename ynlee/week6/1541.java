import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String[] s = input.split("-");
        int result = 0;

        for (int i = 0; i < s.length; i++) {
            String[] additions = s[i].split("\\+");
            int tempSum = 0;
            for (String a : additions) {
                tempSum += Integer.parseInt(a);
            }
            if (i == 0) {
                result += tempSum;
            } else {
                result -= tempSum;
            }
        }

        System.out.println(result);
    }
}
