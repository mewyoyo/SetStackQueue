import java.util.ArrayDeque;
import java.util.Stack;

//17
public class RemoveFirstLastOccurrence {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();

        deque.add("A");
        deque.add("B");
        deque.add("C");
        deque.add("B");
        deque.add("A");

        deque.removeFirstOccurrence("B");
        System.out.println(deque);

        deque.removeLastOccurrence("A");
        System.out.println(deque);
    }
}
