import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj12891 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        char[] dna = br.readLine().toCharArray();   // DNA 문자열
        int[] dnaMin = new int[4];              // DNA 최소 개수

        int count = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < dnaMin.length; i++) {
            dnaMin[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < S-P+1; i++) {    // S-P == 슬라이딩 횟수-1
            int[] dnaCount = new int[4];    // 부분 문자열에 있는 각 DNA의 개수
            for (int j = i; j < P+i; j++){
                switch (dna[j]) {
                    case 'A':
                        dnaCount[0]++;
                        break;
                    case 'C':
                        dnaCount[1]++;
                        break;
                    case 'G':
                        dnaCount[2]++;
                        break;
                    case 'T':
                        dnaCount[3]++;
                        break;
                }
                if (Arrays.equals(dnaCount, dnaMin)) {
                    count++;
                }
            }
        }
        bw.write(String.valueOf(count));

        br.close();
        bw.close();
    }
}