package demo;


import java.io.*;

// Clase para generar un archivo txt con un Lorem Ipsum
public class GenerarLoremIpsum implements Runnable {
    private String ruta;
    String linea[] = {"Wait right here","I'll be back in the morning","I know that I'm not that important to you","But to me, girl, you're so much more than gorgeous","So much more than perfect","Right now I know that I'm not really worth it","If you give me time, I could work on it","Give me some time while I work on it","Losin' your patience, and, girl, I don't blame you","The Earth's in rotation, you're waiting for me","Look at my face when I fuck on your waist","'Cause we only have one conversation a week","That's why your friends always hatin' on me","Fuck 'em though, I did this all by myself","Matter of fact, I ain't ever asked no one for help","And that's why I don't pick up my phone when it rings","None of my exes is over Lil Peep","Nobody flexin' as much as I be","That's why she text me and tell me she love me","She know that someday I'll be over the sea","Makin' my money and smokin' my weed","I think it's funny, she open up to me, get comfortable with me","Once I got it comin', I love her, she love me","I know that I'm nothing like someone the family want me to be","If I find a way, would you walk it with me?","Look at my face while you talkin' to me","'Cause we only have one conversation a week","Can I get one conversation at least?","Shout out to everyone makin' my beats, you helpin' me preach","This music's the only thing keeping","The peace when I'm fallin' to pieces","Look at the sky tonight, all of the stars have a reason","A reason to shine, a reason like mine, and I'm fallin' to pieces","Look at the sky tonight, all of the stars have a reason"};
    
    public GenerarLoremIpsum(String ruta) {
        this.ruta = ruta;
    }
    
    @Override
    public void run() {
        try {
            File archivo = new File(ruta);
            FileWriter writer2 = new FileWriter(archivo);
            writer2.write("");
            writer2.close();
            Thread.sleep(19500); // espera 22 segundos en lo que empieza la canción xd
            for (String a : linea) {
                FileWriter writer = new FileWriter(archivo, true);
                writer.write(a+"\n");
                Thread.sleep(2500); // espera 22 segundos en lo que empieza la canción xd
                writer.close();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}