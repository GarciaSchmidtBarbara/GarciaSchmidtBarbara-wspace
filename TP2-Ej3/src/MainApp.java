
public class MainApp {

	public static void main(String[] args) {
		double vec[]= new double[3];
		ingresarValoresReales(vec);
		imprimirValores(vec);
		
		System.out.println("La diferencia absoluta es: "+ calcularDiferenciaAbsoluta(vec));
		
	}

	private static void imprimirValores(double[] vec) {
		for(int i=0; i<3; i++) {
			System.out.print(vec[i]+", ");
		}		
	}

	private static double calcularDiferenciaAbsoluta(double[] vec) {
		double diferencia= vec[1] - calcularPromedio(vec);
			if (diferencia>=0)
				return diferencia;
			else
				return diferencia*(-1);
	}

	private static double calcularPromedio(double[] vec) {
		double suma=0;
		for(int i=0; i<3; i++) {
			suma= suma + vec[i];
		}
		return suma/3;
	}

	private static void ingresarValoresReales(double[] vec) {
		for(int i=0; i<3; i++) {
			vec[i]= Math.random()*1000;
		}
		
	}

}
