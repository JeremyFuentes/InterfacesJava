package Trabajador;

import Services.IInterfazTrabajador;

public class MainTrabajador {
    public static void main(String[] args) {
        // Crear instancias de Desarrollador y Diseñador
        IInterfazTrabajador<String> desarrollador = new Desarrollador();
        IInterfazTrabajador<String> diseñador = new Diseñador();
        
        // Mostrar resultados del trabajo
        System.out.println("Resultado del trabajo del desarrollador:");
        System.out.println(desarrollador.trabajar(""));
        
        System.out.println("\nResultado del trabajo del diseñador:");
        System.out.println(diseñador.trabajar(""));
    }
}