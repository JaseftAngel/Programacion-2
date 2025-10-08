class TestNegocio {
    public static void main(String[] args) {
        Negocio[] negocios = new Negocio[4];
        negocios[0] = new Panaderia("San Jorge", 15000, "Sopocachi", 4, 500, "Integral");
        negocios[1] = new Panaderia("El Molino", 12000, "Miraflores", 3, 400, "Tradicional");
        negocios[2] = new Peluqueria("Elegance", 8000, "Centro", 5, "Cortes y tintes", 40);
        negocios[3] = new Salteñeria("Doña Chela", 10000, "Calacoto", 6, 350, 3);

        for (Negocio n : negocios) {
            System.out.println(n);
            if (n instanceof Panaderia) ((Panaderia) n).mostrarProduccion();
            else if (n instanceof Peluqueria) ((Peluqueria) n).mostrarServicios();
            else if (n instanceof Salteñeria) ((Salteñeria) n).mostrarVentas();
            System.out.println();
        }
    }
}