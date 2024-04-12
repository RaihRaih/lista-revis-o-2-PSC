/*Escreva um código Java que lê a nota de um aluno e verifica se ele foi aprovado ou reprovado.*/

import java.util.Scanner;

public class Questao14{
  public static void main (String[]args){
	Scanner scanner = new Scanner (System.in);

	System.out.println ("Digite o valor da atividade: ");
	double valorAtividade = scanner.nextDouble();
	
	System.out.println ("Digite a nota: ");
	double nota = scanner.nextDouble();
	
	double aprovado = valorAtividade * 0.6f;
	System.out.printf("\nMédia: %.2f\n",aprovado);
	
		if (nota >= aprovado){
		    System.out.println ("Aluno: APROVADO! ");
 		}else{
 		    System.out.println ("Aluno: REPROVADO! ");
 		}

	scanner.close ();
  }
}
