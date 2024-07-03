import java.util.Scanner;

public class VerificadorNumeroConta {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
   
        try {
            System.out.println("Digite o numero de sua conta bancaria: \r");
            String numeroConta = scanner.nextLine();
            verificarNumeroConta(numeroConta);
            System.out.println("Numero da conta valido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }finally{
            scanner.close();
        }
    }

// Declaração do método verificarNumeroConta, que verifica se o número de conta tem exatamente 8 dígitos:
    private static void verificarNumeroConta(String numeroConta) { 

        if(numeroConta.length() != 8){
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }
}

