
package Descontable;
import Services.IInterfazDescontable;

public class DescuentoPorcentaje implements IInterfazDescontable<Double>{
    
    private double porcentaje;


    public DescuentoPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double calcularDescuento(Double precio) {
        return precio * (porcentaje / 100);
    }  
    
}
