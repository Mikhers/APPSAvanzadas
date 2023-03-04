package demo;


import java.io.*;
//import javax.sound.sampled.*;
import org.apache.commons.io.*;
import org.apache.commons.lang3.*;

// Clase para generar un archivo txt con un Lorem Ipsum
public class GenerarLoremIpsum implements Runnable {
    private String ruta;

    public GenerarLoremIpsum(String ruta) {
        this.ruta = ruta;
    }

    @Override
    public void run() {
        try {
            String loremIpsum = StringUtils.repeat("Lorem ipsum dolor sit amet, consectetur adipiscing elit. ", 100);
            File archivo = new File(ruta);
            FileUtils.writeStringToFile(archivo, loremIpsum, "UTF-8");
            System.out.println("Se ha generado el archivo: " + ruta);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
