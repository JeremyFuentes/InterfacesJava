
package FiguraGeometrica;
import Services.IInterfazFigGeo;

public class Rectangulo implements IInterfazFigGeo {
    
    public double largo, ancho;

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }
    
    @Override
    public Double area() {
        return largo * ancho;
    }

    @Override
    public Double perimetro() {
        return 2 * (largo + ancho);
    }
}
