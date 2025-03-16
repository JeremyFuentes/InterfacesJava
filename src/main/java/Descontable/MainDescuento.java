
package Descontable;

import Services.IInterfazDescontable;

public class MainDescuento {
    public static void main(String[] args) {
        IInterfazDescontable<Double> descuento1 = new DescuentoPorcentaje(15.5);
        System.out.println("Descuento del 15.5%: " + descuento1.calcularDescuento(200.0)); 

        IInterfazDescontable<Double> descuento2 = new DescuentoFijo(25.75);
        System.out.println("Precio con descuento fijo de 25.75: " + descuento2.calcularDescuento(200.0));
    }
}

