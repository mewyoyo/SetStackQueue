import java.util.HashSet;

//9
public class DeduplicateWords {
    public static void main(String[] args) {
        String sentence = "I like Hatsune Miku Miku Hatsune";
        HashSet<String> words = new HashSet<String>();
        String[] wordArray = sentence.split(" ");

        for (String word : wordArray) {
            words.add(word);
        }

        System.out.println(words);
    }

}
