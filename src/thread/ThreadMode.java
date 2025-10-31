package thread;

// Method 1: Extending Thread class
class MyThread extends Thread {
    private final String threadName;

    public MyThread(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(threadName + " - Count: " + i);
            try {
                Thread.sleep(500); // Pause for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted");
            }
        }
        System.out.println(threadName + " finished");
    }
}

// Method 2: Implementing Runnable interface
class MyRunnable implements Runnable {
    private String taskName;

    public MyRunnable(String name) {
        this.taskName = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(taskName + " - Step: " + i);
            try {
                Thread.sleep(700); // Pause for 0.7 seconds
            } catch (InterruptedException e) {
                System.out.println(taskName + " interrupted");
            }
        }
        System.out.println(taskName + " completed");
    }
}

// Main class with demonstration
public class ThreadMode {
    public static void main(String[] args) {
        System.out.println("Starting thread demonstration...\n");

        // Creating and starting Thread subclass
        MyThread thread1 = new MyThread("Thread-1");
        MyThread thread2 = new MyThread("Thread-2");

        // Creating and starting Runnable implementation
        Thread thread3 = new Thread(new MyRunnable("Runnable-Task"));
        Thread thread4 = new Thread(new MyRunnable("Another-Task"));

        // Starting all threads (they run concurrently)
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        // Wait for all threads to complete
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("\nAll threads have finished execution");
    }
}
