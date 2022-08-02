package exercitando;

import java.util.Scanner;

public class Saudacoes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Que horas são?" );
        System.out.println("HORA: ");
        int hora = scan.nextInt();
        System.out.println("MINUTOS: ");
        int minutos = scan.nextInt();

        System.out.println("HORA: " + hora + "h" + minutos);
        if (hora < 0 || hora > 24){
            System.out.println("Horário iválido, tente novamente!");
        }
        else if (hora > 0 && hora < 6){
            System.out.println("Boa noite!");
        }
        else if (hora >= 6 && hora < 13){
            System.out.println("Bom dia!");
        }
        else if (hora >= 13 && hora < 18){
            System.out.println("Boa tarde!");
        }
        else if (hora >= 18){
            System.out.println("Boa noite!");
        }
        else {
            System.out.println("Algo deu errado, tente novamente. ");
        }
    }
}
