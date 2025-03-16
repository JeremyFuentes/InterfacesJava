package Ordenable;

import Services.IInterfazOrdenable;
import java.util.List;

public class MainOrdenacion {
    public static void main(String[] args) {
        // Crear instancia de ListaNumeros
        ListaNumeros listaNumeros = new ListaNumeros();
        
        // Mostrar lista desordenada
        System.out.println("Lista desordenada: " + listaNumeros.listaD);
        
        // Ordenar la lista
        List<Integer> listaOrdenada = listaNumeros.ordenar();
        
        // Mostrar lista ordenada
        System.out.println("Lista ordenada: " + listaOrdenada);
    }
}