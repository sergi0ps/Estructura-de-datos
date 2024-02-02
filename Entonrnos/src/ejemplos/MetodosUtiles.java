package ejemplos;

import java.util.Iterator;

public class MetodosUtiles {

	public static int factorial(int numero) {
		int resultado = 1;
		while(numero >= 1) {
			resultado = resultado * numero;
			numero--;
		}
		return resultado;
	}

	public static boolean esPrimo(int numero) {
		//VOY A CALCULAR EL RESTO DE DIVIDIR POR TODOS LOS NÚMEROS EXCEPTO 1 Y EL PROPIO NÚMERO
		//SI ALGUNO DE ELLOS TIENE RESTO CERO, YA NO ES PRIMO, PORQUE ESE NÚMERO SERÁ UN DIVISOR
		if (numero==0) {
			return false;
		}
		
		for (int i = 2; i < numero; i++) {
			if (numero%i == 0) {
				return false;
			}
		}
		return true;
	}


	public static int aleatorioEntreCeroYDiez() {
		int num = (int)Math.random()*10 + 20;
		return num;
	}

	public static int mcd(int num1, int num2) {
		if(num1 < num2) {
			int aux = num1;
			num1 = num2;
			num2 = aux;
		}
		for (int i = num1; i > 0; i--) {
			if(num1%i == 0 &&  num2%i == 0) {
				return i;
			}
		}
		return 0; 

	}

	public static int potencia(int base, int exponente) {

		if(exponente<0) {
			//ESTO ES PORQUE MI MÉTODO DEVUELVE UN ENTERO
			//SI QUISIERA HACERLO MÁS EXACTO, EL MÉTODO DEBERÍA SER FLOAT Y ESTE IF NO SERÍA CORRECTO
			return 0;
		}

		int resultado = 1;
		for (int i = 1; i <= exponente; i++) {
			resultado = resultado*base;
		}

		return resultado;
	}


	public static String invertir(String cadena) {
		//OPCION 1. USAR charAt para sacar los caracteres
		
		if(cadena == null) return null;
		
		String str = "";
		char[] letras = cadena.toCharArray();
		for (int i = letras.length-1; i >=0 ; i--) {
			str+=letras[i];
		}
		return str;		
	}
	
	public static int numeroAleatorioEntre(int inicio, int fin) {
		
		int aleatorio = (int) Math.random()*(fin-inicio)+inicio;
		if(aleatorio % 2 == 1) {
			return aleatorio;
		}
		return numeroAleatorioEntre(inicio, fin);
		
	}

public static int sumaDosNumeros(int num1, int num2) {
	return num1+num2;
}

public static boolean esPar(int num1) {
	if(num1%2 ==0 ) {
	return true;
}
	return false;
}



}


