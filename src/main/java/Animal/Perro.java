
package Animal;

import Services.IInterfazAnimal;

public class Perro implements IInterfazAnimal{

    @Override
    public String hacerSonido(String objet) {
        return "Guau! Guau!";
    }

    @Override
    public String mover(String objet) {
        return "El perro se mueve hacia ti";
    }
   
}
