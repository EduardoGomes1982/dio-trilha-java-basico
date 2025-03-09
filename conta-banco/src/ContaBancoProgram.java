import java.util.Locale;
import java.util.Scanner;

public class ContaBancoProgram {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();
        System.out.println("Entre com o número da conta: ");
        conta.setNumero(sc.nextInt());
        sc.nextLine();
        System.out.println("Entre com a agência: ");
        conta.setAgencia(sc.nextLine());
        System.out.println("Entre com o nome do cliente: ");
        conta.setNomeCliente(sc.nextLine());
        System.out.println("Entre com o saldo da conta: ");
        conta.setSaldo(sc.nextDouble());
        sc.nextLine();
        System.out.println();
        System.out.println("Dados da conta:");
        System.out.println("Conta " + conta.getNumero() + ", Agência " + conta.getAgencia() + ", Cliente: "
                + conta.getNomeCliente() + ", Saldo: $ " + conta.getSaldo());
        System.out.println();
        sc.close();
    }

}
