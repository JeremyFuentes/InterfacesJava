package Vehiculo;

import Services.IInterfazVehiculo;

public class MainVehiculo {
    public static void main(String[] args) {
        // Crear instancias de Bicicleta y Coche
        IInterfazVehiculo<String> bicicleta = new Bicicleta();
        IInterfazVehiculo<String> coche = new Coche();
        
        // Mostrar acciones de la bicicleta
        System.out.println("Acciones de la bicicleta:");
        System.out.println(bicicleta.arrancar("Bicicleta"));
        System.out.println(bicicleta.detener("Bicicleta"));
        
        // Mostrar acciones del coche
        System.out.println("\nAcciones del coche:");
        System.out.println(coche.arrancar("Coche"));
        System.out.println(coche.detener("Coche"));
    }
}