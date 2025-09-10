public class Main {
    public static void main(String[] args) {
        AlgebraVectorial av = new AlgebraVectorial(2,3,4, 1,-3,2);

        System.out.println("Suma: " + av.suma());
        System.out.println("Escalar* a: " + av.multiplicarEscalar(2));
        System.out.println("Longitud a: " + av.longitud('a'));
        System.out.println("Normal a: " + av.normal('a'));
        System.out.println("Prod. escalar: " + av.productoEscalar());
        System.out.println("Prod. vectorial: " + av.productoVectorial());
        System.out.println("¿Perpendiculares?: " + av.sonPerpendiculares());
        System.out.println("¿Paralelos?: " + av.sonParalelos());
        System.out.println("Proy a sobre b: " + av.proyeccion());
        System.out.println("Comp a en b: " + av.componente());
    }
}