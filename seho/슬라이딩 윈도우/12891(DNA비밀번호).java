//7시 25분 시작
//9시 22분 끝
// {A, C, G, T}
// A,C,G,T,변수를 0으로 초기화
// DEQUE를 만들어 DEQUE 최대 길이를 P로 제한
// 처음부터 순차적으로 돌며 각각의 문자가 몇개인지 카운터하고
// 조건에 부합하면 정답 카운터를 1 씩 증가
// DNA 비밀번호
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();       //문자열의 길이
        int P = sc.nextInt();       //부분문자열의 길이
        String[] arr = sc.next().split("");
        int A = sc.nextInt();
        int C = sc.nextInt();
        int G = sc.nextInt();
        int T = sc.nextInt();
        
        int a = 0;
        int c = 0;
        int g = 0;
        int t = 0;

        int len = 0;
        int s = 0;
        int e = 0;
        int ans =0;
        
        while(e<S){ // S길이만큼 반복 처음에 P라 적어놔서 시간 30분은 뺏긴듯
            // String을 표현할때는 "" 쓰고 char을 표현할때는 ''을 쓴다
            // 문자열 비교에 사용되는 "==" 연산자는 문자열의 실제 내용을 비교하는것이 아니라
            // 문자열의 참조(메모리 주소)를 비교한다
            // 따라서 문자열 비교에는 "equals()" 메서드를 사용해야 한다
            if(arr[e].equals("A")) a++;        
            else if(arr[e].equals("C")) c++;    //인덱스 0 인경우를 고려해서 처음 반복문 시작때 arr[e]랑 일치하는 알파벳 수 증가 
            else if(arr[e].equals("G")) g++;
            else if(arr[e].equals("T")) t++;
            if(len<P) len++;

            if(len==P){
                if(a>=A && c>=C && g>=G && t>=T) ans++; //일치하면 ans증가
                if(arr[s].equals("A")) a--;
                else if(arr[s].equals("C")) c--;        //arr[s]와 비교 후 해당 알파뱃 수 감소
                else if(arr[s].equals("G")) g--;
                else if(arr[s].equals("T")) t--;
                s++;                                    //알파벳 먼저 감소 후 s증가
            }
            e++;    // e 증가는 마지막에 한번만 하면 된다 이거때메 20분 뺏긴듯
        }
        System.out.println(ans);
        //배열을 출력하려면 Arrays.toString() 메소드 사용하면 된다.
        System.out.println(Arrays.toString(arr));
    }
}