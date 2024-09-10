package Task;
import java.util.ArrayList;
public class TaskManagementSystem {
    private ArrayList<String> tasks;

    public TaskManagementSystem() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void updateTask(int index, String newDescription) {
        if (index >= 0 && index < tasks.size()) {
            tasks.set(index, newDescription);
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void displayTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public static void main(String[] args) {
        TaskManagementSystem tms = new TaskManagementSystem();
        tms.addTask("Complete homework");
        tms.addTask("Read a book");
        tms.displayTasks();
        tms.updateTask(0, "Complete math homework");
        tms.removeTask(1);
        tms.displayTasks();
    }
}
