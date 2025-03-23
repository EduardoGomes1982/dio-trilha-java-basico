public class App {

    public static void main(String[] args) {

        Conta conta1 = new ContaCorrente(600, 200);
        System.out.println("Saldo inicial: " + conta1.consultarSaldo());
        System.out.println("Cheque especial: " + ((ContaCorrente) conta1).consultarChequeEspecial());
        conta1.sacar(700);
        System.out.println("Saldo após saque: " + conta1.consultarSaldo());
        System.out.println("Usando cheque especial: " + ((ContaCorrente) conta1).consultarChequeEspecial());
        System.out.println("Cheque especial: " + ((ContaCorrente) conta1).consultarChequeEspecial());
        conta1.depositar(800);
        System.out.println("Saldo após depósito: " + conta1.consultarSaldo());
        System.out.println("Usando cheque especial: " + ((ContaCorrente) conta1).verificarUsoChequeEspecial());
        conta1.pagarBoleto(100);
        System.out.println("Saldo após pagamento de boleto: " + conta1.consultarSaldo());
        System.out.println("Usando cheque especial: " + ((ContaCorrente) conta1).verificarUsoChequeEspecial());
        System.out.println("Cheque especial: " + ((ContaCorrente) conta1).consultarChequeEspecial());
        System.out.println("========================================================");
        Conta conta2 = new Poupanca(6000);
        System.out.println("Saldo inicial: " + conta2.consultarSaldo());
        conta2.sacar(700);
        System.out.println("Saldo após saque: " + conta2.consultarSaldo());
        conta2.depositar(800);
        System.out.println("Saldo após depósito: " + conta2.consultarSaldo());
        conta2.pagarBoleto(100);
        System.out.println("Saldo após pagamento de boleto: " + conta2.consultarSaldo());
    }
}
