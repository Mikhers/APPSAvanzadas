public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 5);
        Perro perro = new Perro("Toby", 3);
        Gato gato = new Gato("Minina", 2);
        
        animal.imprimirDatos();
        animal.hacerSonido();
        
        perro.imprimirDatos();
        perro.hacerSonido();
        
        gato.imprimirDatos();
        gato.hacerSonido();
    }
}
