package projeto_java;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CALCULADORA JAVA ===");

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("\nEscolha a operação:");
        System.out.println("1 - Soma (+)");
        System.out.println("2 - Subtração (-)");
        System.out.println("3 - Multiplicação (*)");
        System.out.println("4 - Divisão (/)");
        
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        double resultado;

        switch (opcao) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
                break;

            case 2:
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);
                break;

            case 3:
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);
                break;

            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: não é possível dividir por zero!");
                }
                break;

            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}