import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o número da sua conta: ");
        int numeroConta = sc.nextInt();

        sc.nextLine();

        System.out.print("Por favor, digite o nome de sua agência: ");
        String agencia = sc.nextLine();

        System.out.print("Por favor, digite o seu nome: ");
        String nomeCliente = sc.nextLine();

        System.out.print("Por favor, digite o valor do seu salto: ");
        double saldo = sc.nextDouble();

        System.out.println();

        System.out.println(
                "Olá, " + nomeCliente + ". " +
                "Obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numeroConta + " e " +
                "seu saldo " + saldo + " já está disponível para saque."
        );

        sc.close();
    }
}
