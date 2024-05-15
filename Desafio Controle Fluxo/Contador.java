import java.util.Scanner;


public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo numero: ");
        int parametroDois = terminal.nextInt();

        try {
            ImprimirNumeros(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        } finally {
            terminal.close();
        }
    }

    public static void ImprimirNumeros(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O Segundo deve ser maior que o primeiro");
        }
        int varFor = parametroDois - parametroUm ;
        for (int i = 1; i <= varFor; i++) {
            System.out.println(i);
        }
    }
}
