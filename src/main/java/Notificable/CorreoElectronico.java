
package Notificable;
import Services.IInterfazNotificable;

public class CorreoElectronico implements IInterfazNotificable {
    
    @Override
    public String enviarNotificacion(String Object) {
        return "Se ha enviado una notificacion por correo Electronico\nDestinatario: elpruebas503@gmail.com\nMensaje: Esto es una prueba";
    }
    
}
