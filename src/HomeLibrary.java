import java.util.HashMap;
import java.util.Scanner;

public class HomeLibrary {

    public static void main(String[] args) {

        HashMap<String, Boolean> books = new HashMap<String, Boolean>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n-----------------------\nWelcome to the library!\n'V' to view your books\n" +
                "'A' to add a book\n'X' to remove a book\n'R' to mark that you've read a book\n");

        String userInput = scanner.nextLine();
        // start the massive switch statement here
        System.out.println(userInput);

        //System.out.println("TESTING");
        //System.out.println("\b\b");

    }

}