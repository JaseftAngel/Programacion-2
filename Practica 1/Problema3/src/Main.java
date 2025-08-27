import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[10];

        System.out.println("Ingrese 10 números: ");
        for (int i = 0; i < 10; i++) numeros[i] = sc.nextDouble();

        Estadistica est = new Estadistica(numeros);
        est.mostrar();
    }
}