
package Pago;
import Services.IInterfazPago;

public class PagoConTarjeta implements IInterfazPago {
    
    @Override
    public Object procesarPago(Double cantidad) {
        return "Se a realizado el pago con tarjeta, recibido: $" + cantidad;
    }
    
}
