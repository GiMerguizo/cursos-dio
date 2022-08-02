package exercitando;

import java.util.Scanner;

public class Emprestimo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Valor do Empréstimo: R$");
        float valor = scan.nextFloat();
        System.out.println("Parcelas: ");
        int parcelas = scan.nextInt();

        System.out.println("Valor final: R$" + valorFinal(parcelas, valor));

        if (valorFinal(parcelas, valor) == 0){
            System.out.println("Quantidade de parcelas inválida! Tente novamente!");
        }

    }
    public static float duasParcelas(){
        return 1.5F;
    }
    public static float tresParcelas(){
        return 2.0F;
    }
    public static float valorFinal(int parcelas, float valor){
        switch (parcelas){
            case 1:
                return valor;
            case 2:
                return valor + valor * duasParcelas();
            case 3:
                return valor + valor * tresParcelas();
            default:
                return 0;
        }
    }
}
