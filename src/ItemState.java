import java.util.ArrayList;
import java.util.List;

public class ItemState {

    private List<TodoListItem> todos = new ArrayList<TodoListItem>();
    private List<TodoListItem> inProgress = new ArrayList<TodoListItem>();
    private List<TodoListItem> done = new ArrayList<TodoListItem>();

    public void addTodoStatus(TodoListItem todoListItem, String state) {

        if (state.equals("todo")) {
            todos.add(todoListItem);
        } else if (state.equals("inProgress")) {
            inProgress.add(todoListItem);
        } else if (state.equals("done")) {
            done.add(todoListItem);
        } else {
            System.out.println("Wrong status!");
        }
    }

    public List<TodoListItem> getTodos() {
        return todos;
    }

    public void setTodos(List<TodoListItem> todos) {
        this.todos = todos;
    }

    public List<TodoListItem> getInProgress() {
        return inProgress;
    }

    public void setInProgress(List<TodoListItem> inProgress) {
        this.inProgress = inProgress;
    }

    public List<TodoListItem> getDone() {
        return done;
    }

    public void setDone(List<TodoListItem> done) {
        this.done = done;
    }
}
