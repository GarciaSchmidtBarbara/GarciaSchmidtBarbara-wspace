import java.util.Random;

public class MainApp {

	public static void main(String[] args) {
		Random random= new Random();
		double porcentajePerdido=0;
		
		//genero numeros entre 1 y 300 de forma random
		int panes= random.nextInt(300)+1;	
		System.out.println("Se cargaran "+panes+" panes.");
		
		
		if(panes>=200) 
			porcentajePerdido= 30;
		
		else 
			porcentajePerdido= 10;
		
		int cantPerdidos= (int)(porcentajePerdido*panes)/100;
		
		System.out.println("El porcentaje de la carga se perdió fue el "+porcentajePerdido+"% y la cantidad de panes caídos fue de "+cantPerdidos);
	}

}
