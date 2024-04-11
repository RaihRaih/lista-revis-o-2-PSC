/*Escreva um código Java que calcula o desconto de um produto com base em seu valor original.*/

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Valor Original: ");
        double valorOriginal = scanner.nextDouble();
        
        System.out.println("Porcentagem do Desconto [%] : ");
        double porcentagem = scanner.nextDouble();
        
        double valorDesconto = valorOriginal * (porcentagem/100.00);
        
        double desconto = valorOriginal - valorDesconto;
        
        System.out.printf("Valor do produto após o Desconto: %.2f " , desconto);
    }
}
