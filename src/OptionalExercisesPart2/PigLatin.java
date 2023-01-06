package OptionalExercisesPart2;

public class PigLatin {
    final char[] vowel = {'a', 'e', 'i', 'o', 'u', 'ă', 'î'};
    String[] newWord = new String[1];
    String vowelToString = new String(vowel);
    char[] newValue;


    public static void main(String[] args) {
        PigLatin start = new PigLatin();
        start.checkWord("string");

    }

    public void checkWord(String word) {
        if (vowel(word) != null) {
            System.out.println("new word is: " + vowel(word));
        } else if (consonant(word) != null && vowelToString.contains("" + word.charAt(1) + "")) {
            System.out.println("new word is: " + consonant(word));
        } else if (consonantAndQu(word) != null) {
            System.out.println("new word is: " + consonantAndQu(word));
        } else if (consonantWithY(word) != null) {
            System.out.println(consonantWithY(word));
        }
    }


    public String vowel(String word) {
        for (char elem : vowel) {
            if (word.charAt(0) == elem) {
                newWord[0] = word + "ay";
                break;
            }
        }
        if ((word.charAt(0) == 'x' && word.charAt(1) == 'r') || (word.charAt(0) == 'y' && word.charAt(1) == 't')) {
            newWord[0] = word + "ay";
        }
        return newWord[0];
    }


    public String consonant(String word) {
        if (!(vowelToString.contains("" + word.charAt(0) + "")) && vowelToString.contains("" + word.charAt(1) + "")) {
            newValue = word.toCharArray();
            newValue[0] = ' ';
            newWord[0] = String.valueOf(newValue) + "" + word.charAt(0) + "" + "ay";
        } else if (word.length() > 3 && !(vowelToString.contains("" + word.charAt(0) + "") && vowelToString.contains("" + word.charAt(1) + ""))
                && !(word.charAt(2) == 'u')) {
            newValue = word.toCharArray();
            newValue[0] = ' ';
            newValue[1] = ' ';
            newWord[0] = String.valueOf(newValue) + "" + word.charAt(0) + "" + "" + word.charAt(1) + "" + "ay";
        }
        return newWord[0];
    }

    public String consonantAndQu(String word) {
        newValue = word.toCharArray();
        if (word.length() > 3 && !(vowelToString.contains("" + word.charAt(0) + "") && vowelToString.contains("" + word.charAt(1) + ""))
                && (word.charAt(2) == 'u')) {
            newValue[0] = ' ';
            newValue[1] = ' ';
            newValue[2] = ' ';
            newWord[0] = String.valueOf(newValue) + "" + word.charAt(0) + "" + "" + word.charAt(1) + "" + "" + word.charAt(2) + "" + "ay";
        }
        return newWord[0];
    }

    public String consonantWithY(String word) {
        newValue = word.toCharArray();
        for (int i = 0; i < newValue.length; i++) {
            if (newValue[i] == 'y') {
                if (!(vowelToString.contains("" + word.charAt(i - 1) + "") && vowelToString.contains("" + word.charAt(i + 1) + ""))) {
                    newValue = word.toCharArray();
                    newValue[0] = ' ';
                    newValue[1] = ' ';
                    newWord[0] = String.valueOf(newValue) + "" + word.charAt(0) + "" + "" + word.charAt(1) + "" + "ay";
                } else if (!(vowelToString.contains("" + word.charAt(i - 2) + "") && vowelToString.contains("" + word.charAt(i - 1) + ""))) {
                    newValue = word.toCharArray();
                    newValue[0] = ' ';
                    newValue[1] = ' ';
                    newWord[0] = String.valueOf(newValue) + "" + word.charAt(0) + "" + "" + word.charAt(1) + "" + "ay";
                }
            }
        }
        return newWord[0];
    }


}
