import java.util.HashSet;

//8
public class ContainsAll {
    public static void main(String[] args) {
        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();

        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);

        setB.add(2);
        setB.add(4);

        boolean contains = setA.containsAll(setB);

        if (contains) {
            System.out.println("Contains All");
        } else {
            System.out.println("Not Contains");
        }
    }
}
