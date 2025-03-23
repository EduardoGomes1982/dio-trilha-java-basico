public abstract class Conta {

    protected double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado: R$" + valor);
    }

    public abstract void sacar(double valor);

    public void pagarBoleto(double valor) {
        sacar(valor);
        System.out.println("Boleto pago: R$" + valor);
    }

    public void transferir(Conta destino, double valor) {
        sacar(valor);
        destino.depositar(valor);
        System.out.println("Transferência realizada: R$" + valor);
    }

    public void aplicarRendimento(double taxa) {
        double rendimento = consultarSaldo() * taxa;
        depositar(rendimento);
        System.out.println("Rendimento monetizado: R$" + rendimento);
    }

}