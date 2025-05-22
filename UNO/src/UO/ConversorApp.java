package UO;
import java.util.Scanner;

public class ConversorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cantidad en pesos:");
        double cantidad = sc.nextDouble();

        System.out.println("Convertir a (DOLAR, EURO, YEN):");
        String tipo = sc.next().toUpperCase();

        try {
            TipoMoneda moneda = TipoMoneda.valueOf(tipo);
            double resultado = moneda.convertir(cantidad);
            System.out.println("Resultado: " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println("Tipo de moneda no válido.");
        }
    }
}

