package demo;

import java.io.*;
import java.util.*;
import org.apache.commons.io.*;


// Clase para imprimir el contenido de un archivo txt
public class ImprimirArchivo implements Runnable {
    private String ruta;

    public ImprimirArchivo(String ruta) {
        this.ruta = ruta;
    }

    @Override
    public void run() {
        try {
            List<String> lineas = FileUtils.readLines(new File(ruta), "UTF-8");
            System.out.println("Contenido del archivo:");
            Thread.sleep(21000); // espera 21 segundos en lo que empieza la canción xd
            for (String linea : lineas) {
                System.out.println(linea);
                Thread.sleep(3000); // espera 3 segundos
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

