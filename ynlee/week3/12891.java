import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int S = Integer.parseInt(input[0]);
        int P = Integer.parseInt(input[1]);
        char[] dna = br.readLine().toCharArray();
        input = br.readLine().split(" ");
        
        int[] m_cnt = new int[4];
        for (int i = 0; i < 4; i++) m_cnt[i] = Integer.parseInt(input[i]);
        
        int[] c_cnt = new int[4];
        int v_cnt = 0;
        String bases = "ACGT";
        
        for (int i = 0; i < P; i++) c_cnt[bases.indexOf(dna[i])]++;
        
        if (c_cnt[0] >= m_cnt[0] && c_cnt[1] >= m_cnt[1] &&
            c_cnt[2] >= m_cnt[2] && c_cnt[3] >= m_cnt[3]) {
            v_cnt++;
        }
        for (int i = P; i < S; i++) {
            currentCounts[bases.indexOf(dna[i - P])]--;
            currentCounts[bases.indexOf(dna[i])]++;
            if (c_cnt[0] >= m_cnt[0] && c_cnt[1] >= m_cnt[1] &&
                c_cnt[2] >= m_cnt[2] && c_cnt[3] >= m_cnt[3]){
                v_cnt++;
            }
        }
        
        System.out.println(v_cnt);
    }
}
