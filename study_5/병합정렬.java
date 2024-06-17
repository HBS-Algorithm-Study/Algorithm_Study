package study_5;

import java.util.Arrays;

public class 병합정렬 {
    public static int[] src;
    public static int[] tmp;

    public static void main(String[] args) {
        src = new int[]{1, 9, 8, 5, 4, 2, 3, 7, 6};
        tmp = new int[src.length];  // 임시배열

        printArray(src);
        mergeSort(0, src.length-1);
        printArray(src);
    }

    public static void mergeSort(int start, int end) {  // start, end는 유효한 인덱스값
        if (start < end) {  //최소 배열이 될 때까지
            int mid = (start + end) / 2;
            mergeSort(start, mid);
            mergeSort(mid + 1, end);
            merge(start, mid, end);
        }
    }

    public static void merge(int start, int mid, int end) {
        int p = start;
        int q = mid + 1;
        int index = start;

        while (p <= mid && q <= end) {  //둘 중 하나라도 끝나면 while문 끝
            if (src[p] <= src[q]) {
                tmp[index++] = src[p++];
            } else {
                tmp[index++] = src[q++];
            }
        }

        //왼쪽이 끝나고 오른쪽은 아직 남은 경우, 나머지를 순서대로 넣으면 됨
        while (p>mid && q<=end) {
            tmp[index++] = src[q++];
        }

        //오른쪽이 끝나고 왼쪽이 아직 남은 경우
        while (q>end && p<=mid) {
            tmp[index++] = src[p++];
        }

        // 정렬된 임시배열을 원래 배열에 넣기
        for (int i = start; i <= end; i++) {
            src[i] = tmp[i];
        }
    }

    public static void printArray(int[] a) {
        System.out.println(Arrays.toString(a));
    }
}
