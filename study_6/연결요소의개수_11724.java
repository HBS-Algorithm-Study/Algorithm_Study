package study_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 연결요소의개수_11724 {
    public static ArrayList<Integer>[] list;
    public static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        visited = new boolean[N+1];

        list = new ArrayList[N+1];

        for(int i=1; i<=N; i++){ //각 노드의 인접 리스트 생성해주기
            list[i] = new ArrayList<>();
        }

        for(int i=0; i<M; i++){ //간선 입력 후 arraylist에 add
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            list[u].add(v);
            list[v].add(u);

        }

        // 초기화
        int count = 0;
        for(int i=1; i<=N; i++){
            if(!visited[i]){
                count ++;
                DFS(i);
            }
        }

        System.out.println(count);
    }

    private static void DFS(int v){
        if(visited[v]){ //방문한 노드이면
            return;
        }
        visited[v] = true;
        for(int i : list[v]){
            if(!visited[i]){
                DFS(i);
            }
        }
    }
}