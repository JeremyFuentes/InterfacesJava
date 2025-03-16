package FiguraGeometrica;

import Services.IInterfazFigGeo;
import java.util.Scanner;

public class MainFiguraGeometrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada para el círculo
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();
        Circulo circulo = new Circulo(radio);
        
        // Entrada para el rectángulo
        System.out.print("Ingrese el largo del rectángulo: ");
        double largo = scanner.nextDouble();
        System.out.print("Ingrese el ancho del rectángulo: ");
        double ancho = scanner.nextDouble();
        Rectangulo rectangulo = new Rectangulo(largo, ancho);
        
        // Mostrar resultados
        System.out.println("\nResultados:");
        System.out.println("Círculo - Área: " + circulo.area() + ", Perímetro: " + circulo.perimetro());
        System.out.println("Rectángulo - Área: " + rectangulo.area() + ", Perímetro: " + rectangulo.perimetro());
        
        scanner.close();
    }
}
