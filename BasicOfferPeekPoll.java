import java.util.ArrayDeque;

//11
public class BasicOfferPeekPoll {
    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        System.out.println("Peek" + queue.peek());

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
