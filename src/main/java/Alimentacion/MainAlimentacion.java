
package Alimentacion;
import Services.IInterfazAlimentacion;

public class MainAlimentacion {
    public static void main(String[] args) {

        IInterfazAlimentacion<String> persona = new Persona();
        System.out.println(persona.Comer(""));  

        IInterfazAlimentacion<String> animal = new Animal();
        System.out.println(animal.Comer("")); 
        
    }
}
