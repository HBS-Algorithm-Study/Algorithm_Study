package study_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 소트인사이드_1427 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        

        char[] arr = N.toCharArray();
        int len = N.length();
        
        for(int i=0; i<len-1; i++){
            int maxIndex = i;
            for(int j=i; j<len; j++){
                if(arr[maxIndex] < arr[j]){
                    maxIndex = j;
                }
            }
            char temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
        for(int i=0; i<len; i++){
            System.out.print(Integer.parseInt(arr[i]+""));
        }
        


    }
    
}
