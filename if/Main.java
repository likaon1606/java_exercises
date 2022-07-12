//...................................................................
//-------------BUCLES--------------------------
//......................................................................

// --------------IF--------------

// public class Main {
    
//     public static void main(String[] args) {
//         String estacion = "verano";

//         if ( estacion == "primavera" ) {
//             System.out.println("Es primavera");
//         } else if (estacion == "verano") {
//             System.out.println("Es verano"); 
//         } else {
//             System.out.print("Es otra estación");
//         }
//     }
// }

//------------WHILE---------------------------------------

// public class Main {

//     public static void main(String[] args) {
//         int contador = 10;

//         while (contador > 0) {
//             System.out.println(contador);
//             contador = contador -5; // 10 5
//             // contador --; 
//         }
//     }
// }

//-------------DO WHILE---------------

// public class Main {

//     public static void main (String[] args) {

//         int contador = 12;

//         do { //primero ejecuta y luegoo compara la condicion
//             System.out.println(contador);
//             contador = contador -1;
//         } while(contador > 2);
//     }
// }

//----------------FOR---------------------

// public class Main {
//     public static void main(String[] args) {
//         // int valores[] = new int[5];
//         int valores[] = {10, 20, 30, 40, 50};

//         for (int i = 0; i < valores.length; i++) {
//             System.out.println(valores[i]);
//         }
//     }
// }

//--------------SWITCH--------------------

// public class Main {
//     public static void main(String[] args) {
//         var estacion = "Invierno";

//         switch(estacion) {
//             case "Verano":
//                 System.out.println("es verano");
//                 break;
//             case "Invierno":
//                 System.out.println("es Invierno");
//                 break;
//             default:
//                 System.out.println(estacion); 
//                 break;   
//         }

//     }
// }

public class Main {
    public static void main(String[] args) {
        var hoy_es = "SABADO";

        switch(hoy_es) {
            case "LUNES":
            case "MARTES":
            case "MIERCOLES":
            case "JUEVES":
            case "VIERNES":
                System.out.println("Hoy es laborable");
                break;
            default:
                System.out.println("Hoy NO es laborable");
        }
    }
}