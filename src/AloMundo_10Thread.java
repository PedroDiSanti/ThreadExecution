public class AloMundo_10Thread {
    private int count = 0;

    public static void main(String[] args) throws InterruptedException {
        long startTime, endTime, duration;
        long durationTotal = 0;

        AloMundo_10Thread app = new AloMundo_10Thread();

        startTime = System.nanoTime();
        app.doWork();
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println(1 + ":" + duration / 1000 + " ms");
        durationTotal += duration / 1000;

        startTime = System.nanoTime();
        app.doWork();
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println(2 + ":" + duration / 1000 + " ms");
        durationTotal += duration / 1000;

        startTime = System.nanoTime();
        app.doWork();
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println(3 + ":" + duration / 1000 + " ms");
        durationTotal += duration / 1000;

        startTime = System.nanoTime();
        app.doWork();
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println(4 + ":" + duration / 1000 + " ms");
        durationTotal += duration / 1000;

        startTime = System.nanoTime();
        app.doWork();
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println(5 + ":" + duration / 1000 + " ms");
        durationTotal += duration / 1000;

        startTime = System.nanoTime();
        app.doWork();
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println(6 + ":" + duration / 1000 + " ms");
        durationTotal += duration / 1000;

        startTime = System.nanoTime();
        app.doWork();
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println(7 + ":" + duration / 1000 + " ms");
        durationTotal += duration / 1000;

        startTime = System.nanoTime();
        app.doWork();
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println(8 + ":" + duration / 1000 + " ms");
        durationTotal += duration / 1000;

        startTime = System.nanoTime();
        app.doWork();
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println(9 + ":" + duration / 1000 + " ms");
        durationTotal += duration / 1000;

        startTime = System.nanoTime();
        app.doWork();
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println(10 + ":" + duration / 1000 + " ms");
        durationTotal += duration / 1000;

        durationTotal = durationTotal / 10;
        System.out.println("Média: " + durationTotal + " ms");
    }

    public void doWork() throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                    for (int i = 0; i < 10000000; i++) {
                        count++;
                    }
                }
            });

        t1.start();
    }
}
