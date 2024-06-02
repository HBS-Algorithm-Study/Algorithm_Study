import java.util.Scanner;

public class Boj12891 {
    static int[] dnaNum;
    static int[] dnaMin;
    static int dnaCheck;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int P = sc.nextInt();
        char[] dna = sc.next().toCharArray();

        int count = 0;
        dnaCheck = 0;
        dnaNum = new int[4];

        dnaMin = new int[4];
        for(int i=0; i<dnaMin.length; i++) {
            dnaMin[i] = sc.nextInt();
            if (dnaMin[i] == 0) dnaCheck++;
        }


        for(int i=0; i<P; i++){
            Add(dna[i]);
        }

        if (dnaCheck == 4) count++;

        // 슬라이딩 윈도우
        for (int i=P; i<S; i++) {
            int j = i - P;
            Add(dna[i]);
            Remove(dna[j]);
            if(dnaCheck == 4) count++;
        }

        System.out.println(count);
    }
    private static void Add(char c) {
        switch (c) {
            case 'A' :
                dnaNum[0]++;
                if(dnaNum[0] == dnaMin[0]) {
                    dnaCheck++;
                }
                break;
            case 'C' :
                dnaNum[1]++;
                if(dnaNum[1] == dnaMin[1]) {
                    dnaCheck++;
                }
                break;
            case 'G' :
                dnaNum[2]++;
                if(dnaNum[2] == dnaMin[2]) {
                    dnaCheck++;
                }
                break;
            case 'T' :
                dnaNum[3]++;
                if(dnaNum[3] == dnaMin[3]) {
                    dnaCheck++;
                }
                break;
        }
    }
    private static void Remove(char c) {
        switch (c) {
            case 'A' :
                if(dnaNum[0] == dnaMin[0]) {
                    dnaCheck--;
                }
                dnaNum[0]--;
                break;
            case 'C' :
                if(dnaNum[1] == dnaMin[1]) {
                    dnaCheck--;
                }
                dnaNum[1]--;
                break;
            case 'G' :
                if(dnaNum[2] == dnaMin[2]) {
                    dnaCheck--;
                }
                dnaNum[2]--;
                break;
            case 'T' :
                if(dnaNum[3] == dnaMin[3]) {
                    dnaCheck--;
                }
                dnaNum[3]--;
                break;
        }
    }
}