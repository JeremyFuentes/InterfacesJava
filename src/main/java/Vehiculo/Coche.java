
package Vehiculo;
import Services.IInterfazVehiculo;

public class Coche implements IInterfazVehiculo {

    @Override
    public String arrancar(String objet) {
        return "El coche a arrancado";
    }

    @Override
    public String detener(String objet) {
        return "El coche se ha detenido.";
    }
    
}
