
package Ordenable;
import Services.IInterfazOrdenable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListaNumeros implements IInterfazOrdenable<List<Integer>> {
    
    public List<Integer> listaD;
    
    public ListaNumeros() {
        this.listaD = Arrays.asList(3,20,40,7,6,13,18,21,22,50);
    }
    
    @Override
    public List<Integer> ordenar() {
        Collections.sort(listaD);
        return listaD;
    }   
    
}
