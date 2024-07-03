import java.util.Scanner;

public class VerificacaoChequeEspecial {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
            //System.out.println("digite saldo");
            double saldo = scanner.nextDouble(); 
            double saque = scanner.nextDouble(); 
            double limiteChequeEspecial = 500; 
           
            // TODO: Verifique se o saque não ultrapassa o saldo disponível na conta:
            if(saque <= saldo){
                System.out.println("Transacao realizada com sucesso.");
            }else {
                double saldoComCheque = saldo + limiteChequeEspecial ;
                if(saque > saldoComCheque ){
                    System.out.println("Transacao não realizada. Limite do cheque especial excedido.");
                }else{
                    System.out.println("Transacao realizada com sucesso utilizando o cheque especial."); 
                }
            }
           scanner.close();
                }
          
    }

