
import java.util.Scanner;

public class Contador extends ParametrosInvalidosException {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Bem vindo a aplicação de contagem numerica! \nPara começarmos você deve passar dois parametros inteiros sendo o primeiro menor que o segundo ");
        System.out.println("Primeiro parametro: ");
        int parametroUm = scanner.nextInt();
        System.out.println("Segundo parametro: ");
        int parametroDois = scanner.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e + "\nO segundo parâmetro deve ser maior que o primeiro ");
        }


       

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();

        } else {

            for (int i = parametroUm; i <= parametroDois; i++) {
                System.out.println("Imprimindo o número: " + i);
            }

        }
    }

}
