package exercitando;

import java.util.Scanner;

public class Operacoes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float num1, num2;
        System.out.println("Primeiro valor: ");
        num1 = scan.nextInt();
        System.out.println("Segundo valor: ");
        num2 = scan.nextInt();

        float soma = soma(num1, num2);
        float subtracao = subtracao(num1, num2);
        float divisao = divisao(num1, num2);
        float multiplicacao = multipilicacao(num1, num2);

        System.out.println("Soma = " + soma);
        System.out.println("Subtração = " + subtracao);
        System.out.println("Divisão = " + divisao);
        System.out.println("Multiplicação = " + multiplicacao);
    }
// Métodos
    public static float soma(float num1, float num2) {
        return num1 + num2;
    }
    public static float subtracao(float num1, float num2) {
        return num1 - num2;
    }
    public static float divisao(float num1, float num2) {
        return num1 / num2;
    }
    public static float multipilicacao(float num1, float num2) {
        return num1 * num2;
    }

}
