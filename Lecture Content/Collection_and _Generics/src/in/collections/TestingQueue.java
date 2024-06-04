package in.collections;

import java.util.LinkedList;
import java.util.Queue;

public class TestingQueue {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();

        que.add(10);
        que.offer(12);
        utilify.print(que);
        System.out.println("--------------");
        System.out.println(que.peek());
        System.out.println("--------------");
        System.out.println(que.element());
        System.out.println("--------------");
        System.out.println(que.remove());
        System.out.println("--------------");
        utilify.print(que);

        System.out.println(que.poll());


    }

}
