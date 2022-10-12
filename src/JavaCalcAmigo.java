import java.util.Scanner;

public class JavaCalcAmigo {
    public static void main(String[] args){
        // O mesmo scanner pode ser usado várias vezes.
        Scanner scanner = new Scanner(System.in);

        int primeiroNumero;
        int segundoNumero;
        int opcao = 0;
        double resultado = 0;

        // Se o usuário escolher a opção [5], sai do loop e finaliza o programa.
        while(opcao != 5) {
            System.out.println();
            System.out.println("*** CALCULADORA JAVA ***");

            System.out.print("Digite o primeiro número: ");
            primeiroNumero = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            segundoNumero = scanner.nextInt();

            System.out.println();
            System.out.println("*** OPÇÕES ***");
            System.out.println("[1] Soma (+)");
            System.out.println("[2] Subtração (-)");
            System.out.println("[3] Multiplicação (X)");
            System.out.println("[4] Divisão (/)");
            System.out.println("[5] Sair do programa.");
            System.out.print("Escolha a opção da operação desejada: ");
            // Porém, utilizando o mesmo scanner pra int e String, dá um bugzinho.
            // Então, usamos só para pegar int mesmo.
            opcao = scanner.nextInt();

            switch(opcao)
            {
                case 1 :
                    resultado = primeiroNumero + segundoNumero;
                    break;

                case 2 :
                    resultado = primeiroNumero - segundoNumero;
                    break;

                case 3 :
                    resultado = primeiroNumero * segundoNumero;
                    break;

                case 4 :
                    // Para funcionar a divisão corretamente.
                    resultado = (double) primeiroNumero / segundoNumero;
                    break;

                case 5 :
                    break;

                default :
                    System.out.println("Opção inválida, por favor, tente novamente.");
                    break;
            }

            if(opcao >= 1 && opcao <=4)
            {
                System.out.println("O resultado obtido foi: " + resultado);
            }
        }

        System.out.println("Até logo.");
    }
}
