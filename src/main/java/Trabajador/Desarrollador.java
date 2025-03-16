
package Trabajador;
import Services.IInterfazTrabajador;

public class Desarrollador implements IInterfazTrabajador{
    
    @Override
    public String trabajar(String object) {
        return "El codigo del desarrollador no compila";
    }
    
}
