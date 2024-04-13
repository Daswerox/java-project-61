package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static String userNam;
    public static void printUser () {
        // String input with the Java Scanner
        System.out.print("May I have your name? ");
        Scanner stringScanner = new Scanner(System.in);
        String userName = stringScanner.next();
        System.out.println("Hello, " + userName + "!");
        userNam = userName;
    }
}
