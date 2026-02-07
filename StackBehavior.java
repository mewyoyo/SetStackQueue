import java.util.ArrayDeque;

//12
public class StackBehavior {
    public static void main(String[] args) {
        ArrayDeque<String> stack = new ArrayDeque<String>();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
