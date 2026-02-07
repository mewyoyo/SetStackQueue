import java.util.HashSet;

//5
public class BulkAdd {
    public static void main(String[] args) {
        HashSet<Integer> int1 = new HashSet<Integer>();
        HashSet<Integer> int2 = new HashSet<Integer>();

        int2.add(67);
        int2.add(22);
        int2.add(36);
        int2.add(49);

        int1.addAll(int2);

        System.out.println(int1);
    }

}
