// Main.java
public class Main {
    public static void main(String[] args) {
        // Create users
        User gary = new User("Gary Brown");
        User larry = new User("Larry Lemon");
        User berry = new User("Berry Ewida");

        // Create tasks for each user
        gary.addTask(new Task("Design and implement responsive user interfaces."));
        gary.addTask(new Task("Participate in code reviews."));
        gary.addTask(new Task("Troubleshoot and debug issues."));

        larry.addTask(new Task("Design and implement responsive user interfaces."));
        larry.addTask(new Task("Participate in code reviews."));
        larry.addTask(new Task("Troubleshoot and debug issues."));

        berry.addTask(new Task("Design and implement responsive user interfaces."));
        berry.addTask(new Task("Participate in code reviews."));
        berry.addTask(new Task("Troubleshoot and debug issues."));

        // Mark some tasks as completed
        gary.markTaskAsCompleted("Participate in code reviews.");

        // Print all tasks for each user
        gary.printAllTasks();
        larry.printAllTasks();
        berry.printAllTasks();
    }
}