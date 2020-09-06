public class AloMundo_1Thread {
    private int count = 0;

    public static void main(String[] args) throws InterruptedException {
        long startTime, endTime, duration;
        long durationTotal = 0;

        for (int j = 1; j <11; j++) {
            startTime = System.nanoTime();

            AloMundo_1Thread app = new AloMundo_1Thread();
            app.doWork();

            endTime = System.nanoTime();

            duration = (endTime - startTime);

            System.out.println(j + ":" + duration / 1000 + " ms");

            durationTotal += duration / 1000;
        }
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
