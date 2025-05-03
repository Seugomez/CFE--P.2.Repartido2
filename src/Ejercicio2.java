import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = leer.nextInt();
        String resultado = (numero % 2 == 0) ? "PAR" : "IMPAR";
        System.out.println("El número " + numero + " es " + resultado + ".");
        leer.close();
    }
}