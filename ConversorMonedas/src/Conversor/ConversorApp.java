package Conversor;

import java.util.Scanner;

public class ConversorApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe la cantidad en pesos: ");
		double cantidad = sc.nextDouble();
		
		System.out.println("Elige a que deseas convertir: (DOLAR, EURO, YEN");
		String tipo = sc.next().toUpperCase();
		
		try {
			TipoMoneda moneda = TipoMoneda.valueOf(tipo);
			double resultado = moneda.convertir(cantidad);
			System.out.println("Conversion: " + resultado);
		}catch(IllegalArgumentException e) {
			System.out.println("Tipo de moneda no valido.");
		}
		
		
		
		

	}

}
