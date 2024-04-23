import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String nome;
        String agencia;
        long conta;
        double saldo;

        System.out.print("\nPor favor, digite o seu nome:\n--> ");
        nome = scanner.next();

        System.out.print("\nPor favor, digite o número da agência:\n--> ");
        agencia = scanner.next();

        System.out.print("\nPor favor, digite o número da conta:\n--> ");
        conta = scanner.nextLong();

        System.out.print("\nPor favor, digite o saldo:\n--> ");
        saldo = scanner.nextDouble();

        System.out.println("\nOlá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo de R$ " + saldo + " já está disponível para saque.");

    }
}
