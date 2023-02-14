package BigExercises;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RotationalCipher {
    private Map<String, Integer> elements = new HashMap<>();
    private Map<Integer, String> elementsInvers = new HashMap<>();
    String alfabet = "abcdefghijklmnopqrstuvwxyz";

    public RotationalCipher() {
        for (int i = 0; i < 26; i++) {
            elements.put(String.valueOf(alfabet.charAt(i)), i);
            elementsInvers.put(i, String.valueOf(alfabet.charAt(i)));
        }
        System.out.println(elements.toString());
        System.out.println(elementsInvers.toString());
    }

    public static void main(String[] args) {
        RotationalCipher rot = new RotationalCipher();
        System.out.println(rot.encryptedWord(13, "a'a'a'a'ac'b'dc's'dwcnscjdc'''''sc,dmncbnd"));
    }


    public String encryptedWord(int key, String word) {
        StringBuilder add = new StringBuilder();
        for (int j = 0; j < word.length(); j++) {
            int value;
            if (Character.isLetter(word.toLowerCase().charAt(j))) {
                value = (elements.get(String.valueOf(word.toLowerCase().charAt(j))) + key) % 26;
                add.append(elementsInvers.get(value));
            } else if (word.toLowerCase().charAt(j) == '\''  || word.toLowerCase().charAt(j) == ' ' || word.toLowerCase().charAt(j) == '!'
                    || word.toLowerCase().charAt(j) == '?' || word.toLowerCase().charAt(j) == ',' ){
                add.append(word.charAt(j));
            }else if (Character.isDigit(word.toLowerCase().charAt(j))){
                    add.append(word.charAt(j));
            }else{
                add.append(" ");
            }
        }
       return add.toString();
}
}
