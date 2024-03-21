package CollectionFramework.ArrayList;

import java.util.ArrayDeque;
import java.util.List;

public class PracticeArrayDeque {

    public static void main(String[] args) {

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.offerLast(11);
        deque.addAll(List.of(10,20,30));

        deque.offerFirst(55);
        deque.offerLast(99);

        //deque.poll();
        deque.pollLast();
        

        deque.forEach((x)-> System.out.println(x));
    }
}
