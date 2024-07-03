import java.util.Scanner;

public class SimulacaoBancaria {

    
    public static boolean validadorEntrada(int opcao){
        if(opcao == 0){
            return false;
        }else return true;
    }

    public static double Deposito (double saldo, double valorDeposito){
        return saldo += valorDeposito;
    }
    public static boolean verificadorDeSaldo (double saldo, double valorSaque){
        if(valorSaque <= saldo ){
            return true;
        }else return false;
    }

    public static void Opcoes(){
        System.out.println("1. Depositar\r\n" + 
                                "2. Sacar\r\n" + 
                                "3. Consultar Saldo\r\n" + 
                                "0. Encerrar\r\n"+
                                "Escolha uma das opções: "
                                ); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0; 
        boolean validador = true;
        Opcoes();
        while (validador) { 
            
            int opcao = scanner.nextInt(); 

            
            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor a ser Depositado: ");
                    double valorDeposito = scanner.nextDouble();
                    saldo = Deposito(saldo,valorDeposito);
                    System.out.println("Saldo Atual: " + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor a ser Sacado: ");
                    double valorSaque = scanner.nextDouble();
                    boolean verificaSaldo = verificadorDeSaldo(saldo,valorSaque);
                    if(verificaSaldo){
                        saldo -= valorSaque;
                        System.out.println("Saldo Atual: " + saldo);
                    }else{
                        System.out.println("Saldo insuficiente");
                    }
                    break;
                case 3:
                    System.out.println("Saldo Atual: " + saldo);

                    break;
                case 0:
                    validador = validadorEntrada(opcao);
                    break;
                default:
                    System.out.println("Opção invalida - Error");
                    break;
            }        
            
        }

    } 
}