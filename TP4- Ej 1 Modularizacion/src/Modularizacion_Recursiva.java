import java.util.Random;

public class Modularizacion_Recursiva {

	public static void main(String[] args) {
		Random r= new Random();
		
		int num1 =r.nextInt(101);
		int num2 =r.nextInt(101);
		int num3 =r.nextInt(101);
		int num4 =r.nextInt(101);
		int num5 =r.nextInt(101);
		int num6 =r.nextInt(101);
		int num7 =r.nextInt(101);
		int num8 =r.nextInt(101);
		int num9 =r.nextInt(101);
		int num10 =r.nextInt(101);
		
		imprimirValores(num1,num2,num3,num4,num5,num6,num7,num8,num9,num10);
		
		System.out.println("El maximo entre:");
		System.out.println("\t Los dos primeros: " + maxEntre2(num1, num2));
		
		System.out.println("\t Los tres primeros: " +  maxEntre3(num1,num2,num3));
		
		
		System.out.println("\t Los cinco primeros: " +  maxEntre5(num1,num2,num3,num4,num5));
		
		
		System.out.println( "\t Entre Todos: " + maxEntre10(num1,num2,num3,num4,num5,num6,num7,num8,num9,num10));
		
	}

	
	private static void imprimirValores(int num1, int num2, int num3, int num4, int num5, int num6, int num7, int num8,
			int num9, int num10) {
		System.out.println("num 1\t num 2\t num 3\t num 4\t num 5\t num 6\t num 7\t num 8\t num 9\t num 10");
		System.err.println(num1 +"\t"+num2 +"\t"+num3 +" \t"+num4 +"\t"+num5 +"\t"+num6 +"\t"+num7 +"\t"+num8 +"\t"+num9 +"\t"+num10 );
		
	}


	private static int maxEntre10(int num1, int num2, int num3, int num4, int num5, int num6, int num7, int num8,
			int num9, int num10) {
		int max1= maxEntre5(num1,num2,num3,num4,num5);
		int max2= maxEntre5(num6,num7,num8,num9,num10);
		return maxEntre2(max1,max2);
	}


	private static int maxEntre5(int num1, int num2, int num3, int num4, int num5) {
		int max1= maxEntre2(num1, num2);
		int max2= maxEntre2(num3, num4);
		int max = maxEntre2(max1,max2);
		return maxEntre2(max,num5);
	}

	private static int maxEntre3(int num1, int num2, int num3) {
		int max= maxEntre2(num1,num2);
		return maxEntre2(max,num3);
	}

	private static int maxEntre2(int num1, int num2) {
		if(num1>num2)
			return num1;
		else
			return num2;
	}
	
	

}
