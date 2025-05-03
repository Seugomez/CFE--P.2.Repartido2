import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = leer.nextDouble();
        System.out.print("Ingrese su altura en metros, separándolo con una coma: ");
        double altura = leer.nextDouble();
        double imc = peso / (altura * altura);
        System.out.println("Su IMC es: " + String.format("%.2f", imc));
        if (imc < 18.5) {
            System.out.println("Estado: Bajo peso.");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Estado: Peso normal.");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Estado: Sobrepeso.");
        } else {
            System.out.println("Estado: Obesidad.");
        }
        leer.close();
    }
}