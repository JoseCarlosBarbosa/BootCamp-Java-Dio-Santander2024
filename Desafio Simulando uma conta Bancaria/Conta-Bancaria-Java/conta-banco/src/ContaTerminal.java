
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 

        System.out.println("Digite o Numero da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite sua Agencia: ");
        String angencia = scanner.next();

        System.out.println("Nome do Cliente: ");
        String nomeCliente = scanner.next();

        System.out.println("Saldo: ");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ angencia + 
        ", conta "+ numero +" e seu saldo de R$"+ saldo +" já está disponível para saque ");

    }
}
