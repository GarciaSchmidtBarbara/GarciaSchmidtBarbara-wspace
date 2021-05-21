import java.util.Random;

public class MainApp {

	public static void main(String[] args) {
		Random random= new Random();
		double montoRecaudado=0;
		int numeroMayor=0;					//patentes mayores a 1300000
		int cant= 1+ (int)(Math.random()*10);	//pongo hasta 100 patentes para que no sea extenso
		System.out.println("Se ingresan "+cant+" patentes");
		
		for(int i=0; i<cant; i++) {
			double impuesto=0;
			int patente= random.nextInt(9999999)+1;
			double valor= random.nextDouble()*2000000;
			
			if(patente<=1000000)
				impuesto= valor*1.5;
			else {
				if(patente<=2000000) {
					impuesto= valor*1.1;
				}
				else {
					impuesto=valor*1.15;
					if(patente>=1300000)
						numeroMayor++;
				}
			}
			
			System.out.println("El vehiculo de patente "+patente+" abona $"+impuesto);
			montoRecaudado=montoRecaudado+impuesto;
		}
		
		System.out.println("El monto recaudado por el Registro Automotor fue de $"+montoRecaudado);
		System.out.println("El "+ (numeroMayor*100)/cant +"% son autos de patentes mayores a 1300000");
	}

}
