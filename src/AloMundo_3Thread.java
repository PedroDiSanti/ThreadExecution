import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

class Task implements Runnable {
    private String name;
    private int count;

    public Task(String s) {
        name = s;
    }

    public void run() {
        for (int i = 0; i <= 10000000; i++) {
            count++;
        }
    }
}

public class AloMundo_3Thread {
    static final int MAX_T = 3;

    public static void main(String[] args) {
        long startTime, endTime, duration;
        long durationTotal = 0;

        Runnable r1 = new Task("task 1");
        Runnable r2 = new Task("task 2");
        Runnable r3 = new Task("task 3");
        Runnable r4 = new Task("task 4");
        Runnable r5 = new Task("task 5");
        Runnable r6 = new Task("task 6");
        Runnable r7 = new Task("task 7");
        Runnable r8 = new Task("task 8");
        Runnable r9 = new Task("task 9");
        Runnable r10 = new Task("task 10");

        ExecutorService pool = Executors.newFixedThreadPool(MAX_T);

        startTime = System.nanoTime();
        pool.execute(r1);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println(1 + ":" + duration / 1000 + " ms");
        durationTotal += duration / 1000;

        startTime = System.nanoTime();
        pool.execute(r2);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println(2 + ":" + duration / 1000 + " ms");
        durationTotal += duration / 1000;

        startTime = System.nanoTime();
        pool.execute(r3);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println(3 + ":" + duration / 1000 + " ms");
        durationTotal += duration / 1000;

        startTime = System.nanoTime();
        pool.execute(r4);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println(4 + ":" + duration / 1000 + " ms");
        durationTotal += duration / 1000;

        startTime = System.nanoTime();
        pool.execute(r5);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println(5 + ":" + duration / 1000 + " ms");
        durationTotal += duration / 1000;

        startTime = System.nanoTime();
        pool.execute(r6);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println(6 + ":" + duration / 1000 + " ms");
        durationTotal += duration / 1000;

        startTime = System.nanoTime();
        pool.execute(r7);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println(7 + ":" + duration / 1000 + " ms");
        durationTotal += duration / 1000;

        startTime = System.nanoTime();
        pool.execute(r8);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println(8 + ":" + duration / 1000 + " ms");
        durationTotal += duration / 1000;

        startTime = System.nanoTime();
        pool.execute(r9);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println(9 + ":" + duration / 1000 + " ms");
        durationTotal += duration / 1000;

        startTime = System.nanoTime();
        pool.execute(r10);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println(10 + ":" + duration / 1000 + " ms");
        durationTotal += duration / 1000;

        durationTotal = durationTotal / 10;
        System.out.println("Média: " + durationTotal + " ms");

        pool.shutdown();
    }
} 