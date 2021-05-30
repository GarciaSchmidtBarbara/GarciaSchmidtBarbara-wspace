
public class MainAppNumPrimos {

	public static void main(String[] args) {
				
		int num= (int)(Math.random()*100);
		int producto=num;
		
		while(num!=99) {
			if(esPrimo(num)) {
				producto=producto*num;
			}
			num= (int)(Math.random()*100);
		}
		
		System.out.println("El producto de los numeros primos es "+ producto);
	}

	
	
	private static boolean esPrimo(int num) {
		int contador=0;
		for(int i =1; i<=num; i++) {
			if((num % i) == 0 )
				contador++;
		}
		if((contador<=2)&&(contador!=1)) {
			System.err.println("El num "+num+" es primo");
			return true;
		}
		else {
			System.out.println("El num "+num+" no es primo");
			return false;
		}
	}

}
