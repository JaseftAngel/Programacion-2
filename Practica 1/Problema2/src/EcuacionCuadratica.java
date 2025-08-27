import java.util.Scanner;

public class EcuacionCuadratica {
    private double a, b, c;

    public EcuacionCuadratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double Discriminante() {
        return b * b - 4 * a * c;
    }

    public double Raiz1() {
        double disc = Discriminante();
        if (disc < 0) return 0;
        return (-b + Math.sqrt(disc)) / (2 * a);
    }

    public double Raiz2() {
        double disc = Discriminante();
        if (disc < 0) return 0;
        return (-b - Math.sqrt(disc)) / (2 * a);
    }

    public void mostrar() {
        double disc = Discriminante();
        if (disc > 0) {
            System.out.println("La ecuación tiene dos raíces: " + Raiz1() + " y " + Raiz2());
        } else if (disc == 0) {
            System.out.println("La ecuación tiene una raíz: " + Raiz1());
        } else {
            System.out.println("La ecuación no tiene raíces reales.");
        }
    }
}