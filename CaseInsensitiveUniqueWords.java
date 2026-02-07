import java.util.HashSet;

//10
public class CaseInsensitiveUniqueWords {
    public static void main(String[] args) {
        String sentence = "Miku miku MIKU Hatsune hatsune HATSUNE";

        HashSet<String> duplicates = new HashSet<String>();

        String[] words = sentence.split(" ");
        for (String word : words) {
            duplicates.add(word.toLowerCase());

        }
        System.out.println(duplicates);
    }
}
