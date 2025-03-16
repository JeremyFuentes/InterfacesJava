
package Alimentacion;
import Services.IInterfazAlimentacion;

public class Animal implements IInterfazAlimentacion{
    
    @Override
    public String Comer(String Object) {
        return "El gato esta comiendo su comida";
    }
}
