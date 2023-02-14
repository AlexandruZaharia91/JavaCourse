package Utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class Utils {

    public static Scanner scanner() {

        return new Scanner(System.in);
    }

    public static Scanner scanner(String path) throws FileNotFoundException {
        File text = new File(path);
        Scanner input = new Scanner(text);
        return input;
    }
}
