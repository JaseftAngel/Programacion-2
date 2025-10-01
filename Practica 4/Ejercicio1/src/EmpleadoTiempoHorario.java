public class EmpleadoTiempoHorario extends Empleado {
    private double horasTrabajadas;
    private double tarifaHora;

    public EmpleadoTiempoHorario(String nombre, double horasTrabajadas, double tarifaHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }

    @Override
    public double CalcularSalarioMensual() {
        return horasTrabajadas * tarifaHora;
    }

    @Override
    public String toString() {
        return "EmpleadoTiempoHorario [nombre=" + getNombre() +
                ", horas=" + horasTrabajadas +
                ", tarifa=" + tarifaHora + "]";
    }
}