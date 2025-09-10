//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AlgebraVectorial a = new AlgebraVectorial(2, 3, 4);
        AlgebraVectorial b = new AlgebraVectorial(4, 6, 8);

        System.out.println("¿Perpendiculares? " + a.esPerpendicular(b));
        System.out.println("¿Paralelos? " + a.esParalelo(b));
        System.out.println("Proyección de a sobre b: " + a.proyeccion(b));
        System.out.println("Componente de a en b: " + a.componente(b));
    }
}