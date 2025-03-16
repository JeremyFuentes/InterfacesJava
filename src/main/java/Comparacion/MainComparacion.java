package Comparacion;

import java.util.Scanner;

public class MainComparacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el precio del primer producto
        System.out.print("Ingrese el precio del primer producto: ");
        double precio1 = scanner.nextDouble();

        // Pedir al usuario que ingrese el precio del segundo producto
        System.out.print("Ingrese el precio del segundo producto: ");
        double precio2 = scanner.nextDouble();

        // Crear objetos Producto con los precios ingresados
        Producto producto1 = new Producto(precio1);
        Producto producto2 = new Producto(precio2);

        // Comparar los productos
        int resultado = producto1.comparar(producto2);

        // Mostrar el resultado de la comparación
        if (resultado < 0) {
            System.out.println("El primer producto es más barato que el segundo producto.");
        } else if (resultado > 0) {
            System.out.println("El primer producto es más caro que el segundo producto.");
        } else {
            System.out.println("Ambos productos tienen el mismo precio.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}

