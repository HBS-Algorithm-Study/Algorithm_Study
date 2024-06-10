import java.util.Scanner;

public class Boj12891_2 {
    static int[] dnaNum;
    static int[] dnaMin;
    static int dnaCheck;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();       // 문자열의 길이
        int P = sc.nextInt();       // 부분 문자열의 길이
        char[] dna = sc.next().toCharArray();   // 주어진 DNA 문자열

        int count = 0;  // 만들 수 있는 비밀번호 종류의 수
        dnaCheck = 0;   // 각 DNA의 개수가 조건을 충족하는지 체크. 모두 충족하면 4
        dnaNum = new int[4];    // 각 DNA의 개수를 담은 배열

        dnaMin = new int[4];    // 각 DNA의 최소 개수를 담은 배열
        for(int i=0; i<dnaMin.length; i++) {
            dnaMin[i] = sc.nextInt();
            if (dnaMin[i] == 0) dnaCheck++;     // 만약 요구된 DNA의 최소 개수가 0이면 dnaCheck++
        }

        for(int i=0; i<P; i++){     // 부분 문자열 처음 받을 때 세팅
            Add(dna[i]);
        }
        if (dnaCheck == 4) count++;     // 각 DNA의 조건을 충족하면 count++

        // 슬라이딩 윈도우
        for (int i=P; i<S; i++) {   // i : 부분 문자열의 가장 마지막 부분
            int j = i - P;          // j : 부분 문자열의 가장 첫 부분
            Add(dna[i]);            // 이전 윈도우의 다음 부분을 Add
            Remove(dna[j]);         // 이전 윈도우의 가장 앞 부분을 Remove
            if(dnaCheck == 4) count++;
        }

        System.out.println(count);
    }

    private static void Add(char c) {   // Add : 현재 상태 배열에 넣기
        switch (c) {
            case 'A' :
                dnaNum[0]++;    // 현재 A의 개수++
                if(dnaNum[0] == dnaMin[0]) {
                    dnaCheck++;     // 현재 A의 개수와 요구된 A의 개수가 같으면 dnaCheck++
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
    private static void Remove(char c) {    // Remove : 현재 상테 배열에서 빼기
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
