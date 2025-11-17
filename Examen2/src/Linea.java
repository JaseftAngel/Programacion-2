public class Linea {

    private String color;
    private Persona filaPersonas[] = new Persona[50];
    private Cabina cabinas[] = new Cabina[20];

    private int totalFila = 0;
    private int totalCabinas = 0;

    public Linea(String color) {
        this.color = color;
    }

    public void agregarPersona(Persona p) {
        filaPersonas[totalFila++] = p;
    }

    public void agregarCabina(int nro) {
        cabinas[totalCabinas++] = new Cabina(nro);
    }

    // EL 1
    public boolean agregarPersonaCabina(int nroCabina) {

        if (totalFila == 0) return false;

        for (int i = 0; i < totalCabinas; i++) {

            if (cabinas[i].toString().contains("Cabina " + nroCabina)) {

                Persona p = filaPersonas[0];

                for (int j = 1; j < totalFila; j++)
                    filaPersonas[j - 1] = filaPersonas[j];

                totalFila--;

                return cabinas[i].agregarPersona(p);
            }
        }
        return false;
    }

    // C
    public float calcularIngreso() {
        float ingreso = 0;

        for (int i = 0; i < totalCabinas; i++) {

            Persona[] lista = cabinas[i].getPersonas();

            for (int j = 0; j < cabinas[i].getCantidadPersonas(); j++) {

                Persona p = lista[j];

                if (p.getEdad() < 25 || p.getEdad() > 60)
                    ingreso += 1.5f;
                else
                    ingreso += 3f;
            }
        }
        return ingreso;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Linea " + color;
    }
}
