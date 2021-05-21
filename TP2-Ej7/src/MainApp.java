import java.util.Scanner;


public class MainApp {

	//genero un registro para los datos 
	static class Solicitud{
		int edad,experiencia;
		double sueldo;
	}
	
	public static void main(String[] args) {
		
		Solicitud ficha= new Solicitud();
		solicitarFicha(ficha);
		
		evaluarFicha(ficha);

	}
	
	

	private static void evaluarFicha(MainApp.Solicitud ficha) {
		String estado="Rechazado";
		
		if(cumpleEdad(ficha.edad)) {
			if(ficha.edad>=32) {
				if(ficha.experiencia>6) estado="Contratado.";
				else if (ficha.experiencia>3) estado="Condicional.";
			}
			else if(ficha.experiencia<3 && ficha.sueldo<50000) estado="Contratado";
		}
		
		System.out.println("El candidato fue "+ estado);
	}



	private static boolean cumpleEdad(int edad) {
		return edad>=18 && edad<=35;
	}



	private static void solicitarFicha(MainApp.Solicitud ficha) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Ingrese su edad: ");
		ficha.edad = scan.nextInt();
		scan.nextLine();
		System.out.println("Ingrese los años de experiencia en el puesto: ");
		ficha.experiencia = scan.nextInt();
		scan.nextLine();
		System.out.println("Ingrese el sueldo pretendido: ");
		ficha.sueldo = scan.nextDouble();
		scan.close();
	}

}
