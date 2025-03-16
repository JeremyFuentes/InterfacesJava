package Animal;
import Services.IInterfazAnimal;

public class MainAnimal {
    public static void main(String[] args) {
        // Creación de objetos
        IInterfazAnimal<String> gato = new Gato();
        IInterfazAnimal<String> perro = new Perro();

        // Llamando a los métodos y mostrando resultados
        System.out.println("Gato: " + gato.hacerSonido(""));
        System.out.println("Gato: " + gato.mover(""));

        System.out.println("Perro: " + perro.hacerSonido(""));
        System.out.println("Perro: " + perro.mover(""));
    }
}
