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
		
		for (int i = 2; i < numero; i++) {
			if(numero%i == 0) return false;
			
		}
		return true;
	}
	
	
	
	
}
