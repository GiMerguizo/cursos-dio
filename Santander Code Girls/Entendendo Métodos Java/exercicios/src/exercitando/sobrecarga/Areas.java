package exercitando.sobrecarga;

import java.util.Scanner;

public class Areas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("-- Calculando a Área de um Quadrado --");
        System.out.println("Lado: ");
        int ladoQuadrado = scan.nextInt();
        System.out.println("Área = " + area(ladoQuadrado));

        System.out.println("-- Calculando a Área de um Retângulo --");
        System.out.println("Base: ");
        int baseRetangulo = scan.nextInt();
        System.out.println("Altura: ");
        int alturaRetangulo = scan.nextInt();
        System.out.println("Área = " + area(baseRetangulo, alturaRetangulo));

        System.out.println("-- Calculando a Área de um Trapézio --");
        System.out.println("Base menor: ");
        int baseMenorTrapezio = scan.nextInt();
        System.out.println("Base maior: ");
        int baseMaiorTrapezio = scan.nextInt();
        System.out.println("Altura: ");
        int alturaTrapezio = scan.nextInt();
        System.out.println("Área = " + area(baseMenorTrapezio, baseMaiorTrapezio, alturaTrapezio));
    }
    public static int area(int ladoQuadrado){
        return ladoQuadrado * ladoQuadrado;
    }
    public static int area(int baseRetangulo, int alturaRetangulo){
        return baseRetangulo * alturaRetangulo;
    }
    public static int area(int baseMenorTrapezio, int baseMaiorTrapezio, int alturaTrapezio){
        return ((baseMaiorTrapezio + baseMenorTrapezio) * alturaTrapezio) / 2;
    }
}
