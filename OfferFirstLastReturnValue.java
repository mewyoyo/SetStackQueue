import java.util.ArrayDeque;

//14
public class OfferFirstLastReturnValue {
    public static void main(String[] args){
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        boolean a = deque.offerFirst(1);
        boolean b = deque.offerLast(2);
        boolean c = deque.offerLast(3);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(deque);
    }
}
