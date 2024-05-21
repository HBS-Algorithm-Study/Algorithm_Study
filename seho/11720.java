import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 스캐너 객체 생성
        int num = sc.nextInt(); // N숫자 입력, 숫자 반환
        String buffer= sc.nextLine(); //개행 받아옴
        String digits = sc.nextLine(); // 한줄을 문자열로 반환
        String[] digitArray = digits.split(""); // 각 문자 하나씩 string 배열로 반환
        int sum = 0; // 숫자 합을 담을 int형 변수 선언
        for(int i=0; i<digitArray.length; i++){ // digitArray 길이만큼 반복
                sum+=Integer.parseInt(digitArray[i]); //배열에 있는 문자열을 숫자로 변환
        }
        System.out.println(sum); // 합 출력
    }
}