import java.io.Serializable;

class Medico implements Serializable {
    int idMed;
    String nombreMed;
    String apellidoMed;
    int añosExperiencia;

    public Medico(int id, String nombre, String apellido, int exp) {
        this.idMed = id;
        this.nombreMed = nombre;
        this.apellidoMed = apellido;
        this.añosExperiencia = exp;
    }

    @Override
    public String toString() {
        return idMed + " - " + nombreMed + " " + apellidoMed +
                " (" + añosExperiencia + " años exp.)";
    }
}