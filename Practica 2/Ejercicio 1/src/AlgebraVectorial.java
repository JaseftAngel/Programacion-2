public class AlgebraVectorial {
    private double x;
    private double y;
    private double z;

    public AlgebraVectorial(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public AlgebraVectorial(double x, double y) {
        this(x, y, 0);
    }

    public AlgebraVectorial(double x) {
        this(x, 0, 0);
    }

    private double productoPunto(AlgebraVectorial v) {
        return this.x * v.x + this.y * v.y + this.z * v.z;
    }

    private double magnitud() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public boolean esPerpendicular(AlgebraVectorial v) {
        return productoPunto(v) == 0;
    }

    public boolean esParalelo(AlgebraVectorial v) {
        return (this.x / v.x == this.y / v.y) &&
                (this.y / v.y == this.z / v.z);
    }

    public AlgebraVectorial proyeccion(AlgebraVectorial v) {
        double escalar = productoPunto(v) / Math.pow(v.magnitud(), 2);
        return new AlgebraVectorial(v.x * escalar, v.y * escalar, v.z * escalar);
    }

    public double componente(AlgebraVectorial v) {
        return productoPunto(v) / v.magnitud();
    }

    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

}
