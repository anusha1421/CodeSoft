package org.experiential.eight;
//8. Develop a class named TaskExecutor with a method for executing tasks in
//a thread pool. Implement methods for submitting tasks, managing
//threads, and handling exceptions
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskExecutor {

    private final ExecutorService executorService;

    public TaskExecutor(int poolSize) {
        // Create a fixed-size thread pool
        this.executorService = Executors.newFixedThreadPool(poolSize);
    }

    public void submitTask(Runnable task) {
        // Submit a task to the thread pool
        executorService.submit(task);
    }

    public void shutdown() {
        // Shutdown the thread pool
        executorService.shutdown();
    }

    public static void main(String[] args) {
        // Example usage of TaskExecutor
        TaskExecutor taskExecutor = new TaskExecutor(5); // Pool size is 5

        // Submitting tasks
        taskExecutor.submitTask(() -> {
            // Task 1 logic
            System.out.println("Task 1 executed");
        });

        taskExecutor.submitTask(() -> {
            // Task 2 logic
            System.out.println("Task 2 executed");
        });

        // Shutting down the executor when done
        taskExecutor.shutdown();
    }
}

