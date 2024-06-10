import java.util.*;

class 절댓값힙11286 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int op = sc.nextInt();
            if(op==0){
                if(li.isEmpty()) System.out.println(0);
                else{
                    int absMin = Math.abs(li.get(0));
                    int minI = 0;
                    int index = 0;
                    for (int j = 0; j < li.size(); j++) {
                        if(Math.abs(li.get(j))<=absMin){
                            absMin = Math.abs(li.get(j));
                            index = j;
                            if(li.get(j)<0) minI = j;
                        }
                    }
                    int c1 = Collections.frequency(li,absMin);
                    int c2 = Collections.frequency(li,-absMin);
//                    System.out.println("c1 :"+c1);
//                    System.out.println("c2 :"+c2);
                    if(c1+c2>1){
                        System.out.println(li.remove(minI));
//                        System.out.println("아");
                    }else {
                        System.out.println(li.remove(index));
                    }
                }
            }else {
                li.add(op);
            }
//            System.out.println("li: "+li);
        }
    }
}

class 절댓값힙 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1,o2)->{
            int f = Math.abs(o1);
            int s= Math.abs(o2);
            if(f==s){
                return o1>o2 ? 1:-1;
            }
            return f-s;
        });
        for (int i = 0; i < N; i++) {
            int op = sc.nextInt();
            if(op==0){
                if(queue.isEmpty()) System.out.println(0);
                else{
                    System.out.println(queue.poll());
                }
            }else {
                queue.add(op);
            }
        }

    }
}

