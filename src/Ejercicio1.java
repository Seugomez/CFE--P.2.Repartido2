import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
                Scanner leer = new Scanner(System.in);
                System.out.print("Ingrese un número: ");
        int numero = leer.nextInt();
            if (numero > 0) {
            System.out.println("El número " + numero + " es POSITIVO.");
        } else if (numero < 0) {
            System.out.println("El número " + numero + " es NEGATIVO.");
        } else {
            System.out.println("El número 0 es NEUTRO.");
        }
        leer.close();
    }
}