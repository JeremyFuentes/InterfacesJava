
package Comparacion;
import Services.IInterfazComObjeto;

public class Producto implements IInterfazComObjeto<Producto>{
    
    public double precio;

    public Producto(double precio) {
        this.precio = precio;
    }
    
    @Override
    public int comparar(Producto o) {
        return Double.compare(this.precio, o.precio);
    }
    
}
