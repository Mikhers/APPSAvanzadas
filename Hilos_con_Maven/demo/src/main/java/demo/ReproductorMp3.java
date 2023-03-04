package demo;

import java.io.*;
import javazoom.jl.decoder.*;
import javazoom.jl.player.*;
// Clase para reproducir una canción MP3
public class ReproductorMp3 implements Runnable {
    private String ruta;

    public ReproductorMp3(String ruta) {
        this.ruta = ruta;
    }

    @Override
    public void run() {
        try {
            FileInputStream fis = new FileInputStream(ruta);
            BufferedInputStream bis = new BufferedInputStream(fis);

            try {
                Player player = new Player(bis);
                player.play();
            } catch (JavaLayerException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

