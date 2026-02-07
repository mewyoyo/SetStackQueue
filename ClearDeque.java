import java.util.ArrayDeque;

//19
public class ClearDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.add(1);
        deque.add(2);
        deque.add(3);

        System.out.println(deque.peek());
        System.out.println(deque.isEmpty());

        deque.clear();

        System.out.println(deque.peek());
        System.out.println(deque.isEmpty());
    }
}
