import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);        
        
        System.out.println("Por favor, digite o número da conta: ");
        String numeroConta = scanner.next();
        
        System.out.println("Por favor, digite o número da Agência: ");
        String numeroAgencia = scanner.next();

        System.out.println("Por favor, digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite seu sobrenome: ");
        String sobrenomeCliente = scanner.next();

        System.out.println("Quanto gostaria de sacar? ");
        double saldo = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println
        ("Olá " + nomeCliente + " " + sobrenomeCliente +  
        ", obrigado por criar uma conta em nosso banco, sua agência é "  
        + numeroAgencia + " conta " + numeroConta +
        " e seu saldo " + saldo + ", já está disponível para saque.");
        
        }
}

