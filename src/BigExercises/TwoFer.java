package BigExercises;

/*
        Two-fer or 2-fer is short for two for one. One for you and one for me.

        Given a name, return a string with the message:

        One for name, one for me.
        Where "name" is the given name.

        However, if the name is missing, return the string:

        One for you, one for me.
        Here are some examples:

        Name	String to return
        Alice	One for Alice, one for me.
        Bob	One for Bob, one for me.
        One for you, one for me.
        Zaphod	One for Zaphod, one for me.
 */


public class TwoFer {
    static String x = null;
    public static void main(String[] args) {
        TwoFer ex = new TwoFer();
        System.out.println(ex.sentence("Ana"));
        System.out.println(ex.sentence(null));
    }



    public String sentence(String name) {
        String sentence;
        if(name == null) {
            sentence = "One for you, one for me";
        }else{
            sentence = "One for "+name+", one for me";
        }
        return sentence;
    }
}
