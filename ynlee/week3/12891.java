import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        String dna = br.readLine();
        
        int[] minCounts = new int[4];
        int[] currentCounts = new int[4]; 
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            minCounts[i] = Integer.parseInt(st.nextToken());
        }

        int validCount = 0;
        
        for (int i = 0; i < P; i++) {
            switch (dna.charAt(i)) {
                case 'A': currentCounts[0]++; break;
                case 'C': currentCounts[1]++; break;
                case 'G': currentCounts[2]++; break;
                case 'T': currentCounts[3]++; break;
            }
        }
        
        int matches = 0;
        for (int i = 0; i < 4; i++) {
            if (currentCounts[i] >= minCounts[i]) matches++;
        }
        if (matches == 4) validCount++;
        
        for (int i = P; i < S; i++) {
            int start = i - P;
            switch (dna.charAt(i)) {
                case 'A': if (++currentCounts[0] == minCounts[0]) matches++; break;
                case 'C': if (++currentCounts[1] == minCounts[1]) matches++; break;
                case 'G': if (++currentCounts[2] == minCounts[2]) matches++; break;
                case 'T': if (++currentCounts[3] == minCounts[3]) matches++; break;
            }
            switch (dna.charAt(start)) {
                case 'A': if (currentCounts[0]-- == minCounts[0]) matches--; break;
                case 'C': if (currentCounts[1]-- == minCounts[1]) matches--; break;
                case 'G': if (currentCounts[2]-- == minCounts[2]) matches--; break;
                case 'T': if (currentCounts[3]-- == minCounts[3]) matches--; break;
            }
            if (matches == 4) validCount++;
        }
        
        System.out.println(validCount);
    }
}
