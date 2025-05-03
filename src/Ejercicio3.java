import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un número entre 0 y 999: ");
        int numero = leer.nextInt();
        if (numero < 0 || numero > 999) {
            System.out.println("El número ingresado está fuera del rango permitido (0-999).");
        } else {
            if (numero < 10) {
                System.out.println("El número " + numero + " tiene 1 cifra.");
            } else if (numero < 100) {
                System.out.println("El número " + numero + " tiene 2 cifras.");
            } else {
                System.out.println("El número " + numero + " tiene 3 cifras.");
            }
        }
        leer.close();
    }
}