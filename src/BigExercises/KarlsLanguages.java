package BigExercises;

import java.util.ArrayList;
import java.util.List;

public class KarlsLanguages {
    private final List<String> languages = new ArrayList<>();

    public static void main(String[] args) {

    }

    public boolean isEmpty() {
        boolean empty = false;
        if(languages.isEmpty()){
            empty = true;
        }
        return empty;
    }

    public void addLanguage(String language) {
        languages.add(language);
    }

    public void removeLanguage(String language) {
        languages.remove(language);
    }

    public String firstLanguage() {
        return languages.get(0);
    }

    public int count() {
        return languages.size();
    }

    public boolean containsLanguage(String language) {
        return languages.contains(language)? true:false;
    }

    public boolean isExciting() {
        boolean isExciting = false;
        for(String language : languages){
            if(language.equals("Java") || language.equals("Kotlin")){
                isExciting = true;
            }
        }
        return isExciting;
    }
}
