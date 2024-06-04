import java.util.Scanner; //importando a classe Scanner do pacote java.util,
// que nos permite ler entradas do usuário no console.
/**
 * A Calculadora realiza operações matemáticas entre números inteiros.
 * Leia atentamente a documentação desta classes
 * para desfrutar dos recursos oferecidos pelo autor.
 *
 * @author  Leticia Neves
 * @version 1.0
 * @since   3/6/24
 */

public class Calculadora {
    /**
     * Este método é utilizado para somar dois números inteiros.
     * @param numeroUm este é o primeiro parâmetro do método,
     * @param numeroDois este é o segundo parâmetro do método.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("Bem-vindo à calculadora Java!");

        while (continuar) {
            System.out.print("Digite o primeiro número: ");
            double numero1 = scanner.nextDouble();
            //solicita o primeiro numero

            System.out.print("Digite o segundo número: ");
            double numero2 = scanner.nextDouble();
            //solicita o segundo numero

            System.out.println("Escolha a operação desejada:");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");
            int escolha = scanner.nextInt();
            //solicita a escolha da operação

            double resultado = 0;
            switch (escolha) {
                case 1:
                    resultado = numero1 + numero2;
                    break;
                case 2:
                    resultado = numero1 - numero2;
                    break;
                case 3:
                    resultado = numero1 * numero2;
                    break;
                case 4:
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                    } else {
                        System.out.println("Erro: Divisão por zero!");
                        continuar = false;
                    }
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

            if (continuar) {
                System.out.println("Resultado: " + resultado);
            }
        }

        System.out.println("Obrigado por usar a calculadora Java!");
    }
}


