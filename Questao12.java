/*Escreva um código Java que lê uma string e verifica se ela é um palíndromo.*/
import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
      System.out.println("Digite uma String:");
      String palavra = scanner.nextLine();
       
       //remover espaços em branco
       palavra = palavra.replaceAll("\\s+","").toLowerCase();//converte String para minúsculo 
       
      // Construindo a string invertida com um loop for
        String palindromo = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            palindromo += palavra.charAt(i);
        }
        
        if (palavra.equals(palindromo)){
            System.out.println("\n A palavra é um PALÍNDROMO!");
        }else{
             System.out.println("\n A palavra NÃO é um PALÍNDROMO!");
        }
        scanner.close();
        }
    }
