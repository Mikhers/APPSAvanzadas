package demo;
import java.util.concurrent.*;

// Clase para imprimir "Tick Tack" cada 3 segundos
public class ImprimirTickTack implements Runnable {
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Tick Tack");
                TimeUnit.SECONDS.sleep(3);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}