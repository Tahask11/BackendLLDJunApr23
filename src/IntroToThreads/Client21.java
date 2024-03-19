package IntroToThreads;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client21 {


    public static void main(String[] args) {


        Instant start = Instant.now();
        ExecutorService es = Executors.newCachedThreadPool();  // Creating new Executor Service
        int maxThread = 0;


        for (int i = 0; i < 10000; i++) {
            NumberPrinter np = new NumberPrinter(i); // Creating new Runnable object
//            Thread thread = new Thread(np);          // Creating new Threads

            // Two Ways to process threads (Preferably run only one)
//            thread.start();                          // Manually initiating each thread to be processed

            es.execute(np);                      // Asynchronous non-blocking - Passing Threads to dynamic Thread Pool


        }

            es.shutdown();

        Instant end = Instant.now();
        long timeelapsed = Duration.between(start, end).toMillis();
        System.out.println();
        System.out.println("It took " + timeelapsed + " Milliseconds to complete.");
        System.out.println("Max Thread Count" + maxThread);

    }
}
