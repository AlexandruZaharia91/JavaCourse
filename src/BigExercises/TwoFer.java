package BigExercises;

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
