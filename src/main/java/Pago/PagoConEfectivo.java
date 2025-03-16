
package Pago;
import Services.IInterfazPago;

public class PagoConEfectivo implements IInterfazPago{
    
    @Override
    public Object procesarPago(Double cantidad) {
        return "Se a realizado el pago en efectivo, recibido: $" + cantidad;
    }
   
}
