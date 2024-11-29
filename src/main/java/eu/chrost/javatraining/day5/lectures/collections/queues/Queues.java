package eu.chrost.javatraining.day5.lectures.collections.queues;

import java.util.ArrayDeque;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("Hello");
        queue.add("World");
        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
