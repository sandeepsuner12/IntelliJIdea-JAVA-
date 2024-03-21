package CollectionFramework.ArrayList;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PracticePriorityQueue implements Comparator<Integer> {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(10);
        pq.offer(15);
        pq.offer(3);
        pq.offer(85);
        pq.offer(30);
        pq.offer(75);
        pq.offer(50);
        pq.offer(152);

        pq.poll();


        pq.forEach((x)-> System.out.println(x));

        System.out.println("-------------------------------------------");
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(new PracticePriorityQueue());

        pq2.offer(10);
        pq2.offer(15);
        pq2.offer(30);
        pq2.offer(3);
        pq2.offer(85);
        pq2.offer(75);
        pq2.offer(50);
        pq2.offer(152);

        pq2.poll();


        pq2.forEach((x)-> System.out.println(x));




    }

    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1<o2) return 1;
        else if (o1>o2) return -1;
        else return 0;
    }
}
