import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
      
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

        String agencia, nomeCliente;
        int numeroConta;
        double saldo = 5000;
        

        System.out.printf("Por favor, digite o seu Nome: ");
            nomeCliente = teclado.next();
        System.out.printf("Por favor, digite o número da Agência: ");
            agencia = teclado.next();
        System.out.printf("Por favor, digite o número da Conta: ");
            numeroConta = teclado.nextInt();

        teclado.close();

        System.out.printf("Olá, %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque.", nomeCliente, agencia, numeroConta, saldo);
        
        


    }
}
