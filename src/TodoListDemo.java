import java.util.Scanner;

public class TodoListDemo {

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Choose an option: \n" +
                "1. Add an item \n" +
                "2. Display all items \n" +
                "3. Display todos not started \n" +
                "4. Display in progress items \n" +
                "5. Display done items \n" +
                "6. Edit an item \n" +
                "7. Delete an item \n" +
                "8. Exit");

        int userInput = scanner.nextInt();

        switch (userInput) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            default:
                break;

        }
    }
}
