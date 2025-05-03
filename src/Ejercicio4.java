import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = leer.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = leer.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int num3 = leer.nextInt();
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("El mayor de los tres números es: " + num1 + ".");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("El mayor de los tres números es: " + num2 + ".");
        } else {
            System.out.println("El mayor de los tres números es: " + num3 + ".");
        }
        leer.close();
    }
}