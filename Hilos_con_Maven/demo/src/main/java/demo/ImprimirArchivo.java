package demo;

import java.io.*;
import java.util.*;
import org.apache.commons.io.*;
import org.fusesource.jansi.AnsiConsole;
import static org.fusesource.jansi.Ansi.*;


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
            //System.out.println("Contenido del archivo:");
            Thread.sleep(22000); // espera 22 segundos en lo que empieza la canción xd
            for (String linea : lineas) {
                AnsiConsole.systemInstall();
                // System.out.println(linea);
                System.out.println(ansi().fg(Color.BLUE).a(linea).reset()); // Imprime el texto en azul
                AnsiConsole.systemUninstall();
                Thread.sleep(2500); // espera 2,5 segundos
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

//"\u1B00[31m"+