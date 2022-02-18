package SAX;
/*
Coger el doc de clientes y hacer un manejador personalizado que cuando empiece el documento escriba un msj en consola de inicio de documento,
cuando acabe el documento un mensaje de fin de doc.
cuando empiece un elemento que escriba un msj de inicio del elemento "nombredelelemento"
cuando acabe el elemento que escriba un msj de fin del elemento "X"
 */

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String nombreArchivo = "clientes.xml";
        PruebaSAX1 probando = new PruebaSAX1 (nombreArchivo);
        probando.andale();

    }
}
