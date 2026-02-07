//1 Unique Integers

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<Integer>();

        int[] values = {1,2,2,3,4,4,4,5};
        for(int v:values){
            set.add(v);
        }

        System.out.println(set);

    }
}
