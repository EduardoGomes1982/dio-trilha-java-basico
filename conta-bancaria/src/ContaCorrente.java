public class ContaCorrente extends Conta {

    private double chequeEspecial;
    private double limiteChequeEspecial;

    public ContaCorrente(double saldoInicial, double limiteChequeEspecial) {
        super(saldoInicial);
        this.limiteChequeEspecial = limiteChequeEspecial;
        this.chequeEspecial = 0;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        if (saldo >= 0)
            chequeEspecial = 0;
        else
            chequeEspecial = -saldo;
        System.out.println("Depósito realizado: R$" + valor);
    }

    @Override
    public void sacar(double valor) {
        double saldoDisponivel = consultarSaldo() + consultarChequeEspecial();
        if (valor <= saldoDisponivel) {
            if (valor <= consultarSaldo()) {
                saldo -= valor;
            } else {
                double valorChequeEspecial = valor - consultarSaldo();
                chequeEspecial += valorChequeEspecial;
                saldo = -chequeEspecial;
            }
            System.out.println("Saque realizado: R$" + valor);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public double consultarChequeEspecial() {
        return limiteChequeEspecial - chequeEspecial;
    }

    public boolean verificarUsoChequeEspecial() {
        return chequeEspecial > 0;
    }

}
