import java.util.Scanner; //importando a classe Scanner do pacote java.util,
// que nos permite ler entradas do usuário no console.

public class Calculadora {
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


