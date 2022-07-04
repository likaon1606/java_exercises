// Segunda parte:
// Crear una clase coche.
// Dentro de la clase coche, una variable numérica 
//que almacene el número de puertas que tiene.
// Una función que incremente el número de puertas 
//que tiene el coche.

// Crear un objeto miCoche en el main y añadirle 
//una puerta.
// Mostrar el número de puertas que tiene el objeto.
public class Coche {

    public static void main(String[] args) {
        int puertas;
        puertas = incr(4, 1);
        
        System.out.println(puertas); 
        miCoche auto = new miCoche();
        auto.sumPuerta();
        System.out.println(auto.puerta);
    }

public static int incr(int x, int y) {
        return x + y;
    }
}
    class miCoche{
        public int puerta = 1;
    
        public void sumPuerta() {
        this.puerta++;
        }
    }



