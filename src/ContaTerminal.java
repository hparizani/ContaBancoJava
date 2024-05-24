import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        String agencia, nomeCliente;
        double saldo = 1547.25, saldoAtual = 0, saque = 0.0, deposito = 0.0;
        int escolhaMenu = 0, escolhaSaque = 0, escolhaDeposito = 0;

        System.out.println("Por favor, digite o número da agência: ");
        agencia = scanner.next();
        System.out.println("Por favor, digite o número da conta: ");
        numero = scanner.nextInt();
        System.out.println("Por favor, digite o seu nome: ");
        nomeCliente = scanner.next();

        System.out.println("Olá " + nomeCliente + ", obrigado por confiar em nosso banco. Sua agência é: " + agencia + ", conta: " + numero + " e seu saldo é R$" + saldo + " disponível para saque.");

        System.out.println("Selecione uma opção digitando de 1 a 3:");
        System.out.println("1 - Saque");
        System.out.println("2 - Depósito");
        System.out.println("3 - Extrato");
        System.out.println("4 - Sair");

        escolhaMenu = getEscolha(scanner);

        if (escolhaMenu == 1) {
            saque = extractedValor(escolhaSaque, scanner); // Atribui o valor retornado pelo método a variável saque.
            saldoAtual = saldo - saque;
            System.out.println("Saque realizado com sucesso. Saldo atual: R$" + saldoAtual);
        } else if (escolhaMenu == 2) {
            deposito = extractedValor(escolhaDeposito, scanner); // Atribui o valor retornado pelo método a variável depósito.
            saldoAtual = saldo + deposito;
            System.out.println("Depósito realizado com sucesso. Saldo atual: R$" + saldoAtual);
        } else if (escolhaMenu == 3) {
            System.out.println("Extrato: ");
            System.out.println("Compra débito R$5,00 em Padaria luz do sol");
            System.out.println("Pagamento conta água 102,50");
            System.out.println("Saldo atual: R$" + saldo);
        }

    }

    public static int getEscolha(Scanner scanner) {
        int escolha;
        do {
            escolha = scanner.nextInt();
            if (escolha < 1 || escolha > 4) {
                System.out.println("Digitação inválida.");
            }
        } while (escolha < 1 || escolha > 4);
        return escolha;
    }

    public static double extractedValor(int escolhaValor, Scanner scanner) {
        System.out.println("Selecione o valor desejado digitando de 1 a 4:");
        System.out.println("1 - R$10,00");
        System.out.println("2 - R$20,00");
        System.out.println("3 - R$50,00");
        System.out.println("4 - R$100,00");

        escolhaValor = scanner.nextInt();

        if (escolhaValor == 1) {
            return 10.0;
        } else if (escolhaValor == 2) {
            return 20.0;
        } else if (escolhaValor == 3) {
            return 50.0;
        } else if (escolhaValor == 4) {
            return 100.0;
        } else {
            System.out.println("Opção inválida. Retornando valor zero.");
            return 0.0;
        }
    }
}
