import java.util.Scanner;

public class TodoListDemo {

    private static Scanner numberScanner = new Scanner(System.in);
    private static Scanner textScanner = new Scanner(System.in);
    private static final String DEFAULT_STATE = "todo";


    public static void main(String[] args) {
        ItemState itemState = new ItemState();

        System.out.println("Choose an option: \n" +
                "1. Add an item \n" +
                "2. Display all items \n" +
                "3. Display todos not started \n" +
                "4. Display in progress items \n" +
                "5. Display done items \n" +
                "6. Edit an item \n" +
                "7. Delete an item \n" +
                "8. Exit");

        int userInput = numberScanner.nextInt();

        switch (userInput) {
            case 1:
                System.out.println("Enter task title: ");
                String title = textScanner.nextLine();
                System.out.println("Enter description: ");
                String description = textScanner.nextLine();

                TodoListItem item = new TodoListItem(title, description);

                itemState.addTodoStatus(item, DEFAULT_STATE);

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

        //add print statement of the list states
    }
}
