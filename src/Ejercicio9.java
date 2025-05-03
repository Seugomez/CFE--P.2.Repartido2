import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        String contrasenaCorrecta = "java123";
        Scanner scanner = new Scanner(System.in);
        String contrasenaIngresada;
        do {
            System.out.print("Ingresa tu contraseña: ");
            contrasenaIngresada = scanner.nextLine();
            if (!contrasenaIngresada.equals(contrasenaCorrecta)) {
                System.out.println("Contraseña incorrecta. Inténtelo de nuevo.");
            }
        } while (!contrasenaIngresada.equals(contrasenaCorrecta));
        System.out.println("¡Acceso correcto!");
        scanner.close();
    }
}