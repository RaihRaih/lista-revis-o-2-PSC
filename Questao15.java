/*Escreva um código Java que lê o salário de um funcionário e calcula o seu imposto de renda.*/
import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();

        // Supondo uma alíquota fixa de 20%
        double aliquota = 0.20;
        double impostoRenda = salario * aliquota;

        System.out.println("O imposto de renda a ser pago é: " + impostoRenda);

        scanner.close();
    }
}
