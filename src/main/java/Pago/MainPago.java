package Pago;

import Services.IInterfazPago;
import java.util.Scanner;

public class MainPago {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        // Bucle para validar la opción de pago
        while (true) {
            System.out.println("Seleccione el método de pago:");
            System.out.println("1. Efectivo");
            System.out.println("2. Tarjeta");
            System.out.println("3. Salir");
            System.out.print("Ingrese su opción: ");
            
            opcion = scanner.nextInt();
            
            if (opcion == 3) {
                System.out.println("\n___________________________________");
                System.out.println("Ha decidido cerrar el programa.");
                scanner.close();
                return;
            }
            
            if (opcion == 1 || opcion == 2) {
                break; 
            }
            System.out.println("\n___________________________________________________________________");
            System.out.println("Opción no válida. Por favor, seleccione una opción correcta.\n");
        }
        
        // Solicitar cantidad de pago
        System.out.print("Ingrese la cantidad a pagar: ");
        double cantidad = scanner.nextDouble();
        
        IInterfazPago<String> metodoPago = (opcion == 1) ? new PagoConEfectivo() : new PagoConTarjeta();
        
        // Mostrar resultado del pago
        System.out.println("_______________________________________________");
        System.out.println("\n" + metodoPago.procesarPago(cantidad));
        
        scanner.close();
    }
}
