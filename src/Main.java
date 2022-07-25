import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        TarefaThread thread = new TarefaThread();

//      Pool Thread com 10 threads
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(thread, 1, 1, TimeUnit.SECONDS);
//        thread.run();
    }
}
