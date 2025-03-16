
package Trabajador;
import Services.IInterfazTrabajador;

public class Diseñador implements IInterfazTrabajador{
    
    @Override
    public String trabajar(String object) {
        return "El diseño de la nueva publicidad esta aceptable";
    }
    
}
