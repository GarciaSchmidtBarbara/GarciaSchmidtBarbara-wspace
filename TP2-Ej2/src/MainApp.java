import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Para calcular el área de un triángulo por favor ingrese el valor de la base");
		double base=scan.nextDouble();
		
		double altura= calcularAltura(base);
		
		System.out.println("El área del tringulo es: "+ calcularArea(base,altura));
		
		scan.close();
				
	}

	private static double calcularAltura(double base) {
		return base*base;
	}

	private static double calcularArea(double base, double altura) {
		return (base*altura)/2;
	}

}
