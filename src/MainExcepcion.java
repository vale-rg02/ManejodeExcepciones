import java.util.Scanner;

public class MainExcepcion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número:");
        double num = scanner.nextDouble();

        try {
            if (num < 0) {
                throw new NumeroNegativoExcepcion("No se puede calcular la raíz cuadrada de un número negativo.");
            } else {
                double raizCuad = Math.sqrt(num);
                System.out.println("La raíz cuadrada de " + num + " es " + raizCuad);
            }

        } catch (NumeroNegativoExcepcion e) {
            System.out.println(e.getMessage());
        }
    }
}
