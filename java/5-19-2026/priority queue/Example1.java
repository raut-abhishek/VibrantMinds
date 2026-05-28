import java.util.PriorityQueue;

public class Example1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        
        while(!q.isEmpty()){
            System.out.println(q.poll());
            System.out.println(q);
            System.out.println();
        }
    }
}
