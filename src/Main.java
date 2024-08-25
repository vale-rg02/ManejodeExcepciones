import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa una cadena de texto:");
        String lecturaTeclado = scanner.nextLine();

        try {
            char result = CaracterEn.caracterEn(lecturaTeclado, 7);
            System.out.println("El carácter en la posición 7 es: " + result);
        } catch (Exception e) {
            System.out.println("Has intentado recuperar una posicion de la cadena de caracteres que no existe.");
            System.out.println("Error: " + e.getMessage());
        }
    }
}