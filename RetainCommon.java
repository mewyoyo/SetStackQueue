import java.util.HashSet;

//7
public class RetainCommon {
    public static void main(String[] args) {
        HashSet<Integer> setX = new HashSet<Integer>();
        HashSet<Integer> setY = new HashSet<Integer>();

        setX.add(9);
        setX.add(6);
        setX.add(7);
        setX.add(5);

        setY.add(6);
        setY.add(7);
        setY.add(0);

        System.out.println("Set X before retain: " + setX);

        setX.retainAll(setY);

        System.out.println("Set X after retain: " + setX);
    }
}
