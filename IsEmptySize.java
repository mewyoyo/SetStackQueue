import java.util.ArrayDeque;

//18
public class IsEmptySize {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        System.out.println(deque.isEmpty());
        System.out.println(deque.size());

        deque.addFirst(1);
        deque.addLast(2);

        System.out.println(deque.isEmpty());
        System.out.println(deque.size());

        deque.poll();

        System.out.println(deque.isEmpty());
        System.out.println(deque.size());

        deque.clear();

        System.out.println(deque.isEmpty());
        System.out.println(deque.size());

    }
}
