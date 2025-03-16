
package Notificable;
import Services.IInterfazNotificable;

public class SMS implements IInterfazNotificable {
    
    @Override
    public String enviarNotificacion(String Object) {
        return "Mensaje de texto enviado\nDestinatario: (503)9999-9999\nMensaje: Este es tu nuevo numero de telefono??";
    }
}
