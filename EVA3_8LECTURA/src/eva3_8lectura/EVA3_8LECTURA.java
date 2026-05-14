package eva3_8lectura;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.util.Scanner;

public class EVA3_8LECTURA {

    public static void main(String[] args) {
        String ruta = "C:\\ARCHIVOS\\prueba13.txt";

        readUsingFiles(ruta);

        try {
            readUsingFileReader(ruta);
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        }
    }

    public static void readUsingFiles(String ruta) {

        System.out.println("LECTURA DE ARCHIVOS USANDO FILES");

        try {

            Path path = Path.of(ruta);
            String cade = Files.readString(path);
            System.out.println(cade);

        } catch (IOException e) {

            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public static void readUsingFileReader(String ruta) throws FileNotFoundException {

        System.out.println("USAR FILEREADER");

        File source = new File(ruta);

        Scanner scanner = new Scanner(source);

        while (scanner.hasNextLine()) {

            String cade = scanner.nextLine();
            System.out.println(cade + "aaaaaaaaa");
        }

        scanner.close();
    }
}