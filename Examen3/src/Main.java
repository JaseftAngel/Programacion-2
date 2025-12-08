public class Main {
    public static void main(String[] args) {

        Medico m1 = new Medico(1, "Juan", "Perez", 10);
        Medico m2 = new Medico(2, "Maria", "Lopez", 5);
        Medico m3 = new Medico(3, "Carlos", "Ramos", 8);

        Consultorio.guardarMedico(m1);
        Consultorio.guardarMedico(m2);
        Consultorio.guardarMedico(m3);

        Consultorio.guardarConsulta(new Consulta(111, "Ana", "Mendez", 12, 25, "diciembre", 2024)); // navidad
        Consultorio.guardarConsulta(new Consulta(222, "Luis", "Rocha", 2, 1, "enero", 2024)); // año nuevo
        Consultorio.guardarConsulta(new Consulta(333, "Mia", "Loza", 3, 5, "marzo", 2024));

        Consultorio.guardarConsulta(new Consulta(444, "Pedro", "Duran", 1, 6, "abril", 2024));
        Consultorio.guardarConsulta(new Consulta(555, "Sara", "Vega", 2, 15, "mayo", 2024));
        Consultorio.guardarConsulta(new Consulta(666, "Pablo", "Cruz", 3, 16, "junio", 2024));

        Consultorio.guardarConsulta(new Consulta(777, "Rene", "Toran", 1, 18, "julio", 2024));
        Consultorio.guardarConsulta(new Consulta(888, "Julia", "Zea", 2, 20, "agosto", 2024));
        Consultorio.guardarConsulta(new Consulta(999, "Marcos", "Flores", 3, 22, "septiembre", 2024));

        Consultorio.eliminarMedicoPorNombre("Maria", "Lopez");

        System.out.println("\nCONSULTAS ESPECIALES:");
        Consultorio.actualizarConsultasEspeciales();

        System.out.println("\nMEDICOS:");
        for (Medico m : Consultorio.leerMedicos()) {
            System.out.println(m);
        }

        System.out.println("\nCONSULTAS:");
        for (Consulta c : Consultorio.leerConsultas()) {
            System.out.println(c);
        }

        System.out.println("\nCONSULTORIOS COMPLETOS:");
        Consultorio c = new Consultorio();
        c.mostrarConsultorios();
    }
}
