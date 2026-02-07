import java.util.HashSet;

//6
public class BulkRemove {
    public static void main(String[] args) {
        HashSet<Integer> setA = new HashSet<Integer>();
        HashSet<Integer> setB = new HashSet<Integer>();

        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);

        setB.add(2);
        setB.add(4);
        setB.add(6);

        System.out.println("Before removeAll: " + setA);

        setA.removeAll(setB);

        System.out.println("After removeAll: " + setA);
    }
}
