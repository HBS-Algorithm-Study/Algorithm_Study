import java.util.*;
class Solution {
    public static int solution(String begin, String target, String[] words){
        boolean[] visited = new boolean[words.length];
        Deque<String[]> queue = new LinkedList<>();

        queue.add(new String[]{begin, "0"});
        while(!queue.isEmpty()){
            String[] strArr = queue.poll();
            String nowStr = strArr[0];
            int nowLength = Integer.parseInt(strArr[1]);

            if(nowStr.equals(target)){
                return nowLength;
            }

            for(int i=0; i<words.length; i++){
                if(!visited[i] && oneDiff(nowStr, words[i])){   // 방문하지 않았고 두 문자열이 한글자만 차이난다면
//                    System.out.println(nowStr+", "+words[i]);
                    queue.add(new String[]{words[i], String.valueOf(nowLength+1)});
                    visited[i] = true;
                }
            }


        }


        return 0;
    }

    public static boolean oneDiff(String str1, String str2){
        int count = 0;
        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i) != str2.charAt(i))
                count++;
        }
        if(count == 1)
            return true;
        else return false;
    }

}
