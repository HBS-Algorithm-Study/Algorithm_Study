package study_6;

import java.io.*;
import java.util.*;

public class 미로탐색_2178 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);

        int[][] arr = new int[N][M];

        for(int i=0; i<N; i++){
            String tmp = br.readLine();
            for(int j=0; j<M; j++){
                arr[i][j] = tmp.charAt(j)-'0';
                //substring 사용시 런타임에러 발생
            }
        }

        boolean[][] visited = new boolean[N][M];

        Deque<int[]> queue = new LinkedList<>();

        //시작 위치
        visited[0][0] = true;
        queue.add(new int[]{0, 0, 1});

        int[] dN = {1, -1, 0, 0};
        int[] dM = {0, 0, 1, -1};

        while(!queue.isEmpty()){
            int[] now = queue.poll();

            for(int i=0; i<4; i++){
                int nN = now[0]+dN[i];
                int nM = now[1]+dM[i];

                if(nN>=0 && nN<N && nM>=0 && nM<M && !visited[nN][nM] && arr[nN][nM]==1 ){
                    if(nN == N-1 && nM == M-1){
                        System.out.println(now[2]+1);
                        return;
                    }
                    queue.add(new int[]{nN, nM, now[2]+1});
                    visited[nN][nM] = true;
                }
            }
        }




    }
}
