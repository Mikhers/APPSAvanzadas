package demo;
import org.fusesource.jansi.AnsiConsole;

public class ImprimirTickTack implements Runnable {
    @Override
    public void run() {
        try {
            while (true) {
                AnsiConsole.systemInstall();
                System.out.println("\u001B[31mTick Tack");
                Thread.sleep(2500); // espera 2,5 segundos
                AnsiConsole.systemUninstall();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}