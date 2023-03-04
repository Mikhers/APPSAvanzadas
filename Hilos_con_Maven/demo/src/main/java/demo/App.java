package demo;


public class App {
    public static void main(String[] args) {
        // Hilo para reproducir canción MP3
        Thread hilo1 = new Thread(new ReproductorMp3("lil_peep.mp3"));
        // Hilo para imprimir por pantalla el contenido de un archivo txt
        Thread hilo2 = new Thread(new ImprimirArchivo("letra.txt"));
        // Hilo para generar un archivo txt con un Lorem Ipsum
        Thread hilo3 = new Thread(new GenerarLoremIpsum("loremipsum.txt"));
        // Hilo para imprimir "Tick Tack" cada 3 segundos
        Thread hilo4 = new Thread(new ImprimirTickTack());

        // Iniciar los hilos
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
    }
}



