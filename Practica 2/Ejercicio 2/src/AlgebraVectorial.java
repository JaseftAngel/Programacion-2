public class AlgebraVectorial {
    private double a1, a2, a3;
    private double b1, b2, b3;

    public AlgebraVectorial(double a1, double a2, double a3,
                            double b1, double b2, double b3) {
        this.a1 = a1; this.a2 = a2; this.a3 = a3;
        this.b1 = b1; this.b2 = b2; this.b3 = b3;
    }

    public String suma() {
        return "(" + (a1+b1) + ", " + (a2+b2) + ", " + (a3+b3) + ")";
    }

    public String multiplicarEscalar(double r) {
        return "(" + (r*a1) + ", " + (r*a2) + ", " + (r*a3) + ")";
    }

    public double longitud(char v) {
        if(v=='a') return Math.sqrt(a1*a1+a2*a2+a3*a3);
        return Math.sqrt(b1*b1+b2*b2+b3*b3);
    }

    public String normal(char v) {
        double m = longitud(v);
        if(v=='a') return "(" + (a1/m) + ", " + (a2/m) + ", " + (a3/m) + ")";
        return "(" + (b1/m) + ", " + (b2/m) + ", " + (b3/m) + ")";
    }

    public double productoEscalar() {
        return a1*b1 + a2*b2 + a3*b3;
    }

    public String productoVectorial() {
        double x = a2*b3 - a3*b2;
        double y = a3*b1 - a1*b3;
        double z = a1*b2 - a2*b1;
        return "(" + x + ", " + y + ", " + z + ")";
    }

    public boolean sonPerpendiculares() {
        return productoEscalar() == 0;
    }

    public boolean sonParalelos() {
        double x = a2*b3 - a3*b2;
        double y = a3*b1 - a1*b3;
        double z = a1*b2 - a2*b1;
        return x==0 && y==0 && z==0;
    }

    public String proyeccion() {
        double esc = productoEscalar() / (b1*b1+b2*b2+b3*b3);
        double x = esc*b1, y = esc*b2, z = esc*b3;
        return "(" + x + ", " + y + ", " + z + ")";
    }

    public double componente() {
        return productoEscalar() / longitud('b');
    }
}
