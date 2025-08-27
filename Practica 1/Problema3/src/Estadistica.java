public class Estadistica {

    // ESTE ES CON LA VERSION CLASICA QUE SE USA EN JAVA

    private double[] datos;

    public Estadistica(double[] datos) {
        this.datos = datos;
    }

    public double promedio() {
        double suma = 0;
        for (double num : datos) {
            suma += num;
        }
        return suma /datos.length;
    }

    public double desviacion() {
        double prom = promedio();
        double suma = 0;
        for (double num : datos) {
            suma += Math.pow(num - prom, 2);
        }
        return Math.sqrt(suma / (datos.length - 1));
    }

    public void mostrar() {
        System.out.printf("El promedio es %.2f\n", promedio());
        System.out.printf("La desviación estándar es %.5f\n", desviacion());
    }
}