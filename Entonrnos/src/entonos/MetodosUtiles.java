package entonos;

import java.util.Iterator;

public class MetodosUtiles {
	
	public static int Factorial(int numero) {
		int resultado = 1;
		for(int i = 1; i<= numero ; i++) {
			resultado = resultado *i; 
		}
		return resultado;
	}
	
	public static boolean esPrimo(int numero) {
		
		if(numero==0){
			return false;
		}
		
		for (int i = 2; i < numero; i++) {
			if(numero%i == 0) return false;
			
		}
		return true;
	}

	
	public static int numeroAleatoriEntre(int inicio, int fin) {
		/*PRIMERA FORMA*/
		//int aleatorio = (int)Math.floor(Math.random()*(fin-inicio)+inicio);
		
		//if(aleatorio%2 !=0) {
			//return aleatorio;
		//}
		//if(aleatorio == inicio) {
		//	return aleatorio + 1;
		//}
		//if(aleatorio == fin) {
			//return aleatorio - 1;
		//}
		//return aleatorio-1;
		
		/*Segunda forma*/
		
		int aleatorio = (int)Math.floor(Math.random()*(fin-inicio)+inicio);
		while(aleatorio%2 !=1) {
			aleatorio = (int)Math.floor(Math.random()*(fin-inicio)+inicio);
		}
		
		System.out.println(aleatorio);
		return aleatorio;
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
