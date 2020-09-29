import java.util.HashMap;
import java.util.Scanner;

public class HomeLibrary {

    public static void main(String[] args) {

        HashMap<String, Boolean> books = new HashMap<String, Boolean>();

        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        System.out.println("\n----------------------------\nWelcome to the library tool!\n----------------------------");

        while(!userInput.equals("e")) {

            System.out.println("'V' to view your books\n" +
            "'A' to add a book\n'X' to remove a book\n'R' to mark that you've read a book\n'E' to exit");

            userInput = scanner.nextLine();
            userInput = userInput.toLowerCase();
            String bookName = "";

            switch (userInput) {
                case "v":
                    Tools.printBooks(books);
                    break;

                case "a":
                    bookName = Tools.getBookName();
                    books.put(bookName, false);
                    System.out.println(bookName + " added!\n");
                    break;

                case "x":
                    bookName = Tools.getBookName();
                    books.remove(bookName);
                    System.out.println(bookName + " removed (if it existed)!\n");
                    break;

                case "r":
                    bookName = Tools.getBookName();
                    books.put(bookName, true);
                    break;
            }
        }

        // message sent after the while loop ends
        System.out.println("Goodbye for now!");

    }
}