/*Escreva um codigo Java que simula o jogo de pedra, papel e tesoura.*/

import java.util.Scanner;
import java.util.Random;

public class Questao11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] opcoes = {0, 1, 2}; // 0 - [PEDRA] . 1 - [PAPEL] . 2 - [TESOURA]

        int jogador = 0;

        while (jogador != -1) {
            System.out.println("VAMOS JOGAR: 0 - [PEDRA] . 1 - [PAPEL] . 2 - [TESOURA]: \nDigite [-1] para sair do jogo.");
            jogador = scanner.nextInt();

            if (jogador == -1) {
                break;
            }

            int computador = random.nextInt(3);
            System.out.println("Computador: " + computador);

            if (jogador == computador) {
                System.out.println("Empate!!");
            } else if ((jogador == 0 && computador == 2) || (jogador == 1 && computador == 0) || (jogador == 2 && computador == 1)) {
                System.out.println("Você ganhou!");
            } else {
                System.out.println("Você perdeu!");
            }
            System.out.println();
        }
    }
}
