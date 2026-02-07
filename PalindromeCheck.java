import java.util.ArrayDeque;

//20
public class PalindromeCheck {
    public static void main(String[] args) {

        String word = "level";

        ArrayDeque<Character> deque = new ArrayDeque<>();

        for (char c : word.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {
            char first = deque.pollFirst();
            char last = deque.pollLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }


    }
}
