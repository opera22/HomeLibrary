import java.util.HashMap;
import java.util.Scanner;

public class Tools {

    public static void printBooks(HashMap<String, Boolean> books) {
        if (books.size() == 0) {
            System.out.println("You have no books!\n");
            return;
        }
        System.out.println("------------\nYour library\n------------");
        for (String s : books.keySet()) {
            System.out.println("Book: \"" + s + "\" Read: " + books.get(s));
        }
        System.out.println(); // empty line
    }

    public static String getBookName() {

        System.out.println("\nPlease enter the book name below (case-sensitive):");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        return userInput;
    }
}
