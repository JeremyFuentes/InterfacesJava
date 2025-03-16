
package Descontable;
import Services.IInterfazDescontable;

public class DescuentoFijo implements IInterfazDescontable<Double>{
    
    private double cantidadFija;

    public DescuentoFijo(double cantidadFija) {
        this.cantidadFija = cantidadFija;
    }

    @Override
    public double calcularDescuento(Double precio) {
        return Math.max(0, precio - cantidadFija);
    }
}
