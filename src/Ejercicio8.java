import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("¿Cuántos números querés sumar? ");
        int cantidadNumeros = leer.nextInt();
        int sumaTotal = 0;
        for (int i = 1; i <= cantidadNumeros; i++) {
            System.out.print("Número " + i + ": ");
            int numero = leer.nextInt();
            sumaTotal += numero;
        }
        System.out.println("La suma total es: " + sumaTotal);

        leer.close();
    }
}