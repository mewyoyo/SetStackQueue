//3

import java.sql.SQLOutput;
import java.util.HashSet;

public class SetSizeEmptiness {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();

        set.add(1);
        set.add(2);
        set.add(3);

        System.out.println("Set now");
        System.out.println("Set size:" + set.size());
        System.out.println("Is empty?" + set.isEmpty());
        set.clear();

        System.out.println("After clear");
        System.out.println("Size: " + set.size());
        System.out.println("Is empty? " + set.isEmpty());

    }
}
