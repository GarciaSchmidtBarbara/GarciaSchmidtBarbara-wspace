import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Ingrese los minutos de maquina utilizados:");
		int minutos= scan.nextInt();
		scan.nextLine();
		System.out.println("Ingrese los KB de memoria consumidos:");
		int kb= scan.nextInt();
		scan.nextLine();
		System.out.println("Ingrese la cantidad de hojas impresas:");
		int hojas= scan.nextInt();
		scan.nextLine();
		scan.close();
		
		double costo= calcularCosto(minutos,kb,hojas);
		System.out.println("El valor a abonar sera $"+ costo);
	}

	private static double calcularCosto(int minutos, int kb, int hojas) {
		return minutos*1.5 + kb*10 + hojas*15;
	}

}
