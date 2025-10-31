package thread.implement;


    //Java provides two primary ways to create threads:

    class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("Thread is running: " + Thread.currentThread().getName());
        }
    }

    public class ThreadExample {
        public static void main(String[] args) {
            MyThread thread = new MyThread();
            MyThread thread1 = new MyThread();
            thread.start(); // Starts the thread
            thread1.start(); // Starts the thread
        }
    }







