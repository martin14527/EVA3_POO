package eva3_5_excepciones;

public class EVA3_5_EXCEPCIONES {

    public static void main(String[] args) {

        try {
            System.out.println("La división es: " + division(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        System.out.println("Fin del programa");
    }

    public static int division(int x, int y) {

        if (y == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }

        return x / y;
    }
}