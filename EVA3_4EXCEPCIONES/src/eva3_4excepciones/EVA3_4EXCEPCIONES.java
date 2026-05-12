package eva3_4excepciones;

public class EVA3_4EXCEPCIONES {
//ser especifico ayuda a limitar las excepciones
    public static void main(String[] args) {

        int x = 5, y = 0;
        int resultado;
        String cade = null;

        try {

            resultado = x / y;
            System.out.println("Resultado: " + resultado);

            // Forzar NullPointerException para prueba
            System.out.println(cade.length());

        } catch (ArithmeticException error) {
            System.out.println("ERROR: Division entre 0");
            System.out.println("No se puede dividir entre cero");

        } catch (NullPointerException e) {
            System.out.println("ERROR Cadena nula");
            e.printStackTrace();
        }

        System.out.println("Fin del programa");
    }
} 