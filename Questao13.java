/*Escreva um cC3digo Java que lC* trC*s nC:meros e verifica qual C) o maior.*/

import java.util.Scanner;

public class Questao13{
  public static void main (String[]args){
	Scanner scanner = new Scanner (System.in);

	float[] numero = new float[3];
	float maiorNumero = Float.MIN_VALUE;// Inicializa com o menor valor possível para floats

	System.out.println ("Digite 3 numeros: ");
	for (int i = 0; i < numero.length; i++){
		numero[i] = scanner.nextFloat ();
		
		if (numero[i] > maiorNumero){
			maiorNumero = numero[i];
 		}
	}
	
	System.out.println ("Maior Numero: " + maiorNumero);
	scanner.close ();
  }
}
