import java.io.*;
import java.util.StringTokenizer;

public class DNA비밀번호_12891 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int dnaLen = Integer.parseInt(st.nextToken());    //DNA 문자열 크기
        int pwLen = Integer.parseInt(st.nextToken());    //비밀번호 문자열 크기

        String dnaStr = br.readLine();

        int[] minArr = new int[4];    // 최소 몇개가 필요한지
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<4; i++){
            minArr[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0, end = 0;
        int count = 0;
        int[] nowArr = new int[4];  //현재 비밀번호의 ACGT 개수
        //start가 가리킨 문자열을 포함시키기
        inputNowArr(dnaStr.charAt(start), nowArr);
        while(start <= dnaLen - pwLen){
            int nowPwLen = end - start + 1; //현재 잡고있는 윈도우 크기
            if(nowPwLen < pwLen){
                end++;
                inputNowArr(dnaStr.charAt(end), nowArr);
            }
            if(nowPwLen == pwLen){  // 현재 슬라이딩 윈도우 크기와 비밀번호 크기 같아짐
                if(checkArr(minArr, nowArr)){   //true면 비밀번호 만족함
                    count++;
                }
                outputNowArr(dnaStr.charAt(start), nowArr);
                start++;
                if(end == dnaLen - 1){
                    break;
                }
                end++;
                inputNowArr(dnaStr.charAt(end), nowArr);
            }
        }

        System.out.println(count);
    }

    public static void inputNowArr(char c, int[] nowArr){
        switch (c) {
            case 'A':
                nowArr[0]++;
                break;
            case 'C':
                nowArr[1]++;
                break;
            case 'G':
                nowArr[2]++;
                break;
            case 'T':
                nowArr[3]++;
                break;
            default:
                break;
        }
    }
    public static void outputNowArr(char c, int[] nowArr){
        switch (c) {
            case 'A':
                nowArr[0]--;
                break;
            case 'C':
                nowArr[1]--;
                break;
            case 'G':
                nowArr[2]--;
                break;
            case 'T':
                nowArr[3]--;
                break;
            default:
                break;
        }

    }

    public static boolean checkArr(int[] minArr, int[] nowArr){
        for(int i=0; i<4; i++){
            if(minArr[i]>nowArr[i]){
                return false;
            }
        }
        return true;
    }
    
}
