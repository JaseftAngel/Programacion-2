public class MiTeleferico {

    private Linea lineas[] = new Linea[3];
    private int total = 0;

    public MiTeleferico() {
        lineas[total++] = new Linea("Rojo");
        lineas[total++] = new Linea("Amarillo");
        lineas[total++] = new Linea("Verde");
    }

    public Linea getLinea(String color) {
        for (int i = 0; i < total; i++)
            if (lineas[i].getColor().equalsIgnoreCase(color))
                return lineas[i];
        return null;
    }

    // LA D DE DAVO
    public void lineaMayorIngreso() {
        float mayor = -1;
        Linea mejor = null;

        for (int i = 0; i < total; i++) {
            float ingreso = lineas[i].calcularIngreso();
            if (ingreso > mayor) {
                mayor = ingreso;
                mejor = lineas[i];
            }
        }

        System.out.println("La línea con mayor ingreso (solo tarifa regular): " + mejor.getColor());
    }
}
