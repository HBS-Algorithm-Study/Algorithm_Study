import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] Line = br.readLine().split(" ");
        int S = Integer.parseInt(Line[0]);
        int P = Integer.parseInt(Line[1]);
        
        String str = br.readLine();
        
        String[] count = br.readLine().split(" ");
        int[] minCount = new int[4];
        for (int i = 0; i < 4; i++) {
            minCount[i] = Integer.parseInt(count[i]);
        }

    
        int validPasswords = 0;

        int[] currentCount = new int[4];

        for (int i = 0; i < P; i++) {
            char ch = str.charAt(i);
            if (ch == 'A') currentCount[0]++;
            else if (ch == 'C') currentCount[1]++;
            else if (ch == 'G') currentCount[2]++;
            else if (ch == 'T') currentCount[3]++;
        }

        boolean isValid = true;
        for (int k = 0; k < 4; k++) {
            if (currentCount[k] < minCount[k]) {
                isValid = false;
                break;
            }
        }
        if (isValid) {
            validPasswords++;
        }

        for (int i = P; i < S; i++) {
            char newChar = str.charAt(i);
            if (newChar == 'A') currentCount[0]++;
            else if (newChar == 'C') currentCount[1]++;
            else if (newChar == 'G') currentCount[2]++;
            else if (newChar == 'T') currentCount[3]++;

            char oldChar = str.charAt(i - P);
            if (oldChar == 'A') currentCount[0]--;
            else if (oldChar == 'C') currentCount[1]--;
            else if (oldChar == 'G') currentCount[2]--;
            else if (oldChar == 'T') currentCount[3]--;

            isValid = true;
            for (int k = 0; k < 4; k++) {
                if (currentCount[k] < minCount[k]) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                validPasswords++;
            }
        }
        System.out.println(validPasswords);
    }
}