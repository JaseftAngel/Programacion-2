public class EcuacionLineal {

    private double a, b, c, d, e, f;

    public EcuacionLineal(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    public boolean solucion() {
        return (a * d - b * c) != 0;
    }
    public double obtX() {
        return (e * d - b * f) / (a * d - b * c);
    }
    public double obtY() {
        return (a * f - e * c) / (a * d - b * c);
    }
    public void mostrar() {
        if (solucion()) {
            System.out.println("x = " + obtX() + ", y = " + obtY());
        } else {
            System.out.println("La ecuación no tiene solución.");
        }
    }
}