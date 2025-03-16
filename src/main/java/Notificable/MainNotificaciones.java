package Notificable;

import Services.IInterfazNotificable;

public class MainNotificaciones {
    public static void main(String[] args) {
        // Crear instancias de CorreoElectronico y SMS
        IInterfazNotificable<String> correo = new CorreoElectronico();
        IInterfazNotificable<String> sms = new SMS();

        // Enviar notificaciones y mostrar resultados
        System.out.println("Resultado de notificación por correo electrónico:");
        System.out.println(correo.enviarNotificacion(""));
        
        System.out.println("\nResultado de notificación por SMS:");
        System.out.println(sms.enviarNotificacion(""));
    }
}