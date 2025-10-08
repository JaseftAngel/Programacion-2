import java.util.Scanner;

public class TestParqueo {
    public static void main(String[] args) {
        Parqueo parque = new Parqueo(10);

        parque.ingresar(new Vehiculo("1245axd", "Luis Jairo", 2, 5));
        parque.ingresar(new Vehiculo("3456pjb", "Marcia Lira", 9, 12));
        parque.ingresar(new Vehiculo("2576jux", "Pablo Rubio", 10, 12));

        System.out.println("Ingreso total: " + parque.calcularIngreso());
        System.out.println("Ingreso de los que estuvieron 3 horas: " + parque.calcularIngreso(3));
        parque.salida("1245axd");
    }
}