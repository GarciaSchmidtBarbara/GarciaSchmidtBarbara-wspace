import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double total=0;
		double max=0;
		double sueldo=0;
		
		for(int i=0 ; i<15; i++) {
			System.out.println("Ingrese el sueldo del mes "+ (i+1));
			sueldo = scan.nextDouble();
			total=total+sueldo;
			if(sueldo>max) max=sueldo;
		}
		scan.close();
		
		System.out.println("El promedio del sueldo es $" + sueldo/15);
		System.out.println("El sueldo mas alto fue de $" + max);
	}

}
