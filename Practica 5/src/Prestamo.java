import java.util.*;

public class Prestamo {
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private Estudiante estudiante;
    private Libro libro;

    public Prestamo(Estudiante estudiante, Libro libro) {
        this.estudiante = estudiante;
        this.libro = libro;
        this.fechaPrestamo = new Date();
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, 7);
        this.fechaDevolucion = c.getTime();
    }

    public void mostrarInfo() {
        System.out.println("Préstamo -> " + estudiante + " | Libro: " + libro);
        System.out.println("  Fecha de préstamo: " + fechaPrestamo);
        System.out.println("  Fecha de devolución: " + fechaDevolucion);
    }

    @Override
    public String toString() {
        return "Prestamo [" + estudiante + " - " + libro + "]";
    }
}
