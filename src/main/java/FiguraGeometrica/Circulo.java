
package FiguraGeometrica;
import Services.IInterfazFigGeo;

public class Circulo implements IInterfazFigGeo{
    
    public double radio;
    
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    @Override
    public Double area() {
        return Math.PI * radio * radio;
    }

    @Override
    public Double perimetro() {
        return 2 * Math.PI * radio;
    }
}
