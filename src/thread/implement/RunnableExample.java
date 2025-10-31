package thread.implement;
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable is running: " + Thread.currentThread().getName());
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start(); // Starts the thread
    }
}











