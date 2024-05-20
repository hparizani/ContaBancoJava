import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        String agencia, nomeCliente;
        double saldo = 1547.25;

        System.out.println("Por favor, digite o número da agência: ");
        agencia = scanner.next();
        System.out.println("Por favor, digite o número da conta: ");
        numero = scanner.nextInt();
        System.out.println("Por favor, digite o seu nome: ");
        nomeCliente = scanner.next();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");

        
    }
}
