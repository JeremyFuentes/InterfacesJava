
package Alimentacion;
import Services.IInterfazAlimentacion;

public class Persona implements IInterfazAlimentacion{
    
    @Override
    public String Comer(String Object) {
        return "La persona esta comiendo para hacer volumen en el gim";
    }
    
}
