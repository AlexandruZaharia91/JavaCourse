package BigExercises;


public class LogLevels {

    public static void main(String[] args) {
        System.out.println(message("[ERROR]: \t Corrupt disk\t \t \r\n"));
        System.out.println(logLevel("[ERROR]: \t Corrupt disk\t \t \r\n"));
        System.out.println(reformat("[ERROR]: \t Corrupt disk\t \t \r\n"));
    }

    public static String message(String logLine) {
        String[] elements = logLine.replaceAll("(\r\n\n)","").split(":");
        return elements[1].trim();
    }
    public static String logLevel(String logLine) {
        String[] elements = logLine.split(":");
        StringBuilder string1 = new StringBuilder();
        for(int i =1; i< elements[0].length()-1;i++){
            string1.append(elements[0].charAt(i));
        }
        return string1.toString().toLowerCase();
    }
    public static String reformat(String logLine) {

        return message(logLine) + " " + "(" +logLevel(logLine) + ")";
    }
}

