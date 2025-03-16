
package Animal;
import Services.IInterfazAnimal;

public class Gato implements IInterfazAnimal {
    
    @Override
    public String hacerSonido(String objet) {
        return "Miau! Miau!";
    }

    @Override
    public String mover(String Objet) {
        return "El gato se mueve hacia ti";
    }
}
