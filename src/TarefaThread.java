import javax.swing.*;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TarefaThread implements Runnable {

    @Override
    public void run() {

//        while (true){
            Calendar data = Calendar.getInstance();
            int hora = data.get(Calendar.HOUR_OF_DAY);
            int min = data.get(Calendar.MINUTE);
            int sec = data.get(Calendar.SECOND);

            if(hora == 17 && min == 0 && sec == 0 ){
                System.out.println("Bom dia");
            }
            else if(hora == 12 && min == 0 && sec == 0){
                System.out.println("Boa tarde");
            }
            else if(hora == 17 && min == 30 && sec == 0){
                System.out.println("Boa noite");
            }

            System.out.println(hora + ":" + min + ":" + sec);
//        }
    }
}
