package eva3_2_propagacion.de.excepciones;

public class EVA3_2_PROPAGACIONDEEXCEPCIONES {

    public static void main(String[] args) {
        a();
    }

    public static void a() {
        b();
    }

    public static void b() {
        c();
    }

    public static void c() {
        int x = 5, y = 0;
        int resultado;

        resultado = x / y;

        System.out.println(resultado);
    }
}