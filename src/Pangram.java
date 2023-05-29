import java.util.HashSet;
import java.util.Set;

public class Pangram {

    public static void main(String[] args) {

        String sentence= "The five boxing wizards jump quickly";
        System.out.println(checkIfPangram(sentence) );
    }


    public static boolean checkIfPangram(String sentence){
        int count = 0;
        char [] sentence2 = sentence.toCharArray();
        Set<Character> sentence3 = new HashSet<Character>();
        for(char t : sentence2){
            sentence3.add(t);
        }
        return sentence3.size() == 27;

    }
}