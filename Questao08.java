/*Escreva um código Java que verifica se um número é par ou ímpar.*/

import java.util.Random;

public class Questao08 {
    public static void main(String[] args) {
        Random random = new Random();
        int numero = random.nextInt(50);
        
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }
    }
}
