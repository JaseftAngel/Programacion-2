import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Ingrese a, b, c, d, e, f: ");
            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();
            double d = input.nextDouble();
            double e = input.nextDouble();
            double f = input.nextDouble();

            EcuacionLineal eq1 = new EcuacionLineal(a, b, c, d, e, f);
            eq1.mostrar();
        }
}
