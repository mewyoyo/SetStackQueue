import java.util.ArrayDeque;

//15
public class PeekVariants {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.addLast(1);
        deque.addLast(2);
        deque.addLast(3);

        System.out.println(deque.peek());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
    }
}
