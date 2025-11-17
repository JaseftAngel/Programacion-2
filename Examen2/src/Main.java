public class Main {
    public static void main(String[] args) {

        MiTeleferico m = new MiTeleferico();

        Linea roja = m.getLinea("Rojo");
        Linea amarillo = m.getLinea("Amarillo");
        Linea verde = m.getLinea("Verde");

        roja.agregarCabina(1);
        roja.agregarCabina(2);

        roja.agregarPersona(new Persona("Luis", 20, 60));
        roja.agregarPersona(new Persona("Ana", 30, 70));
        roja.agregarPersona(new Persona("Pedro", 65, 80));

        roja.agregarPersonaCabina(1);
        roja.agregarPersonaCabina(1);
        roja.agregarPersonaCabina(2);

        System.out.println("Ingreso Rojo: " + roja.calcularIngreso());

        amarillo.agregarCabina(1);
        amarillo.agregarCabina(2);
        amarillo.agregarCabina(3);
        amarillo.agregarCabina(4);

        amarillo.agregarPersona(new Persona("Joel", 20, 60));
        amarillo.agregarPersona(new Persona("Karen", 30, 70));
        amarillo.agregarPersona(new Persona("Daniela", 65, 80));
        amarillo.agregarPersona(new Persona("Simon", 20, 60));
        amarillo.agregarPersona(new Persona("David", 36, 67));
        amarillo.agregarPersona(new Persona("Samuel", 25, 89));

        amarillo.agregarPersonaCabina(1);
        amarillo.agregarPersonaCabina(1);
        amarillo.agregarPersonaCabina(1);
        amarillo.agregarPersonaCabina(1);
        amarillo.agregarPersonaCabina(1);

        System.out.println("Ingreso Amarillo: " + amarillo.calcularIngreso());

        m.lineaMayorIngreso();
    }
}
