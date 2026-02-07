//4

import java.util.HashSet;

public class RemoveElements {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<String>();

        names.add("Rani");
        names.add("Jasmin");
        names.add("Finn");
        names.add("Pie");
        names.add("Hacker");

        System.out.println("Before removing: " + names);

        boolean removed = names.remove("Hacker");

        if (removed) {
            System.out.println("Hacker is removed");
        } else {
            System.out.println("Nothing to remove");
        }

        System.out.println("After removing: " + names);
    }
}
