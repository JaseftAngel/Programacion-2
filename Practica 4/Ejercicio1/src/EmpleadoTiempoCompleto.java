public class EmpleadoTiempoCompleto extends Empleado {
    private double salarioAnual;

    public EmpleadoTiempoCompleto(String nombre, double salarioAnual) {
        super(nombre);
        this.salarioAnual = salarioAnual;
    }

    @Override
    public double CalcularSalarioMensual() {
        return salarioAnual / 12;
    }

    @Override
    public String toString() {
        return "EmpleadoTiempoCompleto [nombre=" + getNombre() +
                ", salarioAnual=" + salarioAnual + "]";
    }
}