package hexlet.code;
import java.util.Scanner;
import java.util.Random;

import static hexlet.code.Cli.printUser;
import static hexlet.code.Cli.userNam;

public class Games {
    public Scanner stringGame = new Scanner(System.in);
    public static String userGame;
    public void readUserInput() {
        userGame = stringGame.next();
    }
    public static void beginning () {
        // will be shown only once

        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

        System.out.print("Your choise: ");
        Games myObject = new Games();
        myObject.readUserInput();
        gameLogic();

    }

    public static void gameLogic(){
        switch (userGame) {
            case "0":
                break;
            case "1":
                printUser();
                break;
            case "2":
                printUser();
                evenGame();
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
            case "6":
                break;
            default:
                System.out.println("Incorrect input, exiting 'Brain Games'");
                break;
        }
    }
    public static void evenGame() {
        Random rand = new Random();
        Games myObject = new Games();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int res = 0;
        String corrAns = "";

        do {
            int rand_int1 = rand.nextInt(100);
            corrAns = rand_int1 % 2 == 0 ? "yes" : "no";
            System.out.println("Question: " + rand_int1);
            System.out.print("Your answer: ");
            myObject.readUserInput();
                if (rand_int1 % 2 == 0 && userGame.equals("yes") || rand_int1 % 2 != 0 && userGame.equals("no")) {
                    res+=1;
                    System.out.println("Correct!");
                } else {

                    System.out.println("'" +userGame + "' is wrong answer ;(. Correct answer was '" + corrAns +"'.\n" +
                            "Let's try again, " + userNam + "!");
                    return;
                }
        } while (res < 3);
        System.out.println("Congratulations, " + userNam + "!");
    }
}
