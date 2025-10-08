import java.util.*;

class Parqueo {
    private List<Vehiculo> vehiculos = new ArrayList<>();
    private double tarifa;

    public Parqueo(double tarifa) { this.tarifa = tarifa; }

    public void ingresar(Vehiculo v) { vehiculos.add(v); }

    public double salida(String placa) {
        for (Vehiculo v : vehiculos) {
            if (v.getPlaca().equals(placa)) {
                double pago = v.getHoras() * tarifa;
                vehiculos.remove(v);
                System.out.println("Vehículo " + placa + " canceló: " + pago);
                return pago;
            }
        }
        return 0;
    }

    public double calcularIngreso() {
        double total = 0;
        for (Vehiculo v : vehiculos) {
            total += v.getHoras() * tarifa;
        }
        return total;
    }

    public double calcularIngreso(int horas) {
        double total = 0;
        for (Vehiculo v : vehiculos) {
            if (v.getHoras() == horas) {
                total += v.getHoras() * tarifa;
            }
        }
        return total;
    }
}