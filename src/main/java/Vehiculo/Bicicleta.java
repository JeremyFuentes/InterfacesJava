
package Vehiculo;
import Services.IInterfazVehiculo;

public class Bicicleta implements IInterfazVehiculo {
    
    @Override
    public String arrancar(String objet) {
        return "La bicicleta a avanzado";
    }

    @Override
    public String detener(String objet) {
        return "La bicicleta se ha detenido.";
    }
}
