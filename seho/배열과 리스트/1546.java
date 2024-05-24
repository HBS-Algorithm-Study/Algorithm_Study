import java.util.*; // 스캐너 사용을 위한 선언

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 스캐너 객체 생성
        int N = sc.nextInt(); // N 과목수 입력
        String buffer = sc.nextLine(); //개행 받아옴
        String[] scores = sc.nextLine().split(" "); // 공백으로 점수 받아옴
        int [] scoresInt = new int[N]; // N개만큼 정수형 배열 생성ㅜ
        for(int i=0; i<N ;i++){ // 정수형 배열로 전환
            scoresInt[i] = Integer.parseInt(scores[i]);
        }
        // 최대값 저장, double로 선언한 이유는 나눠줄때 정수/정수는 나머지가 버려지기 때문에 정수/실수, 실수/정수, 실수/실수 형태로 나눠야됨 
        double max = Arrays.stream(scoresInt).max().getAsInt(); 
        double sum = 0; // 실수형 변수 선언
        for(int i=0; i<scoresInt.length;i++){ // scoresInt길이만큼 반복
            sum += scoresInt[i]/max*100; // 점수 계산
        }
        System.out.println(sum/N);
    }
}