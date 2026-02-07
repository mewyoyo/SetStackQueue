import java.util.ArrayDeque;

//16
public class PollVariants {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.addLast(1);
        deque.addLast(2);
        deque.addLast(3);

        System.out.println(deque.poll());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());


        System.out.println(deque.isEmpty());
    }
}
