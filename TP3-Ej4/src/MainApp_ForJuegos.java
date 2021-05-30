import java.util.Random;
import java.util.Scanner;

public class MainApp_ForJuegos {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		Random r= new Random();
		
		int fichas1=0;
		int fichas2=0;
		int fichas3=0;
		int fichas4=0;
		int fichas5=0;
		int fichas6=0;
		int fichas7=0;
		int fichas8=0;
		
		int tiempo1=0;
		int tiempo2=0;
		int tiempo3=0;
		int tiempo4=0;
		int tiempo5=0;
		int tiempo6=0;
		int tiempo7=0;
		int tiempo8=0;
		
		int numJuego=0;
		int numFichas=0;
		int tiempo=0;
		int minimo=46;
		
		System.out.println("¿Cuantas veces se usaron los juegos?");
		int cantTotal= scan.nextInt();
		scan.nextLine();
		scan.close();
		
		for (int i=0; i<cantTotal; i++) {
			numJuego= r.nextInt(8)+1;
			numFichas= r.nextInt(5)+1;
			tiempo= r.nextInt(45)+1;
			
			if(tiempo<=minimo)
				minimo=tiempo;
			
			switch(numJuego) {
			case 1:
				fichas1= fichas1 + numFichas;
				tiempo1= tiempo1 + tiempo;
				break;
			case 2:
				fichas2= fichas2 + numFichas;
				tiempo2= tiempo2 + tiempo;
				break;
			case 3:
				fichas3= fichas3 + numFichas;
				tiempo3= tiempo3 + tiempo;
				break;
			case 4:
				fichas4= fichas4 + numFichas;
				tiempo4= tiempo4 + tiempo;
				break;
			case 5:
				fichas5= fichas5 + numFichas;
				tiempo5= tiempo5 + tiempo;
				break;
			case 6:
				fichas6= fichas6 + numFichas;
				tiempo6= tiempo6 + tiempo;
				break;
			case 7:
				fichas7= fichas7 + numFichas;
				tiempo7= tiempo7 + tiempo;
				break;
			case 8:
				fichas8= fichas8 + numFichas;
				tiempo8= tiempo8 + tiempo;
				break;
			}
		
		}
		
		System.out.println("En el Juego 1 usaron " + fichas1 + " fichas,  en un tiempo de " + tiempo1 +" minutos.");
		System.out.println("En el Juego 2 usaron " + fichas2 + " fichas, en un tiempo de " + tiempo2+" minutos.");
		System.out.println("En el Juego 3 usaron " + fichas3 + " fichas, en un tiempo de " + tiempo3+" minutos.");
		System.out.println("En el Juego 4 usaron " + fichas4 + " fichas, en un tiempo de " + tiempo4+" minutos.");
		System.out.println("En el Juego 5 usaron " + fichas5 + " fichas, en un tiempo de " + tiempo5+" minutos.");
		System.out.println("En el Juego 6 usaron " + fichas6 + " fichas, en un tiempo de " + tiempo6+" minutos.");
		System.out.println("En el Juego 7 usaron " + fichas7 + " fichas, en un tiempo de " + tiempo7+" minutos.");
		System.out.println("En el Juego 8 usaron " + fichas8 + " fichas, en un tiempo de " + tiempo8+" minutos.");
		
		System.out.println("El menor tiempo de juego fue de " + minimo+ " minutos.");
}
}
