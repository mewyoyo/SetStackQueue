import java.util.ArrayDeque;

//13
public class AddFirstLast {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addLast(2);
        deque.addFirst(3);
        deque.addLast(4);

        System.out.println(deque);
    }
}
