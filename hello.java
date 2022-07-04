// public class hello {
//     public static void main(String[] args) {
//         System.out.println("Hola mundo");
//     }
// }

//Primera parte:

// Crear una función con tres parámetros que 
//sean números que se suman entre sí.
// Llamar a la función en el main y darle valores.
public class hello {

    public static void main(String[] args) {
        int resultado;
        resultado = sum(5,13);

        System.out.println(resultado);
    }


public static int sum(int x, int y) {
    return x + y;
    }
}
